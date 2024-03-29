package ru.qa.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.qa.appmanager.ApplicationManager;

public class TestBase {


    protected final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
      public void tearDown() throws Exception {
        app.stop();

    }

}
