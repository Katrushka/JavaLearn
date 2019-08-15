package ru.qa;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{


    @Test
    public void testContactCreation() throws Exception {

        goToContactPage();
        fillCreationForm(new ContractData("Ivan", "Petrovic", "Ivanov", "89994445533"));
        submitCreation();
        goToHomePage();
    }


}
