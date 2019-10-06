package com.iknowvate.weather;

import com.iknowvate.weather.service.GetWeatherService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherApplicationTests {
    @Autowired
    private GetWeatherService getWeatherService;
    @Test
    public void checkCityName() {
        // given
       String expectedCity="Michigan";

        // when
        String foundCity = getWeatherService.getCityName("Michigan");

        // then
        Assert.assertEquals(expectedCity,foundCity);

        //NOT EQUALS
        double latitude = getWeatherService.getCode("Fairfield");//38.25
        Assert.assertNotEquals(latitude,38.29);
    }

}
