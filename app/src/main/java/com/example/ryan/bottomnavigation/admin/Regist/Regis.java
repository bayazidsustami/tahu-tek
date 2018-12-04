package com.example.ryan.bottomnavigation.admin.Regist;

public class Regis {

    private int fotoUser;
    private String namaUser;

    public Regis(){

    }

    public Regis(int foto_user, String nama_user){

        fotoUser = foto_user;
        namaUser = nama_user;
    }

    //Getter


    public int getFotoUser() {
        return fotoUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    //setter

    public void setFotoUser(int fotoUser) {
        this.fotoUser = fotoUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

}
