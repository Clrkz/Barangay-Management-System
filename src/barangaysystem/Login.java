/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barangaysystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public final class Login extends javax.swing.JFrame {
Connection conn=null; // Connection between mySQL at sa System
PreparedStatement pst=null; //Mag eexecute ng data ng mySql query
ResultSet rs=null; //Para makuha yung data from mySql
int attempts = 4; //Para sa login attempts
//==================================
    String fname = "";
    String lname = "";
    String username = "";
    String userType = "";
//==================================
String UserID = "";
String LoginAs = "";
String failedLoginAs = "";
String failedUserID = "";
String deniedLoginAs = "";
int deniedUserID;
int reportlevel = 0; //1. for no user 2. for denied user 3. exeisting user but failed login
    /**
     * Creates new form Main
     */
    public Login() {
        initComponents();
        txtAccountStatus.setVisible(false); 
        showDate(); // Class para sa Date
        showTime(); // Class para sa Time
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
        lblDate.setText("Date: " + s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        lblTime.setText("Time: " + s.format(d));
            }
            
        }
        ).start();
    }

    void report(){
        Connection con=null;
        con=SqlConnectReports.ConnectDB();
        String report = "INSERT INTO `audittrail`(`Date`, `Time`, `User Name`, `Action Performed`, `User ID`, `AuditTrailType`) VALUES (?,?,?,?,?,?)";
            Date d = new Date();        
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat c = new SimpleDateFormat("hh:mm:ss");
            String date = (s.format(d));
            String time = (c.format(d));
    try{
            pst=con.prepareStatement(report);
            pst.setString(1, date);
            pst.setString(2, time);
            if(reportlevel==1){//wroking
            pst.setString(3, "Unknown User: "+ txtUsername.getText());
            pst.setString(4, "LOGIN FAILED");
            pst.setString(5, "");
            }else if(reportlevel==2){//working
            pst.setString(3, deniedLoginAs);
            pst.setString(4, "DENIED USER LOGIN");
            String getDeniedID = String.valueOf(deniedUserID);
            pst.setString(5, getDeniedID);
            //pst.setString(5, "");
            }else if(reportlevel==3){
            pst.setString(3, failedLoginAs);
            pst.setString(4, "LOGIN FAILED");
            pst.setString(5, failedUserID);
            //pst.setString(5, "");
            }else{//working
            pst.setString(3, LoginAs);
            pst.setString(4, "LOGIN");
            pst.setString(5, UserID);
            //pst.setString(5, "");
            }
            pst.setString(6, "Logs");
            pst.executeUpdate();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
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

        jPanel1 = new javax.swing.JPanel();
        sprtrDateTime = new javax.swing.JSeparator();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        cmdCancel = new javax.swing.JButton();
        cmdLogin = new javax.swing.JButton();
        txtAccountStatus = new javax.swing.JTextField();
        lblBackround = new javax.swing.JLabel();
        txtWew = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Barangay Records System: Login");
        setMaximumSize(new java.awt.Dimension(860, 500));
        setResizable(false);

        jPanel1.setLayout(null);
        jPanel1.add(sprtrDateTime);
        sprtrDateTime.setBounds(10, 450, 210, 20);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 102, 255));
        lblTime.setText("Time");
        jPanel1.add(lblTime);
        lblTime.setBounds(20, 450, 210, 30);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 102, 255));
        lblDate.setText("Date");
        jPanel1.add(lblDate);
        lblDate.setBounds(20, 420, 210, 30);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 420, 210, 60);

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setText("Username:");
        jPanel1.add(lblUsername);
        lblUsername.setBounds(540, 340, 70, 30);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPassword.setText(" Password:");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(540, 380, 70, 30);

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtPassword);
        txtPassword.setBounds(620, 380, 180, 30);

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtUsername);
        txtUsername.setBounds(620, 340, 180, 30);

        cmdCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCancel.setText("Cancel");
        cmdCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCancel);
        cmdCancel.setBounds(720, 420, 80, 40);

        cmdLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLogin);
        cmdLogin.setBounds(620, 420, 80, 40);

        txtAccountStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountStatusActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountStatus);
        txtAccountStatus.setBounds(490, 290, 30, 20);

        lblBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barangaysystem/image/LoginUI.jpg"))); // NOI18N
        jPanel1.add(lblBackround);
        lblBackround.setBounds(0, 0, 860, 500);

        txtWew.setText("jLabel1");
        jPanel1.add(txtWew);
        txtWew.setBounds(320, 50, 34, 14);

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 70, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelActionPerformed
// TODO add your handling code here:        
System.exit(0); // exit pag na press si Cancel button from Login
    }//GEN-LAST:event_cmdCancelActionPerformed

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
    
        if (txtUsername.getText().equals("") || txtPassword.getText().equals("")){  //Check ling may value ba si TextBox Username at Password
                JOptionPane.showMessageDialog(null,"Type your Username and Password","Barangay System",JOptionPane.ERROR_MESSAGE);
            }else{
            conn=MySqlConnect.ConnectDB();
        String onetimelogin="Select * from onetimelogin where status='notUsed' and username=? and password=?";
   try{
            pst=conn.prepareStatement(onetimelogin);
            pst.setString(1,txtUsername.getText());
            pst.setString(2,txtPassword.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"You're Login as One Time Login\nCreate an Admin Account.","Barangay System",JOptionPane.INFORMATION_MESSAGE);
                String onetimeloginUser = "One Time Login";
                AddAdmin ob = new AddAdmin();
                ob.lblLoginAs.setText(onetimeloginUser);
                ob.setVisible(true);
                this.dispose();
            }else{
            String users = txtUsername.getText();
            String granted = "Granted";
            String denied = "Denied";
            // Mga mySQL Queries
            String Sql="Select * from users where archive='No' and username=? and password=?";
            String active = "UPDATE `users` SET `AccountStatus`='"+granted+"' WHERE username ='"+users+"' ";
            String deactive = "UPDATE `users` SET `AccountStatus`='"+denied+"' WHERE username ='"+users+"' ";
            String sql2 = "SELECT UserID,fname,lname,username,AccountStatus FROM users where archive='No' and username=?";
            String FLUT = "SELECT UserID,fname,lname,username,userType FROM users WHERE username ='"+users+"' ";
            String failedLogin = "SELECT UserID,fname,lname FROM users WHERE username ='"+users+"' ";
            try{
        pst=conn.prepareStatement(sql2); // kukunin nya yung query ng sql2
        pst.setString(1, txtUsername.getText()); //magseset ng Text sa txtUsername
        rs = pst.executeQuery(); //eexecute ang diniclared na sql2 query
            if(rs.next()){ 
                while(attempts!=0){
                deniedUserID = Integer.valueOf(rs.getString(1));
                deniedLoginAs = rs.getString(2)+" "+rs.getString(3);
                txtAccountStatus.setText(rs.getString(5));
                if(txtAccountStatus.getText().equals("Denied")){
             JOptionPane.showMessageDialog(null,"Your Account was Disabled, Contact your Administrator","Barangay System",JOptionPane.ERROR_MESSAGE);
             //JOptionPane kung ang user ay block na
             reportlevel=2;
             report();
                System.exit(0);
                }else{
             try{
            pst=conn.prepareStatement(Sql);
            pst.setString(1,txtUsername.getText());
            pst.setString(2,txtPassword.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                pst=conn.prepareStatement(FLUT);
                rs = pst.executeQuery();
                
                 if(rs.next()){
                UserID = (rs.getString(1));
                fname = (rs.getString(2));
                lname = (rs.getString(3));
                username = (rs.getString(4));
                userType = (rs.getString(5));
                pst=conn.prepareStatement(active);
                pst.executeUpdate();
                conn.close();
                LoginAs =  fname + " " + lname;
                Main ob = new Main();
                ob.lblLoginAs.setText(LoginAs);
                ob.lblUserID.setText(UserID);
                ob.lblUsername.setText(username);
                ob.lblUserType.setText(userType);
                ob.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null,"Welcome! " + userType + ", "+ fname + " " + lname + ".","Login Successful",JOptionPane.INFORMATION_MESSAGE);
                reportlevel = 0;
                report();
            }
            }else{
                //for user exist but wrong login
                try{
                conn=MySqlConnect.ConnectDB();
                pst = conn.prepareStatement(failedLogin);
                rs = pst.executeQuery();
                while(rs.next()){
                failedUserID = rs.getString(1);
                failedLoginAs = rs.getString(2)+" "+rs.getString(3);
                reportlevel=3;
                report();
                }
                }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                attempts--;
                JOptionPane.showMessageDialog(null,"Invalid Login, " + attempts + " Attempts Left","Barangay System",JOptionPane.ERROR_MESSAGE);
                if(attempts==0){
                JOptionPane.showMessageDialog(null, "Your account was Disabled, Contact your Administrator. System Exiting...","Barangay System",JOptionPane.ERROR_MESSAGE);
                //JOptionPane kung ang user ay mabablock palang dahil sa attempts
                try{
            pst=conn.prepareStatement(deactive);
            pst.executeUpdate();
            System.exit(0);
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
                }
                conn.close();
            }return;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Can't Connect, Contact your Administrator","Barangay System",JOptionPane.ERROR_MESSAGE);
        }
            }
             }
            }else{
                attempts--;
                // for user does not exist
                    reportlevel=1;
                    report();
                JOptionPane.showMessageDialog(null,"Invalid Login, " + attempts + " Attempts Left","Barangay System",JOptionPane.ERROR_MESSAGE);
            }if (attempts==0){
                JOptionPane.showMessageDialog(null, "You Have No Attempts Left, System Exiting...","Barangay System",JOptionPane.INFORMATION_MESSAGE);
            try{
            pst=conn.prepareStatement(deactive);
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Your account was Disabled, Contact your Administrator","Barangay System 2",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            //JOptionPane.showMessageDialog(null,"Can't Connect, Check your Internet","Invalid",JOptionPane.ERROR_MESSAGE);
        }
        }
        }catch(Exception e){
         //   JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "Can't Connect, Contact your Administrator","Barangay System",JOptionPane.ERROR_MESSAGE);
         }
            
            
        }//end of no value check
            }catch(Exception e)   {
                    //JOptionPane.showMessageDialog(null, e);
                    JOptionPane.showMessageDialog(null, "Can't Connect, Contact your Administrator","Barangay System",JOptionPane.ERROR_MESSAGE);
            }
    }//end of else of no value check
            
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void txtAccountStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountStatusActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCancel;
    private javax.swing.JButton cmdLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackround;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator sprtrDateTime;
    private javax.swing.JTextField txtAccountStatus;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel txtWew;
    // End of variables declaration//GEN-END:variables
}
