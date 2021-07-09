/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CoNFiG
 */
public class Admin1 extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    

    /**
     * Creates new form Admin
     */
    public Admin1() throws ClassNotFoundException {
        initComponents();
        try{
        String sql = "select * from admin";
       
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","");
            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = { rs.getString("id"),rs.getString("name"),rs.getString("location"),rs.getString("password")};
                tm.addRow(o);
            }
            con.close();
         }
        catch(SQLException e){
            Logger.getLogger(Admin1.class.getName()).log(Level.SEVERE,null,e);
        }
//        show_admin();
/*        table2();
        table3();
        table4();
        table5();
        table6();
  */      
    }
    
    private void table2() throws ClassNotFoundException {
       try{
        String sql = "select * from admin";
       
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","");
            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = { rs.getString("id"),rs.getString("name"),rs.getString("location"),rs.getString("password")};
                tm.addRow(o);
            }
         }
        catch(SQLException e){
            Logger.getLogger(Admin1.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void table3() throws ClassNotFoundException {
        String sql = "select * from customer";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","");
            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = { rs.getString("id"),rs.getString("name"),rs.getString("location"),rs.getString("password")};
                tm.addRow(o);
            }
         }
        catch(SQLException e){
            Logger.getLogger(Admin1.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void table4() throws ClassNotFoundException {
        String sql = "select * from STB";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","");
            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = { rs.getString("id"),rs.getString("name"),rs.getString("location"),rs.getString("password")};
                tm.addRow(o);
            }
         }
        catch(SQLException e){
            Logger.getLogger(Admin1.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void table5() throws ClassNotFoundException {
        String sql = "select * from package";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","");
            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = { rs.getString("id"),rs.getString("name"),rs.getString("location"),rs.getString("password")};
                tm.addRow(o);
            }
         }
        catch(SQLException e){
            Logger.getLogger(Admin1.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    private void table6() throws ClassNotFoundException {
        String sql = "select * from bill";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","");
            PreparedStatement pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            DefaultTableModel tm = (DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = { rs.getString("id"),rs.getString("name"),rs.getString("location"),rs.getString("password")};
                tm.addRow(o);
            }
         }
        catch(SQLException e){
            Logger.getLogger(Admin1.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
//    public ArrayList<User> userlist(){
//        ArrayList<User> userslist = new ArrayList<>();
//         try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproject", "root", "");
//            String sql1 ="select * from admin";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(sql1);
//            User user;
//            while(rs.next()){
//                user = new User(rs.getInt("admin_id"),rs.getString("admin_name"),rs.getString("location"));
//                userslist.add(user);
//            }
//    }
//         catch(Exception e){
//             JOptionPane.showMessageDialog(null, e);
//         }
//         return userslist;
//    }
//    public void show_admin(){
//        ArrayList<User> list = userlist();
//        DefaultTableModel model =(DefaultTableModel)jTable2.getModel();
//        Object[] row = new Object[3];
//        for(int i=0;i<list.size();i++){
//            row[0]=list.get(i).getadmin_id();
//            row[1]=list.get(i).getadmin_name();
//            row[2]=list.get(i).getlocation();
//            model.addRow(row);
//        }
//    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar4.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar5.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar5.add(jMenu8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin ID", "Name", "Location", "Password"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane2.addTab("Admin", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Customer Name", "Phone Number", "Email ID", "Address"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane2.addTab("Customer", jScrollPane3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "STB Type", "Price", "Purchase Date", "Add Date"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jTabbedPane2.addTab("SetUpBox", jScrollPane4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package ID", "Package Name", "Package cost"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jTabbedPane2.addTab("Package", jScrollPane5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill ID", "Cost", "Pay Date"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jTabbedPane2.addTab("Bill", jScrollPane6);

        jMenu9.setText("File");

        jMenu11.setText("jMenu11");
        jMenu9.add(jMenu11);

        jMenu12.setText("jMenu12");
        jMenu9.add(jMenu12);

        jMenu13.setText("jMenu13");
        jMenu9.add(jMenu13);

        jMenu14.setText("Exit");
        jMenu9.add(jMenu14);

        jMenuBar6.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar6.add(jMenu10);

        setJMenuBar(jMenuBar6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(944, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseClicked

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
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Admin1().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Admin1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
