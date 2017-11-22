/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal.model;

/**
 *
 * @author Evlive
 */
public class Penyewa {
    
    private int id;
    private int idTransaksiPenyewa;
    private String email;
    private String password;
    private String nama;
    private String alamat;
    private String contact;
    private String level;

    public Penyewa(int id, int idTransaksiPenyewa, String email, String password, String nama, String alamat, String contact, String level) {
        this.id = id;
        this.idTransaksiPenyewa = idTransaksiPenyewa;
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.level = level;
    }

    public Penyewa(int id, String email, String password, String nama, String alamat, String contact, String level) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.level = level;
    }

    public Penyewa(String email, String password, String nama, String alamat, String contact, String level) {
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.level = level;
    }

    public Penyewa() {}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTransaksiPenyewa() {
        return idTransaksiPenyewa;
    }

    public void setIdTransaksiPenyewa(int idTransaksiPenyewa) {
        this.idTransaksiPenyewa = idTransaksiPenyewa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
    
}
