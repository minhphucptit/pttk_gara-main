package com.nminh.garage.dao;

import com.nminh.garage.model.NhanVien;

import java.util.List;

public interface NhanVienDao {
    NhanVien suaNhanVien(int NhanVienId);
    List<NhanVien> getListNhanVien();
    NhanVien getNhanVien();
}
