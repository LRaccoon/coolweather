package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 生活指数
 * Created by jb on 2017/2/24.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort; //舒适度指数
    @SerializedName("cw")
    public CarWash carWash; //洗车指数
    public Sport sport; //运动指数

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
