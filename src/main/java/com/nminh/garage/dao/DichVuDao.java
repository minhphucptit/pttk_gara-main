package com.nminh.garage.dao;

import com.nminh.garage.model.DichVu;
import com.nminh.garage.model.PhuTung;

import java.util.List;

public interface DichVuDao {
    List<DichVu> getListDichVu();
    List<PhuTung> getPhuTung(String tuKhoa);
}
