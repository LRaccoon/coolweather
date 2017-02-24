package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 实况天气
 * Created by jb on 2017/2/24.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;  //温度
    @SerializedName("cond")
    public More more;   //天气状况

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
