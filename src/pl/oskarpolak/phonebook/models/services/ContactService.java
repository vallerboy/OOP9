package pl.oskarpolak.phonebook.models.services;

import pl.oskarpolak.phonebook.models.Contact;

import java.util.List;

public interface ContactService {
    void addContact(Contact contact);
    List<Contact> getAllContacts();
}
