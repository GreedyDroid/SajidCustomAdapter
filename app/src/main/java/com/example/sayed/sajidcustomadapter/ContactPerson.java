package com.example.sayed.sajidcustomadapter;

import java.util.ArrayList;

/**
 * Created by nurud on 2/18/2018.
 */

public class ContactPerson {




    private String personName;
    private String phoneNumber;
    private int personImage;

    public ContactPerson() {
    }

    public ContactPerson(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }

    public ContactPerson(String personName, String phoneNumber, int personImage) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.personImage = personImage;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public ArrayList<ContactPerson> getAllPersons(){
        ArrayList<ContactPerson> persons = new ArrayList<>();
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082", R.drawable.ic_launcher_foreground));
        persons.add(new ContactPerson("Sayed Mahmud Sakib", "01673535025"));
        persons.add(new ContactPerson("Estiack Amin", "01726297807"));
        persons.add(new ContactPerson("Fahima Amin", "01820278202"));
        persons.add(new ContactPerson("Shahin Ara Begum", "01715533712"));
        persons.add(new ContactPerson("Nurul Amin", "01720278202"));

        return persons;

    }
}
