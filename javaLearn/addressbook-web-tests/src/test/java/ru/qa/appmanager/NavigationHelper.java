package ru.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper(FirefoxDriver wd) {
         super(wd);
    }

    public void goToHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    public void goToGroupPage() {

        click(By.linkText("groups"));
    }

    public void goToContactPage() {

        click(By.linkText("add new"));
    }


}
