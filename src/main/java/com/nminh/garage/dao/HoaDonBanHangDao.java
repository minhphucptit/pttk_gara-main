package com.nminh.garage.dao;

import com.nminh.garage.model.HoaDonBanHang;

import java.util.List;

public interface HoaDonBanHangDao {
    HoaDonBanHang themHoaDonBanHang(HoaDonBanHang hdbh);
    HoaDonBanHang suaHoaDonBanHang(HoaDonBanHang hd, int idHDBH);
    List<HoaDonBanHang> getHoaDonBanHang();
}
