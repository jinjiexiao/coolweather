package com.example.xiao.coolweather.gson;

/**
 * Created by xiao on 2017/6/24.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
