package ru.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {


    protected WebDriver wd;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login("admin", "secret");
    }

    protected void goToHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    protected void submitCreation() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    protected void fillCreationForm(ContractData contractData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).sendKeys(contractData.getFirstname());
      wd.findElement(By.name("middlename")).click();
      wd.findElement(By.name("middlename")).sendKeys(contractData.getMiddlename());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).sendKeys(contractData.getLastname());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("theform")).click();
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).sendKeys(contractData.getMobile());
    }

    protected void goToContactPage() {
          wd.findElement(By.linkText("add new")).click();
      }


    private void logout() {
        wd.findElement(By.linkText("Logout")).click();
    }

    protected void submitGroupCreationForm() {
        wd.findElement(By.name("submit")).click();
    }

    protected void fillCreationForm(GroupData groupData) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    protected void returnToGroupPage() {
      wd.findElement(By.linkText("group page")).click();
    }

    protected void deleteGroup() {
      wd.findElement(By.xpath("(//input[@name='delete'])[2]")).click();
    }

    protected void selectGroup() {
      wd.findElement(By.name("selected[]")).click();
    }



    private void login(String username, String password) {
          wd.get("http://localhost/addressbook/");
          wd.findElement(By.name("user")).click();
          wd.findElement(By.name("user")).sendKeys(username);
          wd.findElement(By.id("LoginForm")).click();
          wd.findElement(By.name("pass")).click();
          wd.findElement(By.name("pass")).sendKeys(password);
          wd.findElement(By.xpath("//input[@value='Login']")).click();
      }

    @AfterClass(alwaysRun = true)
      public void tearDown() throws Exception {
          wd.quit();

      }

    private boolean isElementPresent(By by) {
          try {
              wd.findElement(by);
              return true;
          } catch (NoSuchElementException e) {
              return false;
          }
      }

    protected void goToGroupPage() {
      wd.findElement(By.linkText("groups")).click();
    }
}
