package com.example.ryan.bottomnavigation.Mitra;

public class PesananMitra {

    private int Foto;
    private String Nama;
    private String Ket;
    private String Harga;

    public PesananMitra(){

    }

    public PesananMitra(int foto, String nama, String ket, String harga){
        Foto = foto;
        Nama = nama;
        Ket = ket;
        Harga = harga;
    }

    //getter


    public int getFoto() {
        return Foto;
    }

    public String getNama() {
        return Nama;
    }

    public void setKet(String ket) {
        Ket = ket;
    }

    public String getHarga() {
        return Harga;
    }

    //setter

    public void setFoto(int foto) {
        Foto = foto;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getKet() {
        return Ket;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

}
