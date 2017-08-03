package com.example.xin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xin on 2017/8/2.
 */

public class Basic {
    //JSON中的一些字段不适合直接作为Java字段来命名，因此使用@SerializedName注解的方式让JSON字段和
    //Java字段之间建立映射关系
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
