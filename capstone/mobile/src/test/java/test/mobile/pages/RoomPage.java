package test.mobile.pages;

import io.appium.java_client.MobileBy;
import jnr.posix.MacOSFileStat;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.mobile.pageobject.BasePageObject;

public class RoomPage extends BasePageObject {

    //element
    private By viewAllRooms(){
        return MobileBy.xpath("(//android.widget.Button)[3]");
    }

    private By onListRoomPage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"One Pacific Place\"]");
    }

    private By clickRoom(){
        return MobileBy.xpath("(//android.widget.ImageView)[2]");
    }

    private By bookingButton(){
        return MobileBy.xpath("(//android.widget.Button)[2]");
    }

    private By validationRoomPage(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]");
    }

    private By bookingPage(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Booking Form\"]");
    }

    //function
    @Step
    public void clickViewRoom(){
        onClick(viewAllRooms());
    }

    @Step
    public boolean onTheListRoom(){
        return waitUntilVisible(onListRoomPage()).isDisplayed();
    }

    @Step
    public void clickExistingRoom(){
        onClick(clickRoom());
    }

    @Step
    public boolean validateOnRoomPage(){
        return waitUntilVisible(validationRoomPage()).isDisplayed();
    }

    @Step
    public void clickBookingButton(){
        onClick(bookingButton());
    }

    @Step
    public boolean onBookingPage(){
        return waitUntilVisible(bookingPage()).isDisplayed();
    }
}
