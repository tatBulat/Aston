package by.mts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LetteringTests extends PageTests {

    private PaymentPage paymentPage;

    @BeforeMethod
    public void setUpTest() {
        driver.get("https://mts.by/");
        paymentPage = new PaymentPage(driver);
        paymentPage.declineCookies();
    }

    @Test
    public void testPlaceholdersForMobileServices() {
        paymentPage.selectService(
                "Услуги связи",
                "//input[@placeholder='Номер телефона']",                                               // XPath для поля номера телефона
                "//input[@placeholder='Сумма']",                                                                        // XPath для поля суммы
                "//input[@placeholder='E-mail для отправки чека']"                                                      // XPath для поля e-mail
        );

        Assert.assertEquals(paymentPage.getPhoneNumberPlaceholder(), "Номер телефона");
        Assert.assertEquals(paymentPage.getAmountPlaceholder(), "Сумма");
        Assert.assertEquals(paymentPage.getEmailPlaceholder(), "E-mail для отправки чека");
    }

    @Test
    public void testPlaceholdersForHomeInternet() {
        paymentPage.selectService(
                "Домашний интернет",
                "//input[@placeholder='Номер абонента']",                                               // XPath для поля номера абонента
                "//input[@placeholder='Сумма']",                                                                        // XPath для поля суммы
                "//input[@placeholder='E-mail для отправки чека']"                                                      // XPath для поля e-mail
        );

        Assert.assertEquals(paymentPage.getPhoneNumberPlaceholder(), "Номер абонента");
        Assert.assertEquals(paymentPage.getAmountPlaceholder(), "Сумма");
        Assert.assertEquals(paymentPage.getEmailPlaceholder(), "E-mail для отправки чека");
    }

    @Test
    public void testPlaceholdersForInstallmentPlan() {
        paymentPage.selectService(
                "Рассрочка",
                "//input[@placeholder='Номер счета на 44']",                                            // XPath для поля номера счета
                "//input[@placeholder='Сумма']",                                                                        // XPath для поля суммы
                "//input[@placeholder='E-mail для отправки чека']"                                                      // XPath для поля e-mail
        );

        Assert.assertEquals(paymentPage.getPhoneNumberPlaceholder(), "Номер счета на 44");
        Assert.assertEquals(paymentPage.getAmountPlaceholder(), "Сумма");
        Assert.assertEquals(paymentPage.getEmailPlaceholder(), "E-mail для отправки чека");
    }

    @Test
    public void testPlaceholdersForDebtPayment() {
        paymentPage.selectService(
                "Задолженность",
                "//input[@placeholder='Номер счета на 2073']",                                          // XPath для поля номера счета
                "//input[@placeholder='Сумма']",                                                                        // XPath для поля суммы
                "//input[@placeholder='E-mail для отправки чека']"                                                      // XPath для поля e-mail
        );

        Assert.assertEquals(paymentPage.getPhoneNumberPlaceholder(), "Номер счета на 2073");
        Assert.assertEquals(paymentPage.getAmountPlaceholder(), "Сумма");
        Assert.assertEquals(paymentPage.getEmailPlaceholder(), "E-mail для отправки чека");

        driver.quit();
    }
}
