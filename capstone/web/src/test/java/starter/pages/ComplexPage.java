package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Pause;

public class ComplexPage extends PageObject {

    //element

    private By onHomePage(){
        return By.xpath("//span[text()='logout']");
    }

    private By complexPage(){
        return By.xpath("//a[@href='/complex']");
    }

    private By createComplexButton(){
        return By.xpath("//button[normalize-space()='Create Complex']");
    }

    private By nameFieldComplex(){
        return By.xpath("//input[@placeholder='Complex Name']");
    }

    private By addressField(){
        return By.xpath("//input[@name='complexAddress']");
    }

    private By chooseProvince(){
        return By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/select[1]");
    }

    private By chooseCity(){
        return By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/select[2]");
    }

    private By chooseDistrict(){
        return By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/select[3]");
    }

    private By addCompelx(){
        return By.xpath("//button[text()='Add Complex']");
    }

    private By clickSuccess(){
        return By.xpath("//button[normalize-space()='OK']");
    }

    private By editButton(){
        return By.xpath("//tbody/tr[4]/td[8]/button[1]/a[1]//*[name()='svg']");
    }

    private By deleteButton(){
        return By.xpath("//tbody/tr[8]/td[8]/button[2]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]");
    }

    private By confirmDelete(){
        return By.xpath("//button[text()='Delete']");
    }

    private By errorNoName(){
        return By.xpath("//p[text()='Complex Name must be filled']");
    }

    private By errorNoAddress(){
        return By.xpath("//p[text()='Complex Address must be filled']");
    }

    private By errorNoProvince(){
        return By.xpath("//p[text()='Province must be selected']");
    }

    private By errorNoCity(){
        return By.xpath("//p[text()='City must be selected']");
    }

    private By errorNoDistrict(){
        return By.xpath("//p[text()='District must be selected']");
    }

    private By errorEmptyData(){
        return By.xpath("//p[text()='Please fill out all fields']");
    }


    //function

    @Step
    public boolean validationOnHomepage(){
        return $(onHomePage()).isDisplayed();
    }

    @Step
    public void clickComplex(){
        $(complexPage()).click();
    }

    @Step
    public boolean validationOnComplexPage(){
        return $(createComplexButton()).isDisplayed();
    }

    @Step
    public void clickCreateNewComplex(){
        $(createComplexButton()).click();
    }

    @Step
    public void fillName(String name){
        $(nameFieldComplex()).type(name);
    }

    @Step
    public void fillAddress(String address){
        $(addressField()).type(address);
    }


    @Step
    public void chooseExistingProvince(){
        $(chooseProvince()).selectByVisibleText("Lampung");
    }

    @Step
    public void notChooseExistingProvince(){
        $(chooseProvince()).selectByVisibleText("Province");
    }

    @Step
    public void chooseExistingCity(){
        $(chooseCity()).selectByVisibleText("Bandar Lampung");
    }

    @Step
    public void NotChooseExistingCity(){
        $(chooseCity()).selectByVisibleText("City");
    }

    @Step
    public void chooseExistingDistrict(){
        $(chooseDistrict()).selectByVisibleText("Rajabasa");
    }

    @Step
    public void NotChooseExistingDistrict(){
        $(chooseDistrict()).selectByVisibleText("District");
    }

    @Step
    public void clickAddComplex(){
        $(addCompelx()).click();
    }

    @Step
    public void clickSuccessButton(){
        $(clickSuccess()).click();
    }

    @Step
    public void clickEditButton(){
        $(editButton()).click();
    }

    @Step
    public void clickDeleteButton(){
        $(deleteButton()).click();
    }

    @Step
    public void clickConfirmDelete(){
        $(confirmDelete()).click();
    }

    @Step
    public boolean getErrorNoName(){
        return $(errorNoName()).isDisplayed();
    }

    @Step
    public boolean getErrorNoAddress(){
        return $(errorNoAddress()).isDisplayed();
    }

    @Step
    public boolean getErrorNoProvince(){
        return $(errorNoProvince()).isDisplayed();
    }

    @Step
    public boolean getErrorNoCity(){
        return $(errorNoCity()).isDisplayed();
    }

    @Step
    public boolean getErrorNoDistrict(){
        return $(errorNoDistrict()).isDisplayed();
    }

    @Step
    public boolean getErrorEmptyData(){
        return $(errorEmptyData()).isDisplayed();
    }
}
