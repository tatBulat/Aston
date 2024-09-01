package by.mts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends PageTests {
    private WebDriver driver;

    private By phoneNumberField;
    private By amountField;
    private By emailField;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectService(String service, String phoneNumberXPath, String amountXPath, String emailXPath) {
        WebElement dropdown = driver.findElement(By.xpath("//button[@class='select__header']"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//button[@class='select__header']"));
        option.click();

        this.phoneNumberField = By.xpath(phoneNumberXPath);
        this.amountField = By.xpath(amountXPath);
        this.emailField = By.xpath(emailXPath);
    }

    public String getPhoneNumberPlaceholder() {
        return driver.findElement(phoneNumberField).getAttribute("placeholder");
    }

    public String getAmountPlaceholder() {
        return driver.findElement(amountField).getAttribute("placeholder");
    }

    public String getEmailPlaceholder() {
        return driver.findElement(emailField).getAttribute("placeholder");
    }

    public void declineCookies() {
        WebElement declineButton = driver.findElement(By.xpath("//button[text()='Принять']"));
        if (declineButton.isDisplayed()) {
            declineButton.click();
        }
    }
}

