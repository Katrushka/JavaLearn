package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.GroupData;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", "null", "null"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));

        app.getGroupHelper().submitGroupModificationForm();
        app.getNavigationHelper().goToGroupPage();


    }
}
