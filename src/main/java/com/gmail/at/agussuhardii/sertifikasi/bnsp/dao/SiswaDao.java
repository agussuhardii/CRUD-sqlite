package com.gmail.at.agussuhardii.sertifikasi.bnsp.dao;

import com.gmail.at.agussuhardii.sertifikasi.bnsp.entity.SiswaEntity;

import java.util.List;

/**
 * Created by Agus Suhardi on 2/9/2017.
 */
public interface SiswaDao {
    public void save(SiswaEntity data);
    public void update(SiswaEntity data);
    public void delete(SiswaEntity data);
    public SiswaEntity findById(String id);
    public List<SiswaEntity> findAll();

}
