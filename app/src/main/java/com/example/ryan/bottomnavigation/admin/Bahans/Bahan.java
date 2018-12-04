package com.example.ryan.bottomnavigation.admin.Bahans;

public class Bahan {

    private int fotoBahan;
    private String namaBahan;
    private String ketBahan;
    private String hargaBahan;

    public Bahan(){

    }

    public Bahan(int foto_bahan, String nama_bahan, String ket_bahan, String harga_bahan ){

        fotoBahan = foto_bahan;
        namaBahan = nama_bahan;
        ketBahan = ket_bahan;
        hargaBahan = harga_bahan;

    }

    //Getter


    public int getFotoBahan() {
        return fotoBahan;
    }

    public String getNamaBahan() {
        return namaBahan;
    }

    public String getKetBahan() {
        return ketBahan;
    }

    public String getHargaBahan() {
        return hargaBahan;
    }

    //setter


    public void setFotoBahan(int fotoBahan) {
        this.fotoBahan = fotoBahan;
    }

    public void setNamaBahan(String namaBahan) {
        this.namaBahan = namaBahan;
    }

    public void setKetBahan(String ketBahan) {
        this.ketBahan = ketBahan;
    }

    public void setHargaBahan(String hargaBahan) {
        this.hargaBahan = hargaBahan;
    }
}
