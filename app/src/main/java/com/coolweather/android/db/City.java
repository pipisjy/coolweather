package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id1;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id1;
    }

    public void setId(int id) {
        this.id1 = id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
