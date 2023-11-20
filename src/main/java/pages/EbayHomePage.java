package pages;

import io.cucumber.java.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class EbayHomePage {

    private final WebDriver driver = WebDriverFactory.getDriver();
    private final By buttonSearchByCategory = By.id("gh-shop-a");
    private final By textLabelElectronics = By.linkText("Cell phones & accessories");
    private final By textLabelCellPhoneAndSmartPhones = By.linkText("Cell Phones & Smartphones");
    private final By filters = By.xpath("//button[text()=\"All Filters\"]");

    private final By conditionTextLabel = By.id("c3-mainPanel-condition");

    private final By phone = By.xpath("(//option)[9]");
    public void clickOption(){
        driver.findElement(phone).click();
    }

    private final By h1 = By.xpath("//h1");
    public String getTextFromHeader() throws InterruptedException {
        Thread.sleep(2000);
       return driver.findElement(h1).getText();
    }

    private final By searchButton = By.id("gh-btn");
    public void  clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    private final By optionGeneralSearchForComputer = By.id("gh-cat");

    public void changeOptionForComputer(){
        driver.findElement(optionGeneralSearchForComputer).click();
    }

    private final By generalSearch = By.id("gh-ac");
    public void searchInGeneralSearch(String keyword){
        driver.findElement(generalSearch).sendKeys(keyword);
    }

    private final By dropdownGeneralSearch = By.id("gh-cat-box");
    public void clickDropDownGeneralSearch(){
        driver.findElement(dropdownGeneralSearch).click();
    }

    public void clickConditionTextLabel() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(conditionTextLabel).click();
    }

    private final By checkBoxConditionNew = By.id("c3-subPanel-LH_ItemCondition_New_cbx");

    public void checkListCheckboxConditionNew() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(checkBoxConditionNew).click();
    }
    private final By priceTextLabel = By.id("c3-mainPanel-price");
    public void clickPriceTextLabel() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(priceTextLabel).click()    ;
    }

    private final By priceFrom = By.xpath("//input[@class=\"x-textrange__input x-textrange__input--from\"]");
    public void fillPriceForm(String price) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(priceFrom).sendKeys(price);
    }


    private final By priceTo = By.xpath("//input[@class=\"x-textrange__input x-textrange__input--to\"]");
    public void fillPriceTo(String price) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(priceTo).sendKeys(price);
    }


    private final By locationTextLabel = By.id("c3-mainPanel-location");
    public void clickLocation() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(locationTextLabel).click();
    }

    private final By locationDetail = By.xpath("//span//input[@value=\"Europe\"]");
    public void clickLocationDetail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(locationDetail).click();
    }

    private final By buttonApply = By.xpath("//button[@class=\"x-overlay-footer__apply-btn btn btn--primary\"]\n");
    public void clickButtonApply(){
        driver.findElement(buttonApply).click();
    }


    private final By verifyTextLabel = By.id("s0-28_1-9-0-1[0]-0-0-6-8-4[0]-flyout");
    //3 filters apply

    public String getVerifyTextLabel() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(verifyTextLabel).getText();
    }
    public void openEbay() throws InterruptedException {
        driver.get("https://www.ebay.com/");
        Thread.sleep(1000);
    }

    public void clickButtonSearch(){
        driver.findElement(buttonSearchByCategory).click();
    }


    public void clickTableCellAndAccessories(){
        driver.findElement(textLabelElectronics).click();
    }

    public void clickCellAndSmartPhones() throws InterruptedException{
        driver.findElement(textLabelCellPhoneAndSmartPhones).click();
        Thread.sleep(1000);
    }

    public void clickAllFilters() throws InterruptedException {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 500)");
        driver.findElement(filters).click();
    }



}
