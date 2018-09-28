package de.svenkroell.gymondoTest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

class BasePage {

    private String url;
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
        this.wait = new WebDriverWait(driver, 10, 50);
    }

    public String getUrl() {
        return url;
    }

    void saveSendKeys(WebElement element, String text) {
        wait.until(visibilityOf(element));
        element.sendKeys(text);
    }

    void saveClick(WebElement element) {
        wait.until(visibilityOf(element));
        element.click();
    }

    <T extends BasePage> T initPage(Class<T> pageObject) {
        return PageFactory.initElements(driver, pageObject);
    }
}
