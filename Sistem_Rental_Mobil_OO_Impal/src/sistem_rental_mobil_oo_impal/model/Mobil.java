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
public class Mobil {
    
    private int id;
    private int idSupplier;
    private String nama;
    private String merk;
    private int jumlah;
    private int harga;

    public Mobil(int id, int idSupplier, String nama, String merk, int jumlah, int harga) {
        this.id = id;
        this.idSupplier = idSupplier;
        this.nama = nama;
        this.merk = merk;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public Mobil() {}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}
