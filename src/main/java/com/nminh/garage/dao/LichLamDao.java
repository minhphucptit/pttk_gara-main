package com.nminh.garage.dao;

import com.nminh.garage.model.LichLam;

import java.util.List;

public interface LichLamDao {
    List<LichLam> getLichLams(int nhanVienId);

    LichLam getLichLam();
}
