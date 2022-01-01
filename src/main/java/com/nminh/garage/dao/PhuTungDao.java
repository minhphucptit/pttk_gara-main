package com.nminh.garage.dao;

import com.nminh.garage.model.PhuTung;

import java.util.List;

public interface PhuTungDao {
    PhuTung themPhuTung(PhuTung phuTung);
    PhuTung suaPhuTung(int PhuTungId,PhuTung phuTung);
    List<PhuTung> getListPhuTung();
    List<PhuTung> getListPhuTungByNCC(int ncc);
    void xoaPhuTung(int phuTungId);
}
