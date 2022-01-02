package com.nminh.garage.dao;

import com.nminh.garage.model.HoaDonNhap;
import com.nminh.garage.model.LichHen;

import java.util.List;

public interface LichHenDao {
    LichHen taoLichHen(int nhanVienId, int khachHangId);
    boolean suaLichHen(int khachHangId,LichHen lh);
    boolean themLichHen(LichHen lichHen);
    LichHen timLichHen(int idLichHen);
    List<LichHen> getLichHen(String ten);
    List<LichHen> getListLichHen();
}
