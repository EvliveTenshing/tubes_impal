/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.UIManager;
import sistem_rental_mobil_oo_impal.model.Pegawai;
import sistem_rental_mobil_oo_impal.model.Penyewa;
import sistem_rental_mobil_oo_impal.model.Supplier;
import sistem_rental_mobil_oo_impal.panels.Dashboard;
import sistem_rental_mobil_oo_impal.panels.LihatPenyewa;
import sistem_rental_mobil_oo_impal.panels.LihatSupplier;
import sistem_rental_mobil_oo_impal.panels.ManageMobil;
import sistem_rental_mobil_oo_impal.panels.PermintaanMobil;
import sistem_rental_mobil_oo_impal.panels.Profile;

/**
 *
 * @author Evlive
 */
public class PegawaiInterface extends javax.swing.JFrame {
    Driver driver;
    GridBagLayout layout = new GridBagLayout();
    Profile profile;
    ManageMobil manageMobil;
    Dashboard dashboard;
    LihatPenyewa lihatPenyewa;
    LihatSupplier lihatSupplier;
    
    /**
     * Creates new form Supplier
     */
    public PegawaiInterface() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        driver = new Driver();
        
        dashboard  = new Dashboard();
        DynamicPane.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        DynamicPane.add(dashboard, c);
        
        profile = new Profile();
        DynamicPane.setLayout(layout);
        c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        DynamicPane.add(profile, c);
        
        manageMobil = new ManageMobil();
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPane.add(manageMobil, c);
        
        lihatPenyewa = new LihatPenyewa();
        c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        DynamicPane.add(lihatPenyewa, c);
        
        dashboard.setVisible(true);
        profile.setVisible(false);
        manageMobil.setVisible(false);
        lihatPenyewa.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        myProfileButton = new javax.swing.JButton();
        manageTransaksiButton = new javax.swing.JButton();
        manageMobilButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lihatPenyewaButton = new javax.swing.JButton();
        lihatSupplierButton = new javax.swing.JButton();
        lihatLaporanRekening = new javax.swing.JButton();
        DynamicPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Evlive.DESKTOP-TSUD57U\\Documents\\NetBeansProjects\\Sistem_Rental_Mobil_OO_Impal\\img\\logo2.png")); // NOI18N

