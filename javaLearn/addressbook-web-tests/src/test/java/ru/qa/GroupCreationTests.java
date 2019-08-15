
package ru.qa;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {

        goToGroupPage();
        initGroupCreation();
        fillCreationForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreationForm();
        returnToGroupPage();

    }


}
