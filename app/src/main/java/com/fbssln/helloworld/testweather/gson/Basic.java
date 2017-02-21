package com.fbssln.helloworld.testweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dev7-fub on 2017/2/20.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
