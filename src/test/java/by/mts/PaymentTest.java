package by.mts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class PaymentTest extends PageTests {
    private PaymentPage paymentPage;

    @BeforeMethod
    public void setUpTest() {
        driver.get("https://mts.by/");
        paymentPage = new PaymentPage(driver);
        paymentPage.declineCookies();
    }

    @Test
    public void testSubmitButton() {
        WebElement phoneField = driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        WebElement amountField_1 = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));

        phoneField.sendKeys("297777777");
        amountField_1.sendKeys("10");
        emailField.sendKeys("test@example.com");
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement paymentModal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div")));

        WebElement amountElement = paymentModal.findElement(By.xpath("//span[contains(text(), '10.00 BYN')]"));
        WebElement phoneNumberElement = paymentModal.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span"));

        WebElement visaIcon = paymentModal.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[1]"));
        WebElement mastercardIcon = paymentModal.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div/img[2]"));

        WebElement cardNumberField = paymentModal.findElement(By.xpath("//div[@class='content-container ng-tns-c46-1']//input[@id='cc-number']"));
        cardNumberField.sendKeys("4111111111111111");

        WebElement expiryDateField = paymentModal.findElement(By.xpath("//div[@class='content-container ng-tns-c46-4']//input[@placeholder='MM / YY']"));
        expiryDateField.sendKeys("12/24");

        WebElement cvcField = paymentModal.findElement(By.xpath("//div[@class='content-container ng-tns-c46-5']//input[@name='verification_value']"));
        cvcField.sendKeys("123");

        WebElement cardHolderNameField = paymentModal.findElement(By.xpath("//div[@class='content-container ng-tns-c46-3']//input[@name='holder']"));
        cardHolderNameField.sendKeys("IVAN IVANOV");

        WebElement payButton = paymentModal.findElement(By.xpath("//button[@type='submit' and contains(normalize-space(), 'Оплатить 10.00 BYN')]"));
        payButton.click();

    }
}

