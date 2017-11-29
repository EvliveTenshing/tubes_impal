/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal.panels;

import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistem_rental_mobil_oo_impal.Driver;
import sistem_rental_mobil_oo_impal.model.Mobil;
import sistem_rental_mobil_oo_impal.model.Penyewa;
import sistem_rental_mobil_oo_impal.model.Supplier;
import sistem_rental_mobil_oo_impal.model.Transaksi;

/**
 *
 * @author Evlive
 */
public class SewaMobil extends javax.swing.JPanel {
    private Driver driver;
    private DefaultTableModel model;
    private SimpleDateFormat dateFormat;

    public SewaMobil() {
        initComponents();
        this.setBackground(Color.WHITE);
        driver = new Driver();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        model = (DefaultTableModel) tableMobil.getModel();
        reset();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tanggalPengembalian = new com.toedter.calendar.JDateChooser();
        jumlahField = new javax.swing.JTextField();
        sewaButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMobil = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel3.setText("Sewa Mobil");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Pilih Mobil");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Jumlah");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Tanggal Pengembalian");

        tanggalPengembalian.setBackground(new java.awt.Color(255, 255, 255));
        tanggalPengembalian.setDateFormatString("dd/MM/yyyy");

        jumlahField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jumlahField.setBorder(null);

        sewaButton.setBackground(new java.awt.Color(0, 102, 255));
        sewaButton.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        sewaButton.setForeground(new java.awt.Color(255, 255, 255));
        sewaButton.setText("Sewa");
        sewaButton.setBorder(null);
        sewaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sewaButtonActionPerformed(evt);
            }
        });

        tableMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mobil", "Jumlah", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableMobil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tanggalPengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addComponent(jumlahField)))
                        .addComponent(sewaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jumlahField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(tanggalPengembalian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sewaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public int getJumlah() {
        int s;
        if ("".equals(jumlahField.getText())) {
            s = 0;
        }
        else {
            s = Integer.parseInt(jumlahField.getText());
        }
        return s;
    } 
    
    public void setJumlah(int jumlah) {
        String s = Integer.toString(jumlah);
        jumlahField.setText(s);
    }
    
    public String getDate() {
        String date;
        if (tanggalPengembalian.getDate() == null) {
            date = "";
        } else {
            date = dateFormat.format(tanggalPengembalian.getDate());
        }
        return date;
    }
    
    public void setDate(String date) {
        tanggalPengembalian.setDateFormatString(date);
    }
    
    private void sewaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sewaButtonActionPerformed
        int selectedRow = tableMobil.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Mohon untuk memilih mobil yang ingin di sewa pada tabel");
        } else {
            int jumlah = getJumlah();
            String dateString = getDate();
            if ((jumlah != 0) && (tanggalPengembalian.getDate() != null)) {
                if (jumlah <= 0) {
                    JOptionPane.showMessageDialog(null, "Mohon untuk tidak mengisi angka negatif pada jumlah mobil yang akan disewa");
                } else {
                    Mobil mobil = getMobil(tableMobil.getSelectedRow()); //ambil data mobil dari database
                    Penyewa penyewa = driver.getPenyewaByEmail(driver.getUserEmail());
                    java.util.Date date = tanggalPengembalian.getDate();
                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                    Transaksi transaksi = new Transaksi(penyewa.getId(), mobil.getId(), mobil.getNama(), jumlah, mobil.getHarga(), sqlDate);
                    KonfirmasiSewaMobil konfirmasiSewaMobil = new KonfirmasiSewaMobil();
                    konfirmasiSewaMobil.getDriver().setUserEmail(driver.getUserEmail());
                    konfirmasiSewaMobil.getDriver().setUserNama(driver.getUserNama());
                    konfirmasiSewaMobil.getDriver().setUserLevel(driver.getUserLevel());
                    konfirmasiSewaMobil.setTransaksi(transaksi);
                    konfirmasiSewaMobil.setMobil(mobil);
                    konfirmasiSewaMobil.setPenyewa(penyewa);
                    konfirmasiSewaMobil.setNamaPenyewa(driver.getUserNama());
                    konfirmasiSewaMobil.setNamaMobil(transaksi.getNamaMobil());
                    konfirmasiSewaMobil.setMerk(mobil.getMerk());
                    konfirmasiSewaMobil.setJumlah(transaksi.getJumlahMobil());
                    konfirmasiSewaMobil.setHarga(transaksi.getHarga());
                    konfirmasiSewaMobil.setTotal(transaksi.getHarga(), transaksi.getJumlahMobil());
                    konfirmasiSewaMobil.setDate(dateString);
                    konfirmasiSewaMobil.setVisible(true);
                    loadMobil();
                    reset();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Mohon untuk mengisi jumlah mobil yang akan disewa dan/atau memilih tanggal pengembalian");
            }
        }         
    }//GEN-LAST:event_sewaButtonActionPerformed
       
    public void loadMobil() {
        deleteListInTable();
        driver.reloadData();
        for (Mobil p : driver.getListMobil()) {
            if (p.getJumlah() > 0) {
               model.insertRow(model.getRowCount(), new Object[]{p.getNama(), p.getJumlah(), p.getHarga()});    
            }
        }
    }
    
    public Mobil getMobil(int selectedRow) {
        Mobil mobil = new Mobil();
        String namaMobil = "";
        int jumlah = 0;
        int harga = 0;
        namaMobil = (String) tableMobil.getValueAt(selectedRow, 0);
        jumlah = (int) tableMobil.getValueAt(selectedRow, 1);
        harga = (int) tableMobil.getValueAt(selectedRow, 2);
        mobil = driver.getMobilByNamaJumlahHarga(namaMobil, jumlah, harga);
        return mobil;
    }
    
    public void deleteListInTable() {
        model.setRowCount(0);
    }
    public void reset() {
        jumlahField.setText("");
    }
    
    public Driver getDriver() {
        return driver;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumlahField;
    private javax.swing.JButton sewaButton;
    private javax.swing.JTable tableMobil;
    private com.toedter.calendar.JDateChooser tanggalPengembalian;
    // End of variables declaration//GEN-END:variables
}
