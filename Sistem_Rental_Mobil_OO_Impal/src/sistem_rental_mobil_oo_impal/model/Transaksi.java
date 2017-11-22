/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_rental_mobil_oo_impal.model;

import java.sql.Date;

/**
 *
 * @author Evlive
 */
public class Transaksi {
    
    private int id;
    private int idPenyewa;
    private int idMobil;
    private String namaMobil;
    private int jumlahMobil;
    private int harga;
    private Date tanggalPengembalian;
    private int denda;

    public Transaksi(int id, int idPenyewa, int idMobil, String namaMobil, int jumlahMobil, int harga, Date tanggalPengembalian, int denda) {
        this.id = id;
        this.idPenyewa = idPenyewa;
        this.idMobil = idMobil;
        this.namaMobil = namaMobil;
        this.jumlahMobil = jumlahMobil;
        this.harga = harga;
        this.tanggalPengembalian = tanggalPengembalian;
        this.denda = denda;
    }
    
    public Transaksi(int id, int idPenyewa, int idMobil, String namaMobil, int jumlahMobil, int harga, Date tanggalPengembalian) {
        this.id = id;
        this.idPenyewa = idPenyewa;
        this.idMobil = idMobil;
        this.namaMobil = namaMobil;
        this.jumlahMobil = jumlahMobil;
        this.harga = harga;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public Transaksi() {}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPenyewa() {
        return idPenyewa;
    }

    public void setIdPenyewa(int idPenyewa) {
        this.idPenyewa = idPenyewa;
    }

    public int getIdMobil() {
        return idMobil;
    }

    public void setIdMobil(int idMobil) {
        this.idMobil = idMobil;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public int getJumlahMobil() {
        return jumlahMobil;
    }

    public void setJumlahMobil(int jumlahMobil) {
        this.jumlahMobil = jumlahMobil;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
    
}
