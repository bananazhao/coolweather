package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TYPC on 2017/8/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;

    }
}
