package test.mobile.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;

public class BuildingPage extends BasePageObject {

    public void timeDelay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {}
    }

    //element
    private By onHomePage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Let's find your place for work\"]");
    }

    private By tabHome(){
        return MobileBy.AccessibilityId("Home Tab 1 of 4");
    }

    private By searchHomePage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Search\"]");
    }

    private By clickToBuilding(){
        return MobileBy.xpath("(//android.widget.ImageView)[4]");
    }

    private By onBuildingPage(){
        return MobileBy.xpath("(//android.view.View)[11]");
    }

    private By listRoom(){
        return MobileBy.xpath("(//android.widget.ImageView)[2]");
    }

    private By clickNearbyFacilities(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Nearby facilities\"]");
    }

    private By popUpNearby(){
        return MobileBy.className("android.widget.Button");
    }

    //function
    @Step
    public boolean onTheHomePage(){
        return waitUntilVisible(searchHomePage()).isDisplayed();
    }

    @Step
    public void clickBuilding(){
        onClick(clickToBuilding());
    }

    @Step
    public boolean onPageBuilding(){
        timeDelay(2000);
        return waitUntilVisible(onBuildingPage()).isDisplayed();
    }

    @Step
    public boolean seeListRoom(){
        return waitUntilVisible(listRoom()).isDisplayed();
    }

    @Step
    public void clickNearby(){
        onClick(clickNearbyFacilities());
    }

    @Step
    public boolean getPopUpNearby(){
        return waitUntilVisible(popUpNearby()).isDisplayed();
    }
}
