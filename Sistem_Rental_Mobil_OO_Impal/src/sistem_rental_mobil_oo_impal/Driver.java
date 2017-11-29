/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem_rental_mobil_oo_impal.model.Database;
import sistem_rental_mobil_oo_impal.model.Database;
import sistem_rental_mobil_oo_impal.model.LaporanRekening;
import sistem_rental_mobil_oo_impal.model.LaporanRekening;
import sistem_rental_mobil_oo_impal.model.Pegawai;
import sistem_rental_mobil_oo_impal.model.Pegawai;
import sistem_rental_mobil_oo_impal.model.Penyewa;
import sistem_rental_mobil_oo_impal.model.Penyewa;
import sistem_rental_mobil_oo_impal.model.Mobil;
import sistem_rental_mobil_oo_impal.model.Mobil;
import sistem_rental_mobil_oo_impal.model.Supplier;
import sistem_rental_mobil_oo_impal.model.Supplier;
import sistem_rental_mobil_oo_impal.model.Transaksi;
import sistem_rental_mobil_oo_impal.model.Transaksi;

/**
 *
 * @author Evlive
 */
public class Driver {
    
    private ArrayList<Pegawai> listPegawai = new ArrayList<>();
    private ArrayList<Supplier> listSupplier = new ArrayList<>();
    private ArrayList<Penyewa> listPenyewa = new ArrayList<>();
    private ArrayList<Mobil> listMobil = new ArrayList<>();
    private ArrayList<Transaksi> listTransaksi = new ArrayList<>();
    private ArrayList<LaporanRekening> listLaporan = new ArrayList<>();
    private Database db;
    private String userEmail;
    private String userNama;
    private String userAlamat;
    private String userContact;
    private String userLevel;

    public Driver() {
        db = new Database();
        db.connect();
        listPegawai = db.getListPegawai();
        listSupplier = db.getListSupplier();
        listPenyewa = db.getListPenyewa();
        listMobil = db.getListMobil();
        listTransaksi = db.getListTransaksi();
        listLaporan = db.getListLaporan();
    }
    
    public boolean checkEmail(String email) {
        for (Pegawai p : listPegawai) {
            if (email == p.getEmail()) {
                return true;
            }
        }
        for (Penyewa p : listPenyewa) {
            if (email == p.getEmail()) {
                return true;
            }
        }
        for (Supplier p : listSupplier) {
            if (email == p.getEmail()) {
                return true;
            }            
        }
        return false;
    }
    
    public boolean checkPassword(String password) {
        for (Pegawai p : listPegawai) {
            if (password == p.getPassword()) {
                return true;
            }
        }
        for (Penyewa p : listPenyewa) {
            if (password == p.getPassword()) {
                return true;
            }
        }
        for (Supplier p : listSupplier) {
            if (password == p.getPassword()) {
                return true;
            }            
        }
        return false;        
    }
    
    public ArrayList<Pegawai> getListPegawai() {
        return listPegawai;
    }

    public void setListPegawai(ArrayList<Pegawai> listPegawai) {
        this.listPegawai = listPegawai;
    }

    public ArrayList<Supplier> getListSupplier() {
        return listSupplier;
    }

    public void setListSupplier(ArrayList<Supplier> listSupplier) {
        this.listSupplier = listSupplier;
    }

    public ArrayList<Penyewa> getListPenyewa() {
        return listPenyewa;
    }

    public void setListPenyewa(ArrayList<Penyewa> listPenyewa) {
        this.listPenyewa = listPenyewa;
    }

    public ArrayList<Mobil> getListMobil() {
        return listMobil;
    }

    public void setListMobil(ArrayList<Mobil> listMobil) {
        this.listMobil = listMobil;
    }

    public ArrayList<Transaksi> getListTransaksi() {
        return listTransaksi;
    }

    public void setListTransaksi(ArrayList<Transaksi> listTransaksi) {
        this.listTransaksi = listTransaksi;
    }

    public ArrayList<LaporanRekening> getListLaporan() {
        return listLaporan;
    }

    public void setListLaporan(ArrayList<LaporanRekening> listLaporan) {
        this.listLaporan = listLaporan;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }

    public String getUserNama() {
        return userNama;
    }

    public void setUserNama(String userNama) {
        this.userNama = userNama;
    }

    public String getUserAlamat() {
        return userAlamat;
    }

