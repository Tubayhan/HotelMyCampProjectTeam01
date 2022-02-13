package tests.US_0004;

import org.testng.annotations.Test;
import pages.HotelMyCampMain;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase01 {


    @Test
    public void test01() {
        HotelMyCampMain obj = new HotelMyCampMain();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    }
    //987
}
