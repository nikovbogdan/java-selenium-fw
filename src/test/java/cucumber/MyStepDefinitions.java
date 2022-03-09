package cucumber;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckboxPage;
import pages.DropdownPage;

public class MyStepDefinitions extends BaseTest {

    @Before
    public void beforeTest() {
        setupTheDriver();
        goHome();
    }

    @After
    public void atTheEnd() {
        driver.quit();
    }

    @Given("User navigates to homepage and clicks {string} link")
    public void userNavigatesToHomepageAndClicksLink(String link) {
        switch (link) {
            case "dropdown":
                var dropdown = homePage.clickDropdown();
                break;
            case "checkboxes":
                var checkboxes = homePage.clickCheckboxes();
                break;
        }

    }

    @When("user select {string}")
    public void userSelect(String option) {
        switch (option) {
            case "option 1" -> {
                var dd1 = new DropdownPage(driver);
                dd1.selectOption1();
            }
            case "option 2" -> {
                var dd2 = new DropdownPage(driver);
                dd2.selectOption2();
            }
        }
    }

    @Then("user will verify {string} is selected")
    public void userWillVerifyIsSelected(String option) {
        switch (option) {
            case "option 1" -> {
                var dd1 = new DropdownPage(driver);
                dd1.verifyOption1IsSelected();
            }
            case "option 2" -> {
                var dd2 = new DropdownPage(driver);
                dd2.verifyOption2IsSelected();
            }
            case "first" -> {
                var checkbox1 = new CheckboxPage(driver);
                checkbox1.verifyFirstCheckboxIsSelected();
            }
            case "second" -> {
                var checkbox2 = new CheckboxPage(driver);
                checkbox2.verifySecondCheckboxIsSelected();
            }
        }
    }

    @When("user marks {string} checkbox")
    public void userMarksCheckbox(String numberOfCheckbox) {
        switch (numberOfCheckbox) {
            case "first" -> {
                var checkbox1 = new CheckboxPage(driver);
                checkbox1.markFirstCheckbox();
            }
            case "second" -> {
                var checkbox2 = new CheckboxPage(driver);
                checkbox2.markSecondCheckbox();
            }
        }
    }

    @When("user UNMARK {string} checkbox")
    public void userUNMARKCheckbox(String option) {
        switch (option) {
            case "first" -> {
                var checkbox1 = new CheckboxPage(driver);
                checkbox1.unmarkFirstCheckbox();
            }
            case "second" -> {
                var checkbox2 = new CheckboxPage(driver);
                checkbox2.unmarkSecondCheckbox();
            }
        }

    }

    @Then("user will verify {string} is NOT selected")
    public void userWillVerifyIsNOTSelected(String option) {
        switch (option) {
            case "first" -> {
                var checkbox1 = new CheckboxPage(driver);
                checkbox1.verifyFirstCheckboxIsNotSelected();
            }
            case "second" -> {
                var checkbox2 = new CheckboxPage(driver);
                checkbox2.verifySecondCheckboxIsNotSelected();
            }
        }
    }
}
