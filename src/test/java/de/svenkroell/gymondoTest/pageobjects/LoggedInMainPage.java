package de.svenkroell.gymondoTest.pageobjects;

import de.svenkroell.gymondoTest.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInMainPage extends BasePage {
    @FindBy(xpath = "//a[@ui-sref='recipes']")
    private WebElement recipesTab;

    private static final String URL = Constants.BASE_URL + "secure/#/training/timeline";

    public LoggedInMainPage(WebDriver driver) {
        super(driver, URL);
    }

    public RecipesPage openRecipesPage() {
        saveClick(recipesTab);
        return initPage(RecipesPage.class);
    }
}
