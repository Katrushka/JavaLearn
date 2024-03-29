package ru.qa.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.qa.model.GroupData;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void submitGroupCreationForm() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }


    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void deleteGroup() {
        click(By.xpath("(//input[@name='delete'])[2]"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModificationForm() {
        click(By.name("update"));
    }

    public void createGroup(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreationForm();
        returnToGroupPage();

    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));

    }
}
