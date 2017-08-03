package com.example.xin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by xin on 2017/8/2.
 */

public class Weather {

    public String status;//对应返回的天气数据,成功返回OK，失败返回具体原因
    public Basic basic;//城市对应的天气以及更新时间
    public AQI aqi;//空气质量，pm2.5等
    public Now now;//温度以及天气情况
    public Suggestion suggestion;//出行建议

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;//对未来几天天气的预测
}
