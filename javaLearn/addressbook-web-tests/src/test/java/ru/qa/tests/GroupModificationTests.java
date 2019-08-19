package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.GroupData;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test4", "test5", "test6"));
        app.getGroupHelper().submitGroupModificationForm();
        app.getNavigationHelper().goToGroupPage();


    }
}
