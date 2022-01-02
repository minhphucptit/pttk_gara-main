package com.nminh.garage.dao;

import com.nminh.garage.model.ThanhVien;

import java.util.List;

public interface TaiKhoanDao {
    List<ThanhVien> getTaiKhoan();
    ThanhVien themTaiKhoan(ThanhVien tv);
    boolean  voHieuHoaTaiKhoan(int thanhVienId);
}
