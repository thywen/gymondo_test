package de.svenkroell.gymondoTest.pageobjects;

import de.svenkroell.gymondoTest.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class RecipeDetailsPage extends BasePage {
    @FindBy(css = "h2.recipe-summary__header")
    private WebElement recipeHeader;

    private static String URL = Constants.BASE_URL + "secure/#/recipes/";

    public RecipeDetailsPage(WebDriver driver) {
        super(driver, URL);
    }

    public String getRecipeName() {
        wait.until(visibilityOf(recipeHeader));
        return recipeHeader.getText();
    }
}
