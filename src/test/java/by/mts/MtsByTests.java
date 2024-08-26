package by.mts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MtsByTests extends LocatorsTests {

    @Test
    public void testBlockTitle() {
        driver.get("https://mts.by");
        WebElement title = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        Assert.assertEquals(title.getText(), "Онлайн пополнение\nбез комиссии");


    }

    @Test
    public void testPaymentSystemLogos() {
        driver.get("https://mts.by");
        WebElement visaLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        WebElement masterCardLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        WebElement belkartLogo = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));

        Assert.assertTrue(visaLogo.isDisplayed());
        Assert.assertTrue(masterCardLogo.isDisplayed());
        Assert.assertTrue(belkartLogo.isDisplayed());

    }

    @Test
    public void testLearnMoreLink() {
        driver.get("https://mts.by");
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        WebElement link = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        String actualUrl = link.getAttribute("href");

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Ссылка ведет на правильный URL.");
        } else {
            System.out.println("Ссылка ведет на неправильный URL. Ожидался: " + expectedUrl + ", но был: " + actualUrl);
        }
        link.click();

    }

    @Test
    public void testSubmitButton() {
        driver.get("https://mts.by");
        WebElement phoneField = driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        WebElement amountField = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='E-mail для отправки чека']"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));

        phoneField.sendKeys("297777777");
        amountField.sendKeys("10");
        emailField.sendKeys("test@example.com");
        submitButton.click();

        driver.quit();
    }
}
