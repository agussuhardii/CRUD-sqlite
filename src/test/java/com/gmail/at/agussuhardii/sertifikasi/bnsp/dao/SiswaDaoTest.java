package com.gmail.at.agussuhardii.sertifikasi.bnsp.dao;

import com.gmail.at.agussuhardii.sertifikasi.bnsp.config.HibernateUtil;
import com.gmail.at.agussuhardii.sertifikasi.bnsp.entity.SiswaEntity;
import org.junit.Test;

/**
 * Created by Agus Suhardi on 4/16/2017.
 */
public class SiswaDaoTest {

    SiswaDao dao = HibernateUtil.getSiswaDao();

    @Test
    public void saveTest(){
        SiswaEntity s = new SiswaEntity("S001", "suhardi", 80, 3, "erna");
        dao.save(s);
    }


}
