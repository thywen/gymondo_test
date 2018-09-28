package de.svenkroell.gymondoTest.pageobjects;

import de.svenkroell.gymondoTest.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecipesPage extends BasePage {
    @FindBy(id = "sb-recipes")
    private WebElement searchBox;

    @FindBy(css = "div.sb-search__btn")
    private WebElement searchButton;

    private static String URL = Constants.BASE_URL + "/secure/#/recipes?page=0&size=16&sort=popularity";

    public RecipesPage(WebDriver driver) {
        super(driver, URL);
    }

    public void searchRecipe(String recipeName) {
        saveSendKeys(searchBox, recipeName);
        searchButton.click();
    }

    public RecipeDetailsPage openRecipe(String recipeName) {
        WebElement element = driver.findElement(
                By.xpath("//div[text()[contains(.,\"" + recipeName + "\")]]"));
        element.click();
        return initPage(RecipeDetailsPage.class);
    }
}
