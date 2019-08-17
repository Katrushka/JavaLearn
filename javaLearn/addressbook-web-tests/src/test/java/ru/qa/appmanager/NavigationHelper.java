package ru.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
    FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void goToHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    public void goToGroupPage() {

        wd.findElement(By.linkText("groups")).click();
    }

    public void goToContactPage() {

        wd.findElement(By.linkText("add new")).click();
    }


}
