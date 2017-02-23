package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省份
 * Created by jb on 2017/2/23.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;    //省份
    private int provinceCode;   //省份编码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
