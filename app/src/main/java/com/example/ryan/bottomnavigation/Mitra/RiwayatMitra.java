package com.example.ryan.bottomnavigation.Mitra;

public class RiwayatMitra {

    private int Foto;
    private String Harga;
    private String Waktu;
    private String Konfirm;

    public RiwayatMitra(){

    }

    public RiwayatMitra(int foto, String harga, String waktu, String konfirm){
        Foto = foto;
        Harga = harga;
        Waktu = waktu;
        Konfirm = konfirm;
    }

    //getter


    public int getFoto() {
        return Foto;
    }

    public void setHarga(String harga) {
        Harga = harga;
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

    public String getHarga() {
        return Harga;
    }

    public void setWaktu(String waktu) {
        Waktu = waktu;
    }

    public void setKonfirm(String konfirm) {
        Konfirm = konfirm;
    }
}
