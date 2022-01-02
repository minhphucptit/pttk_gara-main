package com.nminh.garage.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "HoaDonNhap")
public class HoaDonNhap {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    int id;
    Date thoiGianTao;
    Float thanhTien;
    String ghiChu;



    @ManyToOne
    @JoinColumn(name ="tblNhanVienid")
    NhanVien nhanVien;

    @OneToMany(mappedBy = "hoaDonNhap",cascade = CascadeType.ALL)
    private Set<ChiTietHoaDon> chiTietHoaDonSet;


    public HoaDonNhap() {
    }

    public HoaDonNhap(Date thoiGianTao, Float thanhTien, String ghiChu, NhanVien nhanVien) {
        this.thoiGianTao = thoiGianTao;
        this.thanhTien = thanhTien;
        this.ghiChu = ghiChu;
        this.nhanVien = nhanVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Date thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public Float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }


    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }


}
