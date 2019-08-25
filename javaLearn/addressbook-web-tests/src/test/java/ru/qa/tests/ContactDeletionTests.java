package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.ContactData;

public class ContactDeletionTests extends TestBase{
    @Test
     public void testContactDeletion(){
        app.getNavigationHelper().goToContactPage();
        if (!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Ivan", "Petrovic",
                    "Ivanov", "89994445533","test1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().closeAlertWindowWhenDelete();

    }
}
