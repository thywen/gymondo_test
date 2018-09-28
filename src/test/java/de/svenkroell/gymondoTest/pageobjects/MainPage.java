package de.svenkroell.gymondoTest.pageobjects;

import de.svenkroell.gymondoTest.Constants;
import de.svenkroell.gymondoTest.model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage {
    @FindBy(css = "button.btn-rev--ghost.header__login-btn")
    private WebElement headerLoginButton;

    @FindBy(id = "login-form__mail")
    private WebElement emailField;

    @FindBy(id = "login-form__secret")
    private WebElement passwordField;

    @FindBy(css = "button.login-login")
    private WebElement loginButton;

    private static String URL = Constants.BASE_URL + "#/";

    public MainPage(WebDriver driver) {
        super(driver, URL);
    }

    public LoggedInMainPage login(User user) {
        openLoginPopup();
        saveSendKeys(emailField, user.getEmail());
        passwordField.sendKeys(user.getPassword());
        loginButton.click();
        return initPage(LoggedInMainPage.class);
    }

    private void openLoginPopup() {
        headerLoginButton.click();
    }
}
