package osproject;


import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.text.BadLocationException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anurag
 */
public class Terminal extends javax.swing.JInternalFrame {
    String[] s=new String[5];
    String path=new String();
    int caretpos;
    int count;
    /**
     * Creates new form Terminal
     */
    public Terminal(int cnt) {
        initComponents();
        path="C:/Users/anura";
        ta1.append("VIT SHELL:~>");
        caretpos=12;
        count=cnt;
        addInternalFrameListener(new InternalFrameAdapter(){
            public void internalFrameClosed(InternalFrameEvent e) {
                System.out.print("hello");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Terminal");
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeiconified(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        ta1.setBackground(new java.awt.Color(0, 0, 205));
        ta1.setColumns(20);
        ta1.setForeground(new java.awt.Color(255, 255, 255));
        ta1.setRows(5);
        ta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ta1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ta1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ta1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta1KeyPressed
        // TODO add your handling code here:
        int caretpos1 = ta1.getCaretPosition();
        System.out.println(caretpos+" "+caretpos1);
        if(caretpos1>=caretpos)
        {
            if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && caretpos1==caretpos) {
                evt.consume();
               // System.out.println(caretpos+"*"+caretpos1);
                ta1.setEditable(false);
            }
            else
                ta1.setEditable(true);
        }
        else
           ta1.setEditable(false); 
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.consume();
            /*String str=ta.getText();
            str=str.substring(str.lastIndexOf('>')+1);
            if(str.length()>1)
                ta.append("\n"+str);
            ta.append("\n"+"anurag-PC>");
   //        int caretpos = ta.getCaretPosition();
     //      ta.moveCaretPosition(caretpos);*/
            caretpos = ta1.getCaretPosition();
            //System.out.println("Enter "+caretpos+" "+caretpos1);
            try {
                int linenum=ta1.getLineOfOffset(caretpos);
                int initial=ta1.getLineStartOffset(linenum);
                ta1.select(initial, caretpos);
                String str=ta1.getSelectedText();
                ta1.select(caretpos,caretpos);
                str=str.substring(str.lastIndexOf('>')+1);
                //caretpos=caretpos+15;
                //System.out.println("Ent "+caretpos+" "+caretpos1);
                if(str.length()>0)
                {
                    
                    s=str.split(" ");
                    //System.out.println(s[0].equals("cd"));
                    
                   
                    if(s[0].equals("cd"))
                    {
                        //System.out.println("cd");
                        if(s.length>1){
                            if(s[1].equals("..")){
                                System.out.println("Path = "+path);
                                if(path.equals("C:/Users/anura"))
                                {
                                    ta1.append("\n"+"anurag-PC:~>");
                                }
                                else
                                {
                                    path=path.substring(0,path.lastIndexOf("/"));
                                    if("C:/Users/anura".equals(path))
                                    {
                                        ta1.append("\n"+"anurag-PC:~>");
                                    }
                                    else
                                    {
                                        ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">"); //because length of "C:/Users/anura/" is 15
                                    }
                                }
                            }
                            else  {  
                                String p=path;
                                p= p.concat("/");
                                p=p.concat(s[1]);
                                if(s.length>2)
                                    p=p.concat(" "+s[2]);
                                //ta.append("\n"+p);
                                File folder = new File(p);
                                //System.out.println(p+" "+folder.exists());
                                if(folder.exists())
                                {
                                    path=p;
                                    ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                                }
                                else
                                {
                                    ta1.append("\n"+"No such file or directory");
                                    if("C:/Users/anura".equals(path))
                                    {
                                        ta1.append("\n"+"anurag-PC:~>");
                                    }
                                    else
                                    {
                                        ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                                    }
                                }
                            }
                            
                        }
                        else
                        {
                            ta1.append("\n"+"Invalid syntax");
                            if("C:/Users/anura".equals(path))
                                {
                                    ta1.append("\n"+"anurag-PC:~>");
                                }
                                else
                                {
                                    ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                                }
                        }
                    }
                    else if(s[0].equals("ls"))
                    {
                       // System.out.println("ls");
                        File folder = new File(path);
                        File[] listOfFiles = folder.listFiles();
                        if(listOfFiles.length>0){
                        for (int i = 0; i < listOfFiles.length; i++) {
                            if(listOfFiles[i].isFile())
                                ta1.append("\n"+"file"+" "+listOfFiles[i].getName());
                            else if(listOfFiles[i].isDirectory())
                                ta1.append("\n"+"directory"+" "+listOfFiles[i].getName()); 
                        }
                        }
                        else
                        {
                            ta1.append("\n"+"No file or directory");
                        }
                        if("C:/Users/anura".equals(path))
                        {
                            ta1.append("\n"+"anurag-PC:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                        }
                    }
                    else if(s[0].equals("pwd"))
                    {
                        
                        ta1.append("\n"+path);
                        if("C:/Users/anura".equals(path))
                        {
                            ta1.append("\n"+"anurag-PC:~>");
                        }
                        else
                        {
                            ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                        }
                    }
                    else if(s[0].equals("Notepad"))
                    {
                        
                        if(s.length>1){
                            String p=path;
                            p=p.concat("/");
                            p=p.concat(s[1]);
                            
                            try {
                               // Home h=new Home();
                                //h.openNotepad(p);
                                Home.openNotepad(p);
                            } catch (IOException | PropertyVetoException ex) {
                                Logger.getLogger(Terminal.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            //cp.show();
                            //System.out.println("terminal");
                            
                            //cp.show();
                            //System.out.println("terminal");
                            
                        
                        }
                        else{
                            //Home h=new Home();
                              // h.openNotepad("");
                            Home.openNotepad("");
                        }
                        if("C:/Users/anura".equals(path))
                            {
                                ta1.append("\n"+"anurag-PC:~>");
                            }
                            else
                            {
                                ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                            }
                    }
                    
                    else{
                        ta1.append("\n"+"Invalid syntax");
                            if("C:/Users/anura".equals(path))
                                {
                                    ta1.append("\n"+"anurag-PC:~>");
                                }
                                else
                                {
                                    ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                                }
                    }
                
                
                }
                else{
                    if("C:/Users/anura".equals(path))
                                {
                                    ta1.append("\n"+"anurag-PC:~>");
                                }
                                else
                                {
                                    ta1.append("\n"+"anurag-PC:~"+path.substring(15)+">");
                                }
                }
            } 
            catch (BadLocationException | IOException | PropertyVetoException ex) {
                Logger.getLogger(Terminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            caretpos = ta1.getText().length();
            System.out.println("caret = "+caretpos);
           }
    }//GEN-LAST:event_ta1KeyPressed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        System.out.println("Removed!!!!!!!");
        Home.processList.removeItem("Terminal");
        Home.ter[count]=null;
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        for(int j=0;j<10;j++){
                System.out.println(j+" value of i");
                if(Home.cal[j]!=null){
                    
                    try {
                        Home.cal[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                if(Home.np[j]!=null){
                    try {
                            Home.np[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(Home.sc[j]!=null){
                    try {
                            Home.sc[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(Home.ter[j]!=null&&j!=count){
                    try {
                            Home.ter[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        
    }//GEN-LAST:event_formInternalFrameDeiconified


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}
