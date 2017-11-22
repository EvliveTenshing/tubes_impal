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
public class LaporanRekening {
    
    private int id;
    private int jumlah;
    private Date tanggal;
    private String keterangan;

    public LaporanRekening(int id, int jumlah, Date tanggal, String keterangan) {
        this.id = id;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
        this.keterangan = keterangan;
    }

    public LaporanRekening(int jumlah, Date tanggal) {
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    public LaporanRekening() {}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
}
