package de.svenkroell.gymondoTest.pageobjects;

import de.svenkroell.gymondoTest.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecipesPage extends BasePage {
    @FindBy(id = "sb-recipes")
    private WebElement searchBox;

    private static String URL = "/secure/#/recipes?page=0&size=16&sort=popularity";

    public RecipesPage(WebDriver driver) {
        super(driver, URL);
    }

    public void searchRecipe(String recipeName) {
        searchBox.sendKeys(recipeName);
    }

    public RecipeDetailsPage openRecipe(String recipeName) {
        driver.findElement(
                By.xpath("//*[contains(text(), " + recipeName + ")]"))
                .click();
        return initPage(RecipeDetailsPage.class);
    }
}
