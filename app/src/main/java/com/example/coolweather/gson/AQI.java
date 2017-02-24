package com.example.coolweather.gson;

/**
 * 空气质量
 * Created by jb on 2017/2/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
