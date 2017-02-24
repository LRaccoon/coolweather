package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 基本信息
 * Created by jb on 2017/2/24.
 */
public class Basic {
    @SerializedName("city")
    public String cityName; //城市
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
