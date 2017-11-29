/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Evlive
 */
public class Database {
    
    private String dbUser = "root";
    private String dbPassword = "";
    private Statement statement = null;
    private Connection connection = null;
    
    public Database(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void connect() {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sistem_rental_mobil", dbUser, dbPassword);
            statement = connection.createStatement();
        } catch(SQLException e) {
            throw new IllegalArgumentException("terjadi kesalahan saat koneksi database");
        }
    }
    
    public void query(String s) {
        try {
            statement.executeUpdate(s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //************************************************
    //*               Pegawai                        *
    //************************************************
    public ArrayList<Pegawai> getListPegawai() {
        try {
            ArrayList<Pegawai> pegawaiList = new ArrayList<>();
            String s = "SELECT * from pegawai";
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                Pegawai pegawai = new Pegawai(result.getInt("id_pegawai"), result.getString("email_pegawai"), result.getString("password_pegawai"), 
                        result.getString("nama_pegawai"), result.getString("alamat_pegawai"), result.getString("contact_pegawai"), result.getString("level"));
                pegawaiList.add(pegawai);
            }
            return pegawaiList;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error ambil data pegawai");
        }
    }
    
    public void insertPegawai(Pegawai pegawai) {
        String s = "INSERT INTO pegawai(email_pegawai`, `password_pegawai`, `nama_pegawai`, `alamat_pegawai`, `contact_pegawai`, `level`)"
                + " VALUES ('"+pegawai.getEmail()+"','"+pegawai.getPassword()+"','"+pegawai.getNama()+"','"+pegawai.getAlamat()+"','"+pegawai.getContact()+"','"+pegawai.getLevel()+"')";
        query(s);
    }   
    
    public void deletePegawai(int id) {
        String s = "DELETE FROM pegawai WHERE id_pegawai="+id;
        query(s);
    }
    
    public void updatePegawai(int id, Pegawai pegawai) {
        String s = "UPDATE pegawai SET `email_pegawai`='"+pegawai.getEmail()+"',`password_pegawai`='"+pegawai.getPassword()+"',`nama_pegawai`='"+pegawai.getNama()+"',`alamat_pegawai`='"+pegawai.getAlamat()+"', "
                + "`contact_pegawai`='"+pegawai.getContact()+"' WHERE id_pegawai="+id;
        query(s);
    }
    
    //************************************************
    //*               Penyewa                        *
    //************************************************
    public ArrayList<Penyewa> getListPenyewa() {
        try {
            ArrayList<Penyewa> penyewaList = new ArrayList<>();
            String s = "SELECT * from penyewa";
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                Penyewa penyewa = new Penyewa(result.getInt("id_penyewa"), result.getInt("id_transaksi_penyewa"), result.getString("email_penyewa"), result.getString("password_penyewa"), 
                        result.getString("nama_penyewa"), result.getString("alamat_penyewa"), result.getString("contact_penyewa"), result.getString("level"));
                penyewaList.add(penyewa);
            }
            return penyewaList;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error ambil data penyewa");
        }
    }
    
    public void insertPenyewa(Penyewa penyewa) {
        String s = "INSERT INTO penyewa(`email_penyewa`, `password_penyewa`, `nama_penyewa`, `alamat_penyewa`, `contact_penyewa`, `level`)"
                + " VALUES ('"+penyewa.getEmail()+"','"+penyewa.getPassword()+"','"+penyewa.getNama()+"','"+penyewa.getAlamat()+"','"+penyewa.getContact()+"','"+penyewa.getLevel()+"')";
        query(s);
    }   
    
    public void deletePenyewa(int id) {
        String s = "DELETE FROM penyewa WHERE id_penyewa="+id;
        query(s);
    }
    
    public void updatePenyewa(int id, Penyewa penyewa) {
        String s = "UPDATE penyewa SET `id_transaksi_penyewa`='"+penyewa.getIdTransaksiPenyewa()+"', `email_penyewa`='"+penyewa.getEmail()+"',`password_penyewa`='"+penyewa.getPassword()+"',`nama_penyewa`='"+penyewa.getNama()+"',`alamat_penyewa`='"+penyewa.getAlamat()+"', "
                + "`contact_penyewa`='"+penyewa.getContact()+"' WHERE id_penyewa="+id;
        query(s);
    }
    
    //************************************************
    //*               Supplier                       *
    //************************************************
    public ArrayList<Supplier> getListSupplier() {
        try {
            ArrayList<Supplier> supplierList = new ArrayList<>();
            String s = "SELECT * from supplier";
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                Supplier supplier = new Supplier(result.getInt("id_supplier"), result.getString("email_supplier"), result.getString("password_supplier"), 
                        result.getString("nama_supplier"), result.getString("alamat_supplier"), result.getString("contact_supplier"), result.getString("level"), result.getString("message"));
                supplierList.add(supplier);
            }
            return supplierList;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error ambil data supplier");
        }
    }
    
