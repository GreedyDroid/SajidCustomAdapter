package com.example.sayed.sajidcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mylistView;
    private ArrayList<ContactPerson> persons;
    private ContactPerson contactPerson;
    private PersonAdapter PersonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylistView = findViewById(R.id.listView);
        contactPerson = new ContactPerson();
        persons = contactPerson.getAllPersons();
        PersonAdapter = new PersonAdapter(this,persons);
        mylistView.setAdapter(PersonAdapter);
    }
}
