package com.iknowvate.weather.models;

import java.util.ArrayList;
import java.util.List;

public class Wdetails {
    Coord CoordObject;
    //ArrayList<Object> weather = new ArrayList<Object>();
    Weather[] weather;
    Main MainObject;
    Wind WindObject;
    Rain RainObject;
    Clouds CloudsObject;
    Sys SysObject;
    private String base;
    private float visibility;
    private float dt;
    private float timezone;
    private float id;
    private String name;
    private float cod;

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }
//    public ArrayList<Object> getWeather() {
//        return weather;
//    }
//
//    public void setWeather(ArrayList<Object> weather) {
//        this.weather = weather;
//    }
//    public ArrayList<Object> getWeather() {
//        return weather;
//    }
//
//    public void setWeather(ArrayList<Object> weather) {
//        this.weather = weather;
//    }



    public Coord getCoordObject() {
        return CoordObject;
    }

    public void setCoordObject(Coord coordObject) {
        CoordObject = coordObject;
    }

    public Main getMainObject() {
        return MainObject;
    }

    public void setMainObject(Main mainObject) {
        MainObject = mainObject;
    }

    public Wind getWindObject() {
        return WindObject;
    }

    public void setWindObject(Wind windObject) {
        WindObject = windObject;
    }

    public Rain getRainObject() {
        return RainObject;
    }

    public void setRainObject(Rain rainObject) {
        RainObject = rainObject;
    }

    public Clouds getCloudsObject() {
        return CloudsObject;
    }

    public void setCloudsObject(Clouds cloudsObject) {
        CloudsObject = cloudsObject;
    }

    public Sys getSysObject() {
        return SysObject;
    }

    public void setSysObject(Sys sysObject) {
        SysObject = sysObject;
    }
    // Getter Methods

    public Coord getCoord() {
        return CoordObject;
    }

    public void setCoord(Coord coordObject) {
        this.CoordObject = coordObject;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return MainObject;
    }

    public void setMain(Main mainObject) {
        this.MainObject = mainObject;
    }

    public float getVisibility() {
        return visibility;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return WindObject;
    }

    public void setWind(Wind windObject) {
        this.WindObject = windObject;
    }

    public Rain getRain() {
        return RainObject;
    }

    public void setRain(Rain rainObject) {
        this.RainObject = rainObject;
    }

    public Clouds getClouds() {
        return CloudsObject;
    }

    // Setter Methods

    public void setClouds(Clouds cloudsObject) {
        this.CloudsObject = cloudsObject;
    }

    public float getDt() {
        return dt;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return SysObject;
    }

    public void setSys(Sys sysObject) {
        this.SysObject = sysObject;
    }

    public float getTimezone() {
        return timezone;
    }

    public void setTimezone(float timezone) {
        this.timezone = timezone;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCod() {
        return cod;
    }

    public void setCod(float cod) {
        this.cod = cod;
    }
}

