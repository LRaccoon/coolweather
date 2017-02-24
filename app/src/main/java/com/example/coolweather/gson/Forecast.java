package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 7-10天预报
 * Created by jb on 2017/2/24.
 */

public class Forecast {
    public String date;//预报日期
    @SerializedName("tmp")
    public Temperature temperature; //温度
    @SerializedName("cond")
    public More more;   //天气状况

    public class More {
        @SerializedName("txt_d")
        public String info;  //白天天气状况描述
    }

    public class Temperature {
        public String max;//最高温度
        public String min;//最低温度
    }
}
