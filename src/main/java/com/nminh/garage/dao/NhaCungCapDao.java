package com.nminh.garage.dao;

import com.nminh.garage.model.NhaCungCap;

import java.util.List;

public interface NhaCungCapDao {
    List<NhaCungCapDao> getListNhaCungCap();
    List<NhaCungCapDao> getNhaCungCapByName (String name);
    NhaCungCap getNhaCungCapById(int id);
    NhaCungCap luuNhaCungCap(NhaCungCap ncc);
    NhaCungCap capNhatNhaCungCap(NhaCungCap ncc);

}
