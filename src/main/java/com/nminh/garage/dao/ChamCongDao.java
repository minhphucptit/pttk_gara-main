package com.nminh.garage.dao;

import com.nminh.garage.model.CaLam;

import java.util.Date;

public interface ChamCongDao {
    CaLam ChamCong(int nhanVienID, String caLam, Date ngay);
}
