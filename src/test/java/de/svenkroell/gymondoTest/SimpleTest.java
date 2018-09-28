package de.svenkroell.gymondoTest;

import de.svenkroell.gymondoTest.model.User;
import de.svenkroell.gymondoTest.pageobjects.LoggedInMainPage;
import de.svenkroell.gymondoTest.pageobjects.MainPage;
import de.svenkroell.gymondoTest.pageobjects.RecipeDetailsPage;
import de.svenkroell.gymondoTest.pageobjects.RecipesPage;
import de.svenkroell.gymondoTest.repositories.UserRepository;
import de.svenkroell.gymondoTest.support.PropertyLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SimpleTest {

    private static WebDriver driver;
    private MainPage mainPage;
    private UserRepository userRepository;


    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        new PropertyLoader().loadProperties();
        mainPage = PageFactory.initElements(driver, MainPage.class);
        userRepository = new UserRepository();
        driver.get(mainPage.getUrl());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void name() throws Exception {
        User user = userRepository.getStandardUser();
        String recipe = "Rogg'n Roll";

        //LoggedInMainPage loggedInMainPage = mainPage.login(user);
//        RecipesPage recipesPage = loggedInMainPage.openRecipesPage();
//        recipesPage.searchRecipe(recipe);
//        RecipeDetailsPage recipeDetailsPage = recipesPage.openRecipe(recipe);
//
//        assertThat(recipeDetailsPage.getRecipeName()).isEqualTo(recipe);
    }
}
