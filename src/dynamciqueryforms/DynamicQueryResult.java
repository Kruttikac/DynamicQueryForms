/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamciqueryforms;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elcot
 */
public class DynamicQueryResult extends javax.swing.JFrame {

    /**
     * Creates new form DynamicQueryResult
     */
    String name;
    DBConnection dbn=new DBConnection();
    Statement st=dbn.stt;
    int count=0;
    String tablename;
    
    public DynamicQueryResult(String na) {
        initComponents();
        name=na;
        addTableName();
    }
    
    public final void addTableName()
    {
        try
        {
            ResultSet rs=st.executeQuery("select * from TableDetails");
            while(rs.next())
            {
                String tablename=rs.getString(1);
                jComboBox1.addItem(tablename);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Search Dynamic query result");

        jLabel2.setText("Choose Table Name:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->" }));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Display"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Condition"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(615, 200));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel4);

        jButton2.setText("Search Query Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<--Go Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                          
        tablename=jComboBox1.getSelectedItem().toString();
        
        final String seleted=tablename;
        jPanel2.removeAll();               
        jPanel2.setVisible(false);
        jPanel2.setVisible(true);
        
        jPanel3.removeAll();               
        jPanel3.setVisible(false);
        jPanel3.setVisible(true);
        
        try
        {
            ResultSet rs=st.executeQuery("select * from TableDetails where TableName='"+seleted+"'");
            if(rs.next())
            { 
                String ctrl1=rs.getString(2);                
                String sp[]=ctrl1.split("@");
                final String sp1[]=new String[sp.length];
                
                int txtcount=0,butcount=0, labelcount=0;
                for(int i=0;i<sp.length;i++)
                {
                    sp1[i]=sp[i];
                    String ct[]=sp[i].split("#");
                    String ctrlname=ct[0];
                    String ctrl=ct[1];
                    if(ctrl.equals("TextBox"))
                    {                        
                        txtcount++;
                        labelcount++;
                    }
                    if(ctrl.equals("Button"))
                    {
                        butcount++;
                    }
                }
                count=txtcount;
                JCheckBox jc[]=new JCheckBox[txtcount];
                JCheckBox jc1[]=new JCheckBox[txtcount]; 
                JComboBox jb[]=new JComboBox[txtcount];
                JTextField txt[]=new JTextField[txtcount];
                
                int cou=0;
                int x1=10,y1=30;
                for(int i=0;i<sp.length;i++)
                {
                    String ct[]=sp[i].split("#");
                    String ctrlname=ct[0];
                    String ctrl=ct[1];
                    if(ctrl.equals("TextBox"))
                    {                                                
                        jc[cou]=new JCheckBox();
                        jc[cou].setBounds(x1,y1,100,30);
                        jc[cou].setText(ctrlname);
                        
                        jc1[cou]=new JCheckBox();
                        jc1[cou].setBounds(x1,y1,100,30);
                        jc1[cou].setText(ctrlname);
                        
                        jb[cou]=new JComboBox();
                        jb[cou].setBounds(x1+120,y1,60,30);
                        jb[cou].addItem("=");
                        jb[cou].addItem("<=");
                        jb[cou].addItem(">=");
                        jb[cou].addItem("<");
                        jb[cou].addItem(">");
                        
                        txt[cou]=new JTextField();
                        txt[cou].setBounds(x1+200,y1,100,30);                        
                        
                        y1=y1+40;
                        jPanel2.add(jc[cou]);
                        jPanel3.add(jc1[cou]);
                        jPanel3.add(jb[cou]);
                        jPanel3.add(txt[cou]);
                        cou++;
                    }
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
                    //Query Construction
        try
        {
        
        DefaultTableModel dm=(DefaultTableModel)jTable2.getModel();        
        Vector colval=new Vector();
        
        String colname="Select ";
        for( int i=0; i<jPanel2.getComponentCount(); i++ ) 
        {            
            JCheckBox jc = (JCheckBox)jPanel2.getComponent(i);
            if(jc.isSelected() == true) 
            {
                String columns = jc.getText();
                colval.add(columns);
                System.out.println("Columns in jpanel2: "+columns);
                colname=colname+columns+", ";
            }
        }
        System.out.println("colval is: "+colval);
        dm.setColumnIdentifiers(colval);
        String forcol=colname.substring(0,colname.lastIndexOf(','));
        String q1=forcol+" from "+tablename+" where ";
                
        for( int i=0; i<jPanel3.getComponentCount(); i++ ) 
        {            
            String componentname=jPanel3.getComponent(i).getClass().getName();
            //System.out.println(i+" Component Name: "+componentname);
            if(componentname.equals("javax.swing.JCheckBox"))
            {
                JCheckBox jc1 = (JCheckBox)jPanel3.getComponent(i);
                JComboBox jcb=(JComboBox)jPanel3.getComponent(i+1);
                JTextField txt=(JTextField)jPanel3.getComponent(i+2);
                if( jc1.isSelected() ) 
                {
                    String columns = jc1.getText();
                    System.out.println("Columns in jPanel3: "+columns);
                
                    String condi=jcb.getSelectedItem().toString();
                    System.out.println("Condition in jPanel3: "+condi);
                
                    String text=txt.getText();
                    System.out.println("Text in jPanel3: "+text);
                    q1=q1+columns+condi+"'"+text+"' and ";
                }
            }
        }
        String query=q1.substring(0,q1.lastIndexOf('a'));
        System.out.println("query is: "+query.trim());
        
                        //Find Best Less Eq Condition
        
        try
        {
            ResultSet rs=st.executeQuery(query.trim());
            int cou=0;
            while(rs.next())
            {                
                System.out.println("Here");
                cou=1;
                DefaultTableModel dm1=(DefaultTableModel)jTable2.getModel();
                Vector v=new Vector();
                for(int i=0;i<colval.size();i++)
                {
                    String s=rs.getString(i+1);
                    v.add(s);                    
                }
                dm1.addRow(v);
            }
            if(cou!=1)
            {
                JOptionPane.showMessageDialog(new JFrame(),"No Results Found Here!");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedIndex(0);
        DefaultTableModel dm=(DefaultTableModel)jTable2.getModel();
        dm.setRowCount(0);
        dm.setColumnCount(0);
        
        jPanel2.removeAll();               
        jPanel2.setVisible(false);
        jPanel2.setVisible(true);
        
        jPanel3.removeAll();               
        jPanel3.setVisible(false);
        jPanel3.setVisible(true);
        
        /*jPanel4.removeAll();               
        jPanel4.setVisible(false);
        jPanel4.setVisible(true);*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(DynamicQueryResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DynamicQueryResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DynamicQueryResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DynamicQueryResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DynamicQueryResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
