package ru.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.qa.model.ContactData;

public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitCreation() {
      click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("middlename"),contactData.getMiddlename());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("mobile"),contactData.getMobile());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void editSelectedContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitModificationContactForm() {
        click(By.name("update"));
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void closeAlertWindowWhenDelete() {
        wd.switchTo().alert().accept();
    }

    public void openContactForm() {
        click(By.linkText("add new"));
    }

    public void createContact(ContactData contact) {
        openContactForm();
        fillContactForm(contact,true);
        submitCreation();

    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
}
