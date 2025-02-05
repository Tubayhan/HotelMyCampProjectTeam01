package tests.US_0005;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TestCase05 {
    HotelMyCampHotelList hmclist;
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test()
    public void test05() throws IOException {

        hmclist=new HotelMyCampHotelList();


        js.executeScript("arguments[0].scrollIntoView()",hmclist.deleteButonuWebElementi);
        js.executeScript("arguments[0].click()",hmclist.deleteButonuWebElementi);
        ReusableMethods.waitForVisibility(hmclist.deleteAlertYazisi,10);
        Assert.assertTrue(hmclist.deleteAlertYazisi.isDisplayed());

        String expectedDeleteAlertYazisi="Would you like to continue?";
        System.out.println(expectedDeleteAlertYazisi);

        ReusableMethods.switchToWindow("Admin - List Of Hotels");
        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshot("Son Guncelleme");
        ReusableMethods.waitFor(2);


        hmclist.tearDown();


    }
}