    public void setUserAlamat(String userAlamat) {
        this.userAlamat = userAlamat;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
   
    public void reloadData() {
        listPegawai = db.getListPegawai();
        listSupplier = db.getListSupplier();
        listPenyewa = db.getListPenyewa();
        listMobil = db.getListMobil();
        listTransaksi = db.getListTransaksi();
        listLaporan = db.getListLaporan();
    }
    
    public Pegawai getPegawaiByEmail(String email) {
        reloadData();
        Pegawai pegawai = new Pegawai();
        pegawai.setEmail("");
        for (Pegawai p : listPegawai) {
            if (p.getEmail().equals(email)) {
                pegawai = p;
            }
        }
        return pegawai;
    }
    
    public Supplier getSupplierByEmail(String email) {
        reloadData();
        Supplier supplier = new Supplier();
        supplier.setEmail("");
        for (Supplier p : listSupplier) {
            if (p.getEmail().equals(email)) {
                supplier = p;
            }
        }
        return supplier;
    }
    
    public Penyewa getPenyewaByEmail(String email) {
        reloadData();
        Penyewa penyewa = new Penyewa();
        penyewa.setEmail("");
        for (Penyewa p : listPenyewa) {
            if (p.getEmail().equals(email)) {
                penyewa = p;
            }
        }
        return penyewa;
    }

    public Pegawai getPegawaiById(int id) {
        reloadData();
        Pegawai pegawai = new Pegawai();
        pegawai.setEmail("");
        for (Pegawai p : listPegawai) {
            if (p.getId() == id) {
                pegawai = p;
            }
        }
        return pegawai;
    }
    
    public Supplier getSupplierById(int id) {
        reloadData();
        Supplier supplier = new Supplier();
        supplier.setEmail("");
        for (Supplier p : listSupplier) {
            if (p.getId() == id) {
                supplier = p;
            }
        }
        return supplier;
    }
    
    public Penyewa getPenyewaById(int id) {
        reloadData();
        Penyewa penyewa = new Penyewa();
        penyewa.setEmail("");
        for (Penyewa p : listPenyewa) {
            if (p.getId() == id) {
                penyewa = p;
            }
        }
        return penyewa;
    }
    
    public Supplier getSupplierByNama(String namaSupplier) {
        reloadData();
        Supplier supplier = new Supplier();
        supplier.setEmail("");
        supplier.setNama("");
        for (Supplier p : listSupplier) {
            if (p.getNama().equals(namaSupplier)) {
                supplier = p;
            }
        }
        return supplier;
    }
    
    public Penyewa getPenyewaByNama(String namaPenyewa) {
        reloadData();
        Penyewa penyewa = new Penyewa();
        penyewa.setNama("");
        for (Penyewa p : listPenyewa) {
            if (p.getNama() == namaPenyewa) {
                penyewa = p;
            }
        }
        return penyewa;
    }    
    
    public Mobil getMobilBySupplierNamaMerk(String namaSupplier, String namaMobil, String namaMerk) {
        reloadData();
        Mobil mobil = new Mobil();
        Supplier supplier = getSupplierByNama(namaSupplier);
        for (Mobil p : listMobil) {
            if ((p.getIdSupplier() == supplier.getId()) && (p.getNama().equals(namaMobil)) && (p.getMerk().equals(namaMerk))) {
                mobil = p;
            }
        }
        return mobil;
    }
    
    public Mobil getMobilByNamaJumlahHarga(String namaMobil, int jumlah, int harga) {
        reloadData();
        Mobil mobil = new Mobil();
        for (Mobil p : listMobil) {
            if ((p.getJumlah() == jumlah) && (p.getNama().equals(namaMobil)) && (p.getHarga() == harga)) {
                mobil = p;
            }
        }
        return mobil;
    }
    
    public Mobil getMobilById(int id) {
        reloadData();
        Mobil mobil = new Mobil();
        for (Mobil p : listMobil) {
            if ((p.getId() == id)) {
                mobil = p;
            }
        }
        return mobil;
    }
        
    public Transaksi getTransaksi(String namaPenyewa, String namaMobil, int jumlah, int harga) {
        reloadData();
        Transaksi transaksi = new Transaksi();
        Penyewa penyewa = getPenyewaByNama(namaPenyewa);
        for (Transaksi p : listTransaksi) {
            if ((p.getIdPenyewa() == penyewa.getId()) && (p.getJumlahMobil()== jumlah) && (p.getNamaMobil().equals(namaMobil)) && (p.getHarga() == harga)) {
                transaksi = p;
            }
        }
        return transaksi;
    }       
}
