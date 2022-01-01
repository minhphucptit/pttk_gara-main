package com.nminh.garage.dao;

import com.nminh.garage.model.CaLam;
import com.nminh.garage.model.LichLam;

import javax.xml.crypto.Data;

public interface TinhLuongDao {
    LichLam TinhLuong(int khoangThoiGian, int NhanVienID, CaLam listCalam);
}
