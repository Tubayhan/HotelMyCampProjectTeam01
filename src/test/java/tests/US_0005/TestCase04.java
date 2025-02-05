package tests.US_0005;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampHotelList;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase04 {
    HotelMyCampHotelList hmclist;
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Test()
    public void test04(){
       hmclist=new HotelMyCampHotelList();


        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView()",hmclist.alertOkayButonu);

        js.executeScript("arguments[0].click()",hmclist.alertOkayButonu);
        ReusableMethods.waitForVisibility(hmclist.alertTexti,10);

       Assert.assertTrue(hmclist.alertTexti.isDisplayed());





    }

}
