package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {

        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().createContact(new ContactData("Ivan", "Petrovic",
                "Ivanov", "89994445533","test1"));
        app.getNavigationHelper().goToContactPage();
    }


}
