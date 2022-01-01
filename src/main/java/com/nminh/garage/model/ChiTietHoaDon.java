package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ChiTietHoaDon")
public class ChiTietHoaDon {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    int soLuong;
    float gia;
    @ManyToOne()
    @JoinColumn(name="tblPhuTungid")
    private PhuTung phuTung;

    @ManyToOne()
    @JoinColumn(name="tblHoaDonNhapid")
    private HoaDonNhap hoaDonNhap;


    public ChiTietHoaDon(int soLuong, PhuTung phuTung, HoaDonNhap hdn, float gia) {
        this.soLuong = soLuong;
        this.phuTung = phuTung;
        this.hoaDonNhap = hdn;
        this.gia = gia;
    }

    public ChiTietHoaDon(int id, int soLuong, PhuTung phuTung, HoaDonNhap hdn, float gia) {
        this.id = id;
        this.soLuong = soLuong;
        this.gia = gia;
        this.phuTung = phuTung;
        this.hoaDonNhap = hdn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public PhuTung getPhuTung() {
        return phuTung;
    }

    public void setPhuTung(PhuTung phuTung) {
        this.phuTung = phuTung;
    }

    public HoaDonNhap getHoaDonNhap() {
        return hoaDonNhap;
    }

    public void setHoaDonNhap(HoaDonNhap hoaDonNhap) {
        this.hoaDonNhap = hoaDonNhap;
    }
}
