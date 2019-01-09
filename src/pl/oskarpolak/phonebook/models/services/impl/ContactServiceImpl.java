package pl.oskarpolak.phonebook.models.services.impl;

import pl.oskarpolak.phonebook.models.Contact;
import pl.oskarpolak.phonebook.models.services.ContactService;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {

    private List<Contact> contacts = new ArrayList<>(); //baza danych

    @Override
    public void addContact(Contact contact) {
        if(isSurnameExistsInDatabase(contact.getSurname())){
            return;
        }

        contacts.add(contact);
    }


    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }

    private boolean isSurnameExistsInDatabase(String surname) {
        for (Contact contact : contacts) {
             if(contact.getSurname().equals(surname)){
                 return true;
             }
        }
        return false;
    }
}