    public void insertSupplier(Supplier supplier) {
        String s = "INSERT INTO supplier(`email_supplier`, `password_supplier`, `nama_supplier`, `alamat_supplier`, `contact_supplier`, `level`, `message`)"
                + " VALUES ('"+supplier.getEmail()+"','"+supplier.getPassword()+"','"+supplier.getNama()+"','"+supplier.getAlamat()+"','"+supplier.getContact()+"','"+supplier.getLevel()+"', '"+supplier.getMessage()+"')";
        query(s);
    }   
    
    public void deleteSupplier(int id) {
        String s = "DELETE FROM supplier WHERE id_supplier="+id;
        query(s);
    }
    
    public void updateSupplier(int id, Supplier supplier) {
        String s = "UPDATE supplier SET `email_supplier`='"+supplier.getEmail()+"',`password_supplier`='"+supplier.getPassword()+"',`nama_supplier`='"+supplier.getNama()+"',`alamat_supplier`='"+supplier.getAlamat()+"', "
                + "`contact_supplier`='"+supplier.getContact()+"', message='"+supplier.getMessage()+"' WHERE id_supplier="+id;
        query(s);
    }
    
    
    

    //************************************************
    //*                 Mobil                        *
    //************************************************
    public ArrayList<Mobil> getListMobil() {
        try {
            ArrayList<Mobil> mobilList = new ArrayList<>();
            String s = "SELECT * from mobil";
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                Mobil mobil = new Mobil(result.getInt("id_mobil"), result.getInt("id_supplier"), result.getString("nama_mobil"), result.getString("merk_mobil"), 
                        result.getInt("jumlah_mobil"), result.getInt("harga_mobil"));
                mobilList.add(mobil);
            }
            return mobilList;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error ambil data mobil");
        }
    }
    
    public void insertMobil(Mobil mobil) {
        String s = "INSERT INTO mobil(`id_supplier`, `nama_mobil`, `merk_mobil`, `jumlah_mobil`, `harga_mobil`)"
                + " VALUES ('"+mobil.getIdSupplier()+"','"+mobil.getNama()+"','"+mobil.getMerk()+"','"+mobil.getJumlah()+"','"+mobil.getHarga()+"')";
        query(s);
    }   
    
    public void deleteMobil(int id) {
        String s = "DELETE FROM mobil WHERE id_mobil="+id;
        query(s);
    }
    
    public void updateMobil(int id, Mobil mobil) {
        String s = "UPDATE mobil SET `id_supplier`='"+mobil.getIdSupplier()+"', `nama_mobil`='"+mobil.getNama()+"', `merk_mobil`='"+mobil.getMerk()+"', `jumlah_mobil`='"+mobil.getJumlah()+"', `harga_mobil`='"+mobil.getHarga()+"' WHERE id_mobil="+id;
        query(s);
    }
    
    //************************************************
    //*               Transaksi                      *
    //************************************************
    public ArrayList<Transaksi> getListTransaksi() {
        try {
            ArrayList<Transaksi> transaksiList = new ArrayList<>();
            String s = "SELECT * from transaksi";
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                Transaksi transaksi = new Transaksi(result.getInt("id_transaksi"), result.getInt("id_penyewa"), result.getInt("id_mobil"), result.getString("nama_mobil_yang_disewa"), 
                        result.getInt("jumlah_mobil_yang_disewa"), result.getInt("harga_sewa"), result.getDate("tanggal_pengembalian"), result.getInt("denda"), result.getInt("status_bayar"));
                transaksiList.add(transaksi);
            }
            return transaksiList;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
    
    public void insertTransaksi(Transaksi transaksi) {
        String s = "INSERT INTO transaksi(`id_penyewa`, `id_mobil`, `nama_mobil_yang_disewa`, `jumlah_mobil_yang_disewa`, `harga_sewa`, `tanggal_pengembalian`, `denda`, `status_bayar`)"
                + " VALUES ('"+transaksi.getIdPenyewa()+"','"+transaksi.getIdMobil()+"','"+transaksi.getNamaMobil()+"','"+transaksi.getJumlahMobil()+"','"+transaksi.getHarga()+"','"+transaksi.getTanggalPengembalian()+"','"+transaksi.getDenda()+"', '"+transaksi.getStatusBayar()+"')";
        query(s);
    }
    
    public void deleteTransaksi(int id) {
        String s = "DELETE FROM transaksi WHERE id_transaksi="+id;
        query(s);
    }
    
    public void updateTransaksi(int id, Transaksi transaksi) {
        String s = "UPDATE transaksi SET `id_penyewa`='"+transaksi.getIdPenyewa()+"',`id_mobil`='"+transaksi.getIdMobil()+"',`nama_mobil_yang_disewa`='"+transaksi.getNamaMobil()+"',`jumlah_mobil_yang_disewa`='"+transaksi.getJumlahMobil()+"', "
                + "`harga_sewa`='"+transaksi.getHarga()+"',`tanggal_pengembalian`='"+transaksi.getTanggalPengembalian()+"',`denda`='"+transaksi.getDenda()+"', `status_bayar`='"+transaksi.getStatusBayar()+"' WHERE id_transaksi="+id;
        query(s);
    }
    
    //************************************************
    //*               LaporanRekening                *
    //************************************************
    public ArrayList<LaporanRekening> getListLaporan() {
        try {
            ArrayList<LaporanRekening> laporanRekeningList = new ArrayList<>();
            String s = "SELECT * from pelaporan_rekening";
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                LaporanRekening laporanRekening = new LaporanRekening(result.getInt("id_saldo"), result.getInt("jumlah_saldo"), result.getDate("tanggal_saldo"), result.getString("keterangan_saldo"));
                laporanRekeningList.add(laporanRekening);
            }
            return laporanRekeningList;
        } catch (Exception e) {
            throw new IllegalArgumentException("Error ambil data laporan");
        }
    }
    
    public void insertLaporanRekening(LaporanRekening laporanRekening) {
        String s = "INSERT INTO pelaporan_rekening(`jumlah_saldo`, `tanggal_saldo`, `keterangan_saldo`)"
                + " VALUES ('"+laporanRekening.getJumlah()+"','"+laporanRekening.getTanggal()+"','"+laporanRekening.getKeterangan()+"')";
        query(s);
    }
    
    public void deleteLaporanRekening(int id) {
        String s = "DELETE FROM pelaporan_rekening WHERE id_saldo="+id;
        query(s);
    }
    
    public void updateLaporanRekening(int id, LaporanRekening laporanRekening) {
        String s = "UPDATE pelaporan_rekening SET `jumlah_saldo`='"+laporanRekening.getJumlah()+"',`tanggal_saldo`='"+laporanRekening.getTanggal()+"',`keterangan_saldo`='"+laporanRekening.getKeterangan()+"' WHERE id_saldo="+id;
        query(s);
    }
}
