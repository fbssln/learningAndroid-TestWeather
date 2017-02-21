package com.fbssln.helloworld.testweather.gson;

/**
 * Created by dev7-fub on 2017/2/20.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
