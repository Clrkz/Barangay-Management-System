/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barangaysystem;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
/**
 *
 * @author Admin
 */
public class Test extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;



    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
  //      lblDate.setText(dateFormat.format(date));
lblBusinessName.setHorizontalAlignment(SwingConstants.CENTER);
    }

    
    
    
    void meow(){
    conn=SqlConnectReports.ConnectDB();
         
          String getByDate = "SELECT `Audit Trail ID`, `Date`, `Time`, `User Name`, `Action Performed`, `Resident ID`, `User ID` FROM `audittrail`";
          try{
          pst=conn.prepareStatement(getByDate);
          rs=pst.executeQuery();
          while(rs.next()){
        //  tblList1.setModel(DbUtils.resultSetToTableModel(rs));
          }
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

        jLabel1 = new javax.swing.JLabel();
        test1232 = new barangaysystem.Test123();
        jLabel2 = new javax.swing.JLabel();
        test1233 = new barangaysystem.Test123();
        jButton1 = new javax.swing.JButton();
        pnlBusinessPermit = new javax.swing.JPanel();
        txtBrgyTreasurer3 = new javax.swing.JLabel();
        txtBrgySec3 = new javax.swing.JLabel();
        txtCommiteeCooperatives3 = new javax.swing.JLabel();
        txtCommiteeInfrastructure3 = new javax.swing.JLabel();
        txtCommiteeRules3 = new javax.swing.JLabel();
        txtCommiteeEnvironment3 = new javax.swing.JLabel();
        txtCommiteeHumanRights3 = new javax.swing.JLabel();
        txtCommiteeEducation3 = new javax.swing.JLabel();
        txtCommiteeAppropiation3 = new javax.swing.JLabel();
        txtBrgyChairman3 = new javax.swing.JLabel();
        lblBrgyCertChairmanNameSig2 = new javax.swing.JLabel();
        lblBusinessPermitName = new javax.swing.JLabel();
        lblBrgyCertAddressLot2 = new javax.swing.JLabel();
        lblBrgyCertAddressBlock2 = new javax.swing.JLabel();
        lblBusinessName = new javax.swing.JLabel();
        lblBusinessPermitAddressLot = new javax.swing.JLabel();
        lblBusinessPermitAddressLot2 = new javax.swing.JLabel();
        lblBusinessPermitAddressBlock = new javax.swing.JLabel();
        lblBusinessPermitAddressBlock1 = new javax.swing.JLabel();
        lblControlNo = new javax.swing.JLabel();
        lblORNo = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblBusinessPermitDate = new javax.swing.JLabel();
        lblBrgyCert2 = new javax.swing.JLabel();
        lblBrgyCertReqReason3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout test1232Layout = new javax.swing.GroupLayout(test1232);
        test1232.setLayout(test1232Layout);
        test1232Layout.setHorizontalGroup(
            test1232Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, test1232Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        test1232Layout.setVerticalGroup(
            test1232Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(test1232Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout test1233Layout = new javax.swing.GroupLayout(test1233);
        test1233.setLayout(test1233Layout);
        test1233Layout.setHorizontalGroup(
            test1233Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        test1233Layout.setVerticalGroup(
            test1233Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        pnlBusinessPermit.setBackground(new java.awt.Color(102, 102, 102));
        pnlBusinessPermit.setPreferredSize(new java.awt.Dimension(612, 792));
        pnlBusinessPermit.setLayout(null);

        txtBrgyTreasurer3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtBrgyTreasurer3);
        txtBrgyTreasurer3.setBounds(10, 740, 160, 30);

        txtBrgySec3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtBrgySec3);
        txtBrgySec3.setBounds(10, 700, 160, 20);

        txtCommiteeCooperatives3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtCommiteeCooperatives3);
        txtCommiteeCooperatives3.setBounds(10, 630, 160, 30);

        txtCommiteeInfrastructure3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtCommiteeInfrastructure3);
        txtCommiteeInfrastructure3.setBounds(10, 590, 160, 20);

        txtCommiteeRules3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtCommiteeRules3);
        txtCommiteeRules3.setBounds(10, 520, 160, 20);

        txtCommiteeEnvironment3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtCommiteeEnvironment3);
        txtCommiteeEnvironment3.setBounds(10, 450, 160, 30);

        txtCommiteeHumanRights3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtCommiteeHumanRights3);
        txtCommiteeHumanRights3.setBounds(10, 390, 160, 20);

        txtCommiteeEducation3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtCommiteeEducation3);
        txtCommiteeEducation3.setBounds(10, 320, 160, 30);

        txtCommiteeAppropiation3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtCommiteeAppropiation3);
        txtCommiteeAppropiation3.setBounds(10, 280, 160, 20);

        txtBrgyChairman3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        pnlBusinessPermit.add(txtBrgyChairman3);
        txtBrgyChairman3.setBounds(10, 230, 160, 20);

        lblBrgyCertChairmanNameSig2.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        lblBrgyCertChairmanNameSig2.setText("Hon.");
        pnlBusinessPermit.add(lblBrgyCertChairmanNameSig2);
        lblBrgyCertChairmanNameSig2.setBounds(210, 690, 190, 30);

        lblBusinessPermitName.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblBusinessPermitName.setText("CLARENCE ANDAYA");
        pnlBusinessPermit.add(lblBusinessPermitName);
        lblBusinessPermitName.setBounds(280, 340, 300, 30);

        lblBrgyCertAddressLot2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        pnlBusinessPermit.add(lblBrgyCertAddressLot2);
        lblBrgyCertAddressLot2.setBounds(540, 240, 70, 20);

        lblBrgyCertAddressBlock2.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        pnlBusinessPermit.add(lblBrgyCertAddressBlock2);
        lblBrgyCertAddressBlock2.setBounds(470, 240, 70, 20);

        lblBusinessName.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        lblBusinessName.setText("Business Name");
        pnlBusinessPermit.add(lblBusinessName);
        lblBusinessName.setBounds(200, 270, 390, 40);

        lblBusinessPermitAddressLot.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblBusinessPermitAddressLot.setText("Lot");
        pnlBusinessPermit.add(lblBusinessPermitAddressLot);
        lblBusinessPermitAddressLot.setBounds(330, 410, 40, 30);

        lblBusinessPermitAddressLot2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblBusinessPermitAddressLot2.setText("Lot");
        pnlBusinessPermit.add(lblBusinessPermitAddressLot2);
        lblBusinessPermitAddressLot2.setBounds(295, 410, 40, 30);

        lblBusinessPermitAddressBlock.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblBusinessPermitAddressBlock.setText("Block");
        pnlBusinessPermit.add(lblBusinessPermitAddressBlock);
        lblBusinessPermitAddressBlock.setBounds(250, 410, 40, 30);

        lblBusinessPermitAddressBlock1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblBusinessPermitAddressBlock1.setText("Block");
        pnlBusinessPermit.add(lblBusinessPermitAddressBlock1);
        lblBusinessPermitAddressBlock1.setBounds(200, 410, 50, 30);

        lblControlNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblControlNo.setText("_ _ _ _ _ _");
        pnlBusinessPermit.add(lblControlNo);
        lblControlNo.setBounds(520, 150, 90, 30);

        lblORNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblORNo.setText("orno.");
        pnlBusinessPermit.add(lblORNo);
        lblORNo.setBounds(270, 150, 170, 30);

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrice.setText("date");
        pnlBusinessPermit.add(lblPrice);
        lblPrice.setBounds(270, 180, 160, 30);

        lblBusinessPermitDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBusinessPermitDate.setText("date");
        pnlBusinessPermit.add(lblBusinessPermitDate);
        lblBusinessPermitDate.setBounds(270, 160, 160, 40);

        lblBrgyCert2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblBrgyCert2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barangaysystem/image/businessPermit.jpg"))); // NOI18N
        pnlBusinessPermit.add(lblBrgyCert2);
        lblBrgyCert2.setBounds(0, 0, 612, 792);

        lblBrgyCertReqReason3.setText("jLabel8");
        pnlBusinessPermit.add(lblBrgyCertReqReason3);
        lblBrgyCertReqReason3.setBounds(80, 50, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(test1232, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(test1233, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlBusinessPermit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(test1232, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(test1233, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(628, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlBusinessPermit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBrgyCert2;
    private javax.swing.JLabel lblBrgyCertAddressBlock2;
    private javax.swing.JLabel lblBrgyCertAddressLot2;
    private javax.swing.JLabel lblBrgyCertChairmanNameSig2;
    private javax.swing.JLabel lblBrgyCertReqReason3;
    private javax.swing.JLabel lblBusinessName;
    private javax.swing.JLabel lblBusinessPermitAddressBlock;
    private javax.swing.JLabel lblBusinessPermitAddressBlock1;
    private javax.swing.JLabel lblBusinessPermitAddressLot;
    private javax.swing.JLabel lblBusinessPermitAddressLot2;
    private javax.swing.JLabel lblBusinessPermitDate;
    private javax.swing.JLabel lblBusinessPermitName;
    private javax.swing.JLabel lblControlNo;
    private javax.swing.JLabel lblORNo;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JPanel pnlBusinessPermit;
    private barangaysystem.Test123 test1232;
    private barangaysystem.Test123 test1233;
    private javax.swing.JLabel txtBrgyChairman3;
    private javax.swing.JLabel txtBrgySec3;
    private javax.swing.JLabel txtBrgyTreasurer3;
    private javax.swing.JLabel txtCommiteeAppropiation3;
    private javax.swing.JLabel txtCommiteeCooperatives3;
    private javax.swing.JLabel txtCommiteeEducation3;
    private javax.swing.JLabel txtCommiteeEnvironment3;
    private javax.swing.JLabel txtCommiteeHumanRights3;
    private javax.swing.JLabel txtCommiteeInfrastructure3;
    private javax.swing.JLabel txtCommiteeRules3;
    // End of variables declaration//GEN-END:variables
}
