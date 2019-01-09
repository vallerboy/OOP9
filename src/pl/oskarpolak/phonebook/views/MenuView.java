package pl.oskarpolak.phonebook.views;

import pl.oskarpolak.phonebook.models.Contact;

import java.util.List;

public class MenuView {

    public void printMenu() {
        System.out.println("1. Dodaj kontakt");
        System.out.println("2. Wyświetl wszystkie kontakty");
        System.out.println("exit. Aby wyjść");
    }

    public void askForAnswer() {
        System.out.print("Podaj odpowiedź: ");
    }

    public void askForNumber(){
        System.out.print("Podaj numer: ");
    }

    public void askForName(){
        System.out.print("Podaj imię: ");
    }

    public void askForSurname(){
        System.out.print("Podaj nazwisko: ");
    }

    public void printContactList(List<Contact> contactList){
        for (Contact contact : contactList) {
            System.out.println(contact.getName() + " " + contact.getSurname() + ": " + contact.getNumber());
        }
    }
}
