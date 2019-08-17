
package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.GroupData;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillCreationForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreationForm();
        app.getGroupHelper().returnToGroupPage();

    }


}
