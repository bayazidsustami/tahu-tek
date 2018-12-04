package com.example.ryan.bottomnavigation.admin.Laporans;

public class Riwayat {

    private int Foto;
    private String Nama;
    private String Harga;
    private String Waktu;
    private String Konfirm;

    public Riwayat(){

    }

    public Riwayat(int foto, String nama, String harga, String waktu, String konfirm){
        Foto = foto;
        Nama = nama;
        Harga = harga;
        Waktu = waktu;
        Konfirm = konfirm;
    }

    //getter


    public int getFoto() {
        return Foto;
    }

    public String getNama() {
        return Nama;
    }

    public String getHarga() {
        return Harga;
    }

    public String getWaktu() {
        return Waktu;
    }

    public String getKonfirm() {
        return Konfirm;
    }

    //setter

    public void setFoto(int foto) {
        Foto = foto;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    public void setWaktu(String waktu) {
        Waktu = waktu;
    }

    public void setKonfirm(String konfirm) {
        Konfirm = konfirm;
    }
}
