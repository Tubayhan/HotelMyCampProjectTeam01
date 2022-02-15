package tests.US_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampMain;

public class TestCase01 {

    //Anasayfadaki sag üstteki navigasyon barinda "Log in" butonu görülebilmelidir-AC1

    HotelMyCampMain loginpage;

    @Test
    public void seeIfLogIn(){

        loginpage=new HotelMyCampMain();
       // boolean actualLoginIfDisplayed = loginpage.logInButon.isDisplayed();
       // Assert.assertTrue(actualLoginIfDisplayed);

        //String currentURL = driver.getCurrentUrl();
        //System.out.println(currentURL);
        //Assert.assertEquals(currentURL, "https://www.hotelmycamp.com/");
    }

    }















