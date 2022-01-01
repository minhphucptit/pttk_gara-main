package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "PhuTung")
public class PhuTung {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    String ma;
    String ten;
    String loai;
    Float gia;

    @ManyToOne()
    @JoinColumn(name = "tblNhaCungCapid")
    private NhaCungCap ncc;

    @OneToMany(mappedBy = "phuTung",cascade = CascadeType.ALL)
    private Set<ChiTietHoaDon> chiTietHoaDonSet;

    public PhuTung() {
    }

    public PhuTung(String ma, String ten, String loai, Float gia) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;
    }

    public PhuTung(int id, String ma, String ten, String loai, Float gia) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }
}
