package com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TYPC on 2017/8/10.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
