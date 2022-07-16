package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class BuildingPage extends PageObject {

    //element

    private By buildingPage(){
        return By.xpath("//a[@href='/building']");
    }

    private By cretateBuildingButton(){
        return By.xpath("//button[normalize-space()='Create Building']");
    }

    private By nameBuildingField(){
        return By.xpath("//div[@class='flex flex-col gap-4 w-full']//input[@id='0']");
    }

    private By chooseComplex(){
        return By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[1]/select");
    }

    private By adrressBuildingField(){
        return By.xpath("//div[@class='flex flex-col gap-4 w-full']//input[@id='2']");
    }

    private  By descriptionField(){
        return By.xpath("//textarea[@id='3']");
    }

    private By facilitiesFieldName(){
        return By.xpath("//div[@class='grid grid-cols-3 gap-4 justify-items-start']//input[@id='0']");
    }

    private By distanceField(){
        return By.xpath("//div[@class='grid grid-cols-3 gap-4 justify-items-start']//input[@id='2']");
    }

    private By durationField(){
        return By.xpath("//input[@id='3']");
    }

    private By addFacilities(){
        return By.xpath("//button[normalize-space()='Add Nearby Facility']");
    }

    private By chooseCategoryFacilities(){
        return By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/div[1]/select");
    }

    private By addBuildingButton(){
        return By.xpath("//button[normalize-space()='Create Building']");
    }

    private By successButton(){
        return By.xpath("//button[normalize-space()='OK']");
    }

    private By errorEmptyData(){
        return By.xpath("//p[@class='has-text-centered text-error-red']");
    }


    //function
    @Step
    public void toBuildingPage(){
        $(buildingPage()).click();
    }

    @Step
    public boolean onBuildingPage(){
        return $(cretateBuildingButton()).isDisplayed();
    }

    @Step
    public void clickCreateBuilding(){
        $(cretateBuildingButton()).click();
    }

    @Step
    public void chooseExistingComplex(){
        $(chooseComplex()).selectByVisibleText("griya ahludzikra");
    }

    @Step
    public void NotchooseExistingComplex(){
        $(chooseComplex()).selectByVisibleText("Complex");
    }

    @Step
    public void fillNameBuilding(String name){
        $(nameBuildingField()).type(name);
    }

    @Step
    public void fillAddressBuilding(String Address){
        $(adrressBuildingField()).type(Address);
    }

    @Step
    public void fillDescriptionBuilding(String description){
        $(descriptionField()).type(description);
    }

    @Step
    public void chooseExistingFacilitiesCategory(){
        $(chooseCategoryFacilities()).selectByVisibleText("Hospital");
    }

    @Step
    public void fillNameFacilities(String nameFacilities){
        $(facilitiesFieldName()).type(nameFacilities);
    }

    @Step
    public void fillDistanceFacilities(String Distance){
        $(distanceField()).type(Distance);
    }

    @Step
    public void fillDurationFacilities(String duration){
        $(durationField()).type(duration);
    }

    @Step
    public void clickAddFacilities(){
        $(addFacilities()).click();
    }

    @Step
    public void clickAddBuilding(){
        $(addBuildingButton()).click();
    }

    @Step
    public void clickSuccessButton(){
        $(successButton()).click();
    }

    @Step
    public boolean getErrorEmpty(){
        return $(errorEmptyData()).isDisplayed();
    }

}
