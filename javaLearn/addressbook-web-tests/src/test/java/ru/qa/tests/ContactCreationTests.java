package ru.qa.tests;

import org.testng.annotations.Test;
import ru.qa.model.ContractData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {

        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().fillCreationForm(new ContractData("Ivan", "Petrovic", "Ivanov", "89994445533"));
        app.getContactHelper().submitCreation();
        app.getNavigationHelper().goToContactPage();
    }


}
