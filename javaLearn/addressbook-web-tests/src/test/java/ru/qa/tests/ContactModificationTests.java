package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.ContactData;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification(){
        app.getNavigationHelper().goToContactPage();
        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Ivan", "Petrovic",
                    "Ivanov", "89994445533","test1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().editSelectedContact();
        app.getContactHelper().fillContactForm(new ContactData("Petrov","Anton",
                "Semenovich","89994445566",null), false);
        app.getContactHelper().submitModificationContactForm();
        app.getNavigationHelper().goToContactPage();
    }
}
