package ru.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.qa.model.ContractData;

public class ContactHelper {
    FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void submitCreation() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillCreationForm(ContractData contractData) {
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
}
