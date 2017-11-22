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
public class Supplier {
    
    private int id;
    private String email;
    private String password;
    private String nama;
    private String alamat;
    private String contact;
    private String level;
    private String message;

    public Supplier(int id, String email, String password, String nama, String alamat, String contact, String level, String message) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.level = level;
        this.message = message;
    }
    
    public Supplier(int id, String email, String password, String nama, String alamat, String contact, String level) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.level = level;
        this.message = "";
    }

    public Supplier(String email, String password, String nama, String alamat, String contact, String level) {
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.alamat = alamat;
        this.contact = contact;
        this.level = level;
        this.message = "";
    }

    public Supplier() {}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
