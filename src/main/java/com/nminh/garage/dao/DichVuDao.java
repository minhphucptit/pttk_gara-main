package com.nminh.garage.dao;

import com.nminh.garage.model.DichVu;

import java.util.List;

public interface DichVuDao {
    List<DichVu> getListDichVu();

    DichVu getDichVu(int Id_DichVu);

    DichVu themDichVu();

    DichVu xoaDichVu();

    DichVu suaDichVu(int Id_dichVu);

}
