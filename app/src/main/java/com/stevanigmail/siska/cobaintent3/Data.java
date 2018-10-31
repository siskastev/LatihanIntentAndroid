package com.stevanigmail.siska.cobaintent3;

import java.io.Serializable;

public class Data implements Serializable{
    String nama, alamat, nim;

    public Data(String nama, String alamat, String nim) {
        this.nama = nama;
        this.alamat = alamat;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
