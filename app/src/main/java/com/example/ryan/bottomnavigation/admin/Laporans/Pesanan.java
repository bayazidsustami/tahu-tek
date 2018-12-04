package com.example.ryan.bottomnavigation.admin.Laporans;

public class Pesanan {

    private int Foto;
    private String Nama;
    private String Harga;
    private String Waktu;

    public Pesanan(){

    }

    public Pesanan(int foto, String nama, String harga, String waktu){
        Foto = foto;
        Nama = nama;
        Harga = harga;
        Waktu = waktu;
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
}
