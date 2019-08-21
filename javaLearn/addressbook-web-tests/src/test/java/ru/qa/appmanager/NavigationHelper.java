package ru.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver wd) {
         super(wd);
    }

    public void goToHomePage() {
      wd.findElement(By.linkText("home page")).click();
    }

    public void goToGroupPage() {

        click(By.linkText("groups"));
    }

    public void goToContactPage() {

        click(By.linkText("home"));
    }


}
