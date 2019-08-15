package ru.qa;

import org.testng.annotations.Test;

public class GroupDeleteTests extends TestBase{


  @Test
  public void testGroupDelete() throws Exception {

    goToGroupPage();
    selectGroup();
    deleteGroup();
    returnToGroupPage();
  }


}
