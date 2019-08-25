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
        if (isElementPresent(By.xpath("h1"))
                && wd.findElement(By.xpath("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;

        }
        click(By.linkText("groups"));
    }

    public void goToContactPage() {
        if(isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.linkText("home"));
    }


}
