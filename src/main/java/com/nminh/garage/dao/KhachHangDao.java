package com.nminh.garage.dao;

import com.nminh.garage.model.KhachHang;

import java.util.List;

public interface KhachHangDao {
    KhachHang themKhachHang(KhachHang kh);
    KhachHang suaKhachHang(int khachHangId,KhachHang kh);
    List<KhachHang> getListKhachHang();
    List<KhachHang> getListKhachHang(String name);
}
