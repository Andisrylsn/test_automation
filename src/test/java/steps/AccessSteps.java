package steps;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.EbayHomePage;
import utils.WebDriverFactory;


public class AccessSteps {


    EbayHomePage ebayHomePage = new EbayHomePage();



    @Given("I Open Ebay")
    public void iOpenEbay() throws InterruptedException {
        ebayHomePage.openEbay();

    }


    @And("I Click Open Shop by category")
    public void iClickOpenShopByCategory() throws InterruptedException {
        ebayHomePage.clickButtonSearch();
        Thread.sleep(1000);
    }


    @And("I choose Electronics")
    public void iChooseElectronics() {
        ebayHomePage.clickTableCellAndAccessories();
    }

    @And("I choose Cell Phone And SmartPhones")
    public void iChooseCellPhoneAndSmartPhones() throws InterruptedException {
        ebayHomePage.clickCellAndSmartPhones();
    }

    @And("I click All Filters")
    public void iClickAllFilters() throws InterruptedException {
        ebayHomePage.clickAllFilters();


    }

    @And("I choose the condition")
    public void iChooseTheCondition() throws InterruptedException {
        ebayHomePage.clickConditionTextLabel();
    }

    @And("I click New Product")
    public void iClickNewProduct() throws InterruptedException {
        ebayHomePage.checkListCheckboxConditionNew();
    }

    @And("I choose price")
    public void iChoosePrice() throws InterruptedException {
        ebayHomePage.clickPriceTextLabel();
    }

    @And("I choose price from {int}")
    public void iChoosePriceFrom(int arg0) throws InterruptedException {
        String price = ""+arg0;
        ebayHomePage.fillPriceForm(price);
    }

    @And("I choose price to {int}")
    public void iChoosePriceTo(int arg0) throws InterruptedException {
        String price = ""+arg0;
        ebayHomePage.fillPriceTo(price);
    }

    @And("I choose location")
    public void iChooseLocation() throws InterruptedException {
        ebayHomePage.clickLocation();
    }

    @And("I choose detail location")
    public void iChooseDetailLocation() throws InterruptedException {
        ebayHomePage.clickLocationDetail();
    }

    @And("I clilck Apply")
    public void iClilckApply() {
        ebayHomePage.clickButtonApply();
    }



    @Then("verify is filters are apply")
    public void verifyIsFiltersAreApply()  throws InterruptedException{
        System.out.print("Status Label Verify : " + ebayHomePage.getVerifyTextLabel());
        Assert.assertTrue("true", ebayHomePage.getVerifyTextLabel().equalsIgnoreCase(" 3 filters applied"));
    }

    @And("typing product {string}")
    public void typingProduct(String arg0) {
        ebayHomePage.searchInGeneralSearch(arg0);
    }

    @And("change to gadget field")
    public void changeToGadgetField() {
        ebayHomePage.changeOptionForComputer();
    }


    @And("click button search")
    public void clickButtonSearch() {
        ebayHomePage.clickButtonSearch();
    }

    @And("verify contains the keyword {string}")
    public void verifyContainsTheKeyword(String arg0) throws InterruptedException {
        Assert.assertTrue("Passed", ebayHomePage.getVerifyTextLabel().toLowerCase().endsWith(arg0));
    }



    @And("click Option")
    public void clickOption() {
        ebayHomePage.clickOption();
    }

    @And("verify header contains the keyword {string}")
    public void verifyHeaderContainsTheKeyword(String arg0) throws InterruptedException {
        System.out.println(ebayHomePage.getTextFromHeader());
        Assert.assertTrue("Passed", ebayHomePage.getTextFromHeader().toLowerCase().endsWith(arg0));
    }

    @And("click search button")
    public void clickSearchButton() {
        ebayHomePage.clickSearchButton();
    }
}
