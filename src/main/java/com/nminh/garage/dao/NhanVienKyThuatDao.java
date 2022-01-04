package com.nminh.garage.dao;

import com.nminh.garage.model.NhanVienKyThuat;

import java.util.List;

public interface NhanVienKyThuatDao {
    NhanVienKyThuat themNVKT(NhanVienKyThuat data);
    NhanVienKyThuat suaNVKT(int id,NhanVienKyThuat data);
    List<NhanVienKyThuat> getdsNVKT();
    List<NhanVienKyThuat> getListNhanVienKyThuat(String name);
}
