package ru.qa.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String mobile;

    public ContactData(String firstname, String middlename, String lastname, String mobile) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.mobile = mobile;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMobile() {
        return mobile;
    }
}
