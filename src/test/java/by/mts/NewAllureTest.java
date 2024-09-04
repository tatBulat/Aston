package by.mts;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewAllureTest extends PageTests {

    private PaymentPage paymentPage;

    @BeforeMethod
    public void setup() {
        driver.get("https://mts.by");
        paymentPage = new PaymentPage(driver);
        paymentPage.declineCookies();
    }

    @Test
    @Description("Проверка placeholder полей услуг связей")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Платежи")
    @Feature("Интернет")
    @Story("Placeholder для интернет-услуг")
    public void testPlaceholdersForInternetServices() {
        paymentPage.selectService("Услуги связи", "//input[@placeholder='Номер телефона']", "//input[@placeholder='Сумма']", "//input[@placeholder='E-mail для отправки чека']");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement phoneNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Номер телефона']")));

        Assert.assertEquals(phoneNumberField.getAttribute("placeholder"), "Номер телефона");
        Assert.assertEquals(paymentPage.getAmountPlaceholder(), "Сумма");
        Assert.assertEquals(paymentPage.getEmailPlaceholder(), "E-mail для отправки чека");
    }
}
