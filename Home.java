/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class Home extends javax.swing.JFrame {

    static Calculator cal[] = new Calculator[10];
    static Notepad np[] = new Notepad[10];
    static Scheduling sc[] = new Scheduling[10];
    static Terminal ter[] = new Terminal[10];
    
    public Home() {
        this.setUndecorated(true);
        currentTime();
        currentDate();
        initComponents();
        for(int i=0;i<10;i++){
            cal[i]=null;
            np[i]=null;
            sc[i]=null;
            ter[i]=null;
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filemanage = new javax.swing.JFileChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        processList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OperatingSystem");
        setName("OperatingSystem"); // NOI18N
        setSize(new java.awt.Dimension(266, 777));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/osproject/Notepad.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/osproject/Calculator-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/osproject/Xcode.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/osproject/file.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/osproject/terminal-512.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/osproject/power.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        time.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));

        date.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        processList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processListActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(time, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(date, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(processList, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 617, Short.MAX_VALUE)
                        .addComponent(processList, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(512, 512, 512)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1255, 1255, 1255))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(processList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static void schedulingFunction(char op, int index) throws PropertyVetoException{
        
            for(int i=0;i<10;i++){
                System.out.println(i+" value of i");
                if(cal[i]!=null){
                    
                            cal[i].setIcon(true);
                    
                }
                if(np[i]!=null){
                    try {
                            np[i].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(sc[i]!=null){
                    try {
                            sc[i].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(ter[i]!=null){
                    try {
                            ter[i].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            switch(op){
                case 'c':
                            try {
                                cal[index].setIcon(false);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                          break;
                case 't':
                            try {
                                ter[index].setIcon(false);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                          break;
                case 's':
                            try {
                                sc[index].setIcon(false);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                          break;
                case 'n':
                            try {
                                np[index].setIcon(false);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                          break;
            
            }
        
    }
            
            
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i;
        for(i=0;i<10;i++)
            if(np[i]==null)
                break;
        if(i<10){
            
            
           
            for(int j=0;j<10;j++){
                System.out.println(j+" value of i");
                if(cal[j]!=null){
                    
                    try {
                        cal[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                if(np[j]!=null){
                    try {
                            np[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(sc[j]!=null){
                    try {
                            sc[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(ter[j]!=null){
                    try {
                            ter[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            np[i] = new Notepad(i);
            jDesktopPane1.add(np[i]);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = np[i].getSize();
            np[i].setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
            np[i].show();
            processList.addItem("Notepad");
            
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int i;
        for(i=0;i<10;i++)
            if(cal[i]==null)
                break;
        if(i<10){
            
            /*for(int j=0;j<10;j++){
                if(cal[j]!=null)
                    try {
                        cal[j].setIcon(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }*/
        
            
            
            for(int j=0;j<10;j++){
                System.out.println(j+" value of i");
                if(cal[j]!=null){
                    
                    try {
                        cal[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                if(np[j]!=null){
                    try {
                            np[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(sc[j]!=null){
                    try {
                            sc[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(ter[j]!=null){
                    try {
                            ter[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            cal[i] = new Calculator(i);
            jDesktopPane1.add(cal[i]);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = cal[i].getSize();
            cal[i].setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
            cal[i].show();
            processList.addItem("Calculator");
        }
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        /*Scheduling sc = new Scheduling();
        jDesktopPane1.add(sc);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = sc.getSize();
        sc.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
        (desktopSize.height- jInternalFrameSize.height)/2);
        sc.show();
        processList.addItem("Scheduling");*/
        int i;
        for(i=0;i<10;i++)
            if(sc[i]==null)
                break;
        if(i<10){
            
            
            for(int j=0;j<10;j++){
                System.out.println(j+" value of i");
                if(cal[j]!=null){
                    
                    try {
                        cal[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                if(np[j]!=null){
                    try {
                            np[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(sc[j]!=null){
                    try {
                            sc[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(ter[j]!=null){
                    try {
                            ter[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            sc[i] = new Scheduling(i);
            jDesktopPane1.add(sc[i]);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = sc[i].getSize();
            sc[i].setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
            sc[i].show();
            processList.addItem("Scheduling");
            
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        processList.addItem("File Manager");
        filemanage.setDialogTitle("Open File");
        int returnVal = filemanage.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = filemanage.getSelectedFile();
            String s=file.getName();
            if(s.substring(s.lastIndexOf('.')+1).equals("txt"))
            {
                int i;
                for(i=0;i<10;i++)
                    if(np[i]==null)
                        break;
                if(i<10){
                    np[i] = new Notepad(i);
                    jDesktopPane1.add(np[i]);
                    np[i].show();
                    try {
                        np[i].appendtota(file.getAbsolutePath());
                    } catch (IOException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    for(int j=0;j<10;j++){
                        //System.out.println(j+" value of i");
                        if(cal[j]!=null){

                            try {
                                cal[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                        if(np[j]!=null&&j!=i){
                            try {
                                    np[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(sc[j]!=null){
                            try {
                                    sc[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(ter[j]!=null){
                            try {
                                    ter[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    processList.addItem("Notepad");

                    
                }
            }
                
        }
        processList.removeItem("File Manager");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        /*Terminal ter = new Terminal();
        jDesktopPane1.add(ter);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension jInternalFrameSize = ter.getSize();
        ter.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
        (desktopSize.height- jInternalFrameSize.height)/2);
        ter.show();
        processList.addItem("Terminal");*/
        int i;
        for(i=0;i<10;i++)
            if(ter[i]==null)
                break;
        if(i<10){
            
            
            for(int j=0;j<10;j++){
                System.out.println(j+" value of i");
                if(cal[j]!=null){
                    
                    try {
                        cal[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                if(np[j]!=null){
                    try {
                            np[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(sc[j]!=null){
                    try {
                            sc[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(ter[j]!=null&&j!=i){
                    try {
                            ter[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            ter[i] = new Terminal(i);
            jDesktopPane1.add(ter[i]);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = ter[i].getSize();
            ter[i].setLocation((desktopSize.width - jInternalFrameSize.width)/2,
            (desktopSize.height- jInternalFrameSize.height)/2);
            ter[i].show();
            processList.addItem("Terminal");
            
            
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void processListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processListActionPerformed
        
    }//GEN-LAST:event_processListActionPerformed
    
    static void openNotepad(String s) throws IOException, PropertyVetoException{
        
        int i;
        for(i=0;i<10;i++)
            if(np[i]==null)
                break;
        if(i<10){
            np[i] = new Notepad(i);
            jDesktopPane1.add(np[i]);
            np[i].show();
            for(int j=0;j<10;j++){
                        //System.out.println(j+" value of i");
                        if(cal[j]!=null){

                            try {
                                cal[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                        if(np[j]!=null&&j!=i){
                            try {
                                    np[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(sc[j]!=null){
                            try {
                                    sc[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(ter[j]!=null){
                            try {
                                    ter[j].setIcon(true);
                            } catch (PropertyVetoException ex) {
                                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
           
            
            if(!s.equals("")) {
                np[i].appendtota(s);
            }
            processList.addItem("Notepad");
        }
    }
    
    public static void currentTime(){
        ActionListener actiondate = (ActionEvent ae) -> {
            //hrow new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            java.util.Date mydate = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            time.setText(s.format(mydate));
        }; //   @Override
        //    @SuppressWarnings("empty-statement")
        
        new javax.swing.Timer(1000, actiondate).start();
    }
    public static void currentDate(){
        ActionListener actiondate = (ActionEvent ae) -> {
            Date d = new Date();
            
            SimpleDateFormat s = new SimpleDateFormat("dd MMMM yyyy EEEEEEEEE");
            //   System.out.println(s.format(d));
            date.setText(s.format(d));
        };
        new javax.swing.Timer(1000,actiondate ).start(); 
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel date;
    private javax.swing.JFileChooser filemanage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private static javax.swing.JDesktopPane jDesktopPane1;
    public static javax.swing.JComboBox<String> processList;
    private static javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
