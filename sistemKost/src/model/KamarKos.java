/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus GK
 */

public class KamarKos {
    private String nomorKamar;
    private double hargaBulan;
    private String status;
    private String fasilitas;
    private String ukuran;
    private String dayaListrik;

    public KamarKos(String nomorKamar, double hargaBulan, String status, String fasilitas, String ukuran, String dayaListrik) {
        this.nomorKamar = nomorKamar;
        this.hargaBulan = hargaBulan;
        this.status = status;
        this.fasilitas = fasilitas;
        this.ukuran = ukuran;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public double getHargaBulan() {
        return hargaBulan;
    }

    public String getStatus() {
        return status;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getDayaListrik() {
        return dayaListrik;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public void setHargaBulan(double hargaBulan) {
        this.hargaBulan = hargaBulan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setDayaListrik(String dayaListrik) {
        this.dayaListrik = dayaListrik;
    }
}