package com.example.btvn;

import java.util.List;

public class ListItem {

    private String ten;
    private String noiDung;
    private String theLoai;

    // Constructor
    public ListItem(String ten, String noiDung, String theLoai) {
        this.ten = ten;
        this.noiDung = noiDung;
        this.theLoai = theLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
}
