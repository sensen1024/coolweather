package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 森森 on 2017/11/29.
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