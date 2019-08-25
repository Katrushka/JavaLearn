package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.GroupData;

public class GroupDeleteTests extends TestBase {


  @Test
  public void testGroupDelete() throws Exception {

    app.getNavigationHelper().goToGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test1",null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteGroup();
    app.getGroupHelper().returnToGroupPage();
  }


}
