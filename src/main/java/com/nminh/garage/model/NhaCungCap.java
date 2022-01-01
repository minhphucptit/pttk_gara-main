package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "NhaCungCap")
public class NhaCungCap {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    String ma;
    String ten;
    String diaChi;
    String ghiChu;

    @OneToMany(mappedBy = "ncc", cascade = CascadeType.ALL)
    private Set<PhuTung> phuTungs;

    public NhaCungCap() {
    }


    public NhaCungCap(String ma, String ten, String diaChi, String ghiChu) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
    }

    public NhaCungCap(int id, String ma, String ten, String diaChi, String ghiChu) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
