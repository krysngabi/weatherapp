package com.iknowvate.weather.models;

public class Main {
    private float temp;
    private float pressure;
    private float humidity;
    private float temp_min;
    private float temp_max;
    public int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

// Getter Methods

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    // Setter Methods

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }
}
