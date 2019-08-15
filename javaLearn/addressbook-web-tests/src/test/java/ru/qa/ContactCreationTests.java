package ru.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContactCreationTests {
    private WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    @Test
    public void testContactCreation() throws Exception {

        goToContactPage();
        fillCreationForm(new ContractData("Ivan", "Petrovic", "Ivanov", "89994445533"));
        submitCreation();
        goToHomePage();
    }

  private void goToHomePage() {
    driver.findElement(By.linkText("home page")).click();
  }

  private void submitCreation() {
    driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  private void fillCreationForm(ContractData contractData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(contractData.getFirstname());
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).sendKeys(contractData.getMiddlename());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys(contractData.getLastname());
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("theform")).click();
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(contractData.getMobile());
  }

  private void goToContactPage() {
        driver.findElement(By.linkText("add new")).click();
    }

    private void login(String username, String password) {
        driver.get("http://localhost/addressbook/");
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.id("LoginForm")).click();
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
