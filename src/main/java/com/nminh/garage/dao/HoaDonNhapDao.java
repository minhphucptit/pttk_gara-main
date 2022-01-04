package com.nminh.garage.dao;

import com.nminh.garage.model.ChiTietHoaDon;
import com.nminh.garage.model.HoaDonBanHang;
import com.nminh.garage.model.HoaDonNhap;

import java.util.List;

public interface HoaDonNhapDao {
    HoaDonNhap taoHoaDon(int nhanVienId, List<ChiTietHoaDon> listPT, float tongTien);
    List<HoaDonNhap> getListHoaDon();
}