        myProfileButton.setBackground(new java.awt.Color(0, 102, 255));
        myProfileButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        myProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        myProfileButton.setText("My Profile");
        myProfileButton.setBorder(null);
        myProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileButtonActionPerformed(evt);
            }
        });

        manageTransaksiButton.setBackground(new java.awt.Color(0, 102, 255));
        manageTransaksiButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        manageTransaksiButton.setForeground(new java.awt.Color(255, 255, 255));
        manageTransaksiButton.setText("Manage Transaksi");
        manageTransaksiButton.setBorder(null);
        manageTransaksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTransaksiButtonActionPerformed(evt);
            }
        });

        manageMobilButton.setBackground(new java.awt.Color(0, 102, 255));
        manageMobilButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        manageMobilButton.setForeground(new java.awt.Color(255, 255, 255));
        manageMobilButton.setText("Manage Mobil");
        manageMobilButton.setBorder(null);
        manageMobilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMobilButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 102, 255));
        logoutButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pegawai");

        lihatPenyewaButton.setBackground(new java.awt.Color(0, 102, 255));
        lihatPenyewaButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lihatPenyewaButton.setForeground(new java.awt.Color(255, 255, 255));
        lihatPenyewaButton.setText("Lihat Penyewa");
        lihatPenyewaButton.setBorder(null);
        lihatPenyewaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatPenyewaButtonActionPerformed(evt);
            }
        });

        lihatSupplierButton.setBackground(new java.awt.Color(0, 102, 255));
        lihatSupplierButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lihatSupplierButton.setForeground(new java.awt.Color(255, 255, 255));
        lihatSupplierButton.setText("Lihat Supplier");
        lihatSupplierButton.setBorder(null);
        lihatSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatSupplierButtonActionPerformed(evt);
            }
        });

        lihatLaporanRekening.setBackground(new java.awt.Color(0, 102, 255));
        lihatLaporanRekening.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lihatLaporanRekening.setForeground(new java.awt.Color(255, 255, 255));
        lihatLaporanRekening.setText("Lihat Laporan Rekening");
        lihatLaporanRekening.setBorder(null);
        lihatLaporanRekening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatLaporanRekeningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageTransaksiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageMobilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)))
                .addGap(28, 28, 28))
            .addComponent(lihatPenyewaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lihatSupplierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lihatLaporanRekening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(myProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageTransaksiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageMobilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lihatPenyewaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lihatSupplierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lihatLaporanRekening, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        DynamicPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DynamicPaneLayout = new javax.swing.GroupLayout(DynamicPane);
        DynamicPane.setLayout(DynamicPaneLayout);
        DynamicPaneLayout.setHorizontalGroup(
            DynamicPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        DynamicPaneLayout.setVerticalGroup(
            DynamicPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DynamicPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DynamicPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileButtonActionPerformed
        if ("pegawai".equals(driver.getUserLevel())) {
            Pegawai pegawai = driver.getPegawaiByEmail(driver.getUserEmail());
            driver.setUserNama(pegawai.getNama());
            driver.setUserAlamat(pegawai.getAlamat());
            driver.setUserContact(pegawai.getContact());
        } else if ("supplier".equals(driver.getUserLevel())) {
            Supplier supplier = driver.getSupplierByEmail(driver.getUserEmail());
            driver.setUserNama(supplier.getNama());
            driver.setUserAlamat(supplier.getAlamat());
            driver.setUserContact(supplier.getContact());
        } else if ("penyewa".equals(driver.getUserLevel())) {
            Penyewa penyewa = driver.getPenyewaByEmail(driver.getUserEmail());
            driver.setUserNama(penyewa.getNama());
            driver.setUserAlamat(penyewa.getAlamat());
            driver.setUserContact(penyewa.getContact());
        }
        profile.getDriver().setUserEmail(driver.getUserEmail());
        profile.getDriver().setUserNama(driver.getUserNama());
        profile.getDriver().setUserContact(driver.getUserContact());
        profile.getDriver().setUserLevel(driver.getUserLevel());
        profile.getDriver().setUserAlamat(driver.getUserAlamat());
        profile.setEmail(driver.getUserEmail());
        profile.setNama(driver.getUserNama());
        profile.setAlamat(driver.getUserAlamat());
        profile.setContact(driver.getUserContact());
        profile.setLevel(driver.getUserLevel());
        profile.setVisible(true);
        dashboard.setVisible(false);
        manageMobil.setVisible(false);
        lihatPenyewa.setVisible(false);
        lihatSupplier.setVisible(false);        
    }//GEN-LAST:event_myProfileButtonActionPerformed

    private void manageTransaksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTransaksiButtonActionPerformed

    }//GEN-LAST:event_manageTransaksiButtonActionPerformed

    private void manageMobilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMobilButtonActionPerformed
        manageMobil.deleteListInTable();
        manageMobil.getDriver().setUserEmail(driver.getUserEmail());
        manageMobil.getDriver().setUserNama(driver.getUserNama());
        manageMobil.getDriver().setUserLevel(driver.getUserLevel());
        manageMobil.loadMobil();
        profile.setVisible(false);
        dashboard.setVisible(false);        
        manageMobil.setVisible(true);
        lihatPenyewa.setVisible(false);
        lihatSupplier.setVisible(false);
    }//GEN-LAST:event_manageMobilButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        Login login = new Login();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void lihatPenyewaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatPenyewaButtonActionPerformed
        lihatPenyewa.loadPenyewa();
        profile.setVisible(false);
        dashboard.setVisible(false);        
        manageMobil.setVisible(false);
        lihatPenyewa.setVisible(true);
        lihatSupplier.setVisible(false);
    }//GEN-LAST:event_lihatPenyewaButtonActionPerformed

    private void lihatSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatSupplierButtonActionPerformed
        lihatSupplier.loadSupplier();
        profile.setVisible(false);
        dashboard.setVisible(false);        
        manageMobil.setVisible(false);
        lihatPenyewa.setVisible(false);
        lihatSupplier.setVisible(true);
    }//GEN-LAST:event_lihatSupplierButtonActionPerformed

    private void lihatLaporanRekeningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatLaporanRekeningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lihatLaporanRekeningActionPerformed

    public Driver getDriver() {
        return driver;
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
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PegawaiInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lihatLaporanRekening;
    private javax.swing.JButton lihatPenyewaButton;
    private javax.swing.JButton lihatSupplierButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageMobilButton;
    private javax.swing.JButton manageTransaksiButton;
    private javax.swing.JButton myProfileButton;
    // End of variables declaration//GEN-END:variables
}
