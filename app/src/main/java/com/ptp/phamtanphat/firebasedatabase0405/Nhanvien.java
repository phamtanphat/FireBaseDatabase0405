package com.ptp.phamtanphat.firebasedatabase0405;

public class Nhanvien {
    private String ten;
    private Integer tuoi;

    public Nhanvien(String ten, Integer tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    // Can thiet khi doc ve
    public Nhanvien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }
}
