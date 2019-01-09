package pl.oskarpolak.phonebook.controllers;

import pl.oskarpolak.phonebook.models.Contact;
import pl.oskarpolak.phonebook.models.services.ContactService;
import pl.oskarpolak.phonebook.models.services.impl.ContactServiceImpl;
import pl.oskarpolak.phonebook.views.MenuView;
import java.util.Scanner;

public class PhoneController {

    private MenuView menuView;
    private Scanner scanner;
    private ContactService contactService;


    public PhoneController() {
        menuView = new MenuView();
        scanner = new Scanner(System.in);
        contactService = new ContactServiceImpl();
    }

    public void start() {
        String answer;
        do{
            menuView.askForAnswer();
            answer = scanner.nextLine();

            parseAnswer(answer);
        }while (!answer.equals("exit"));
    }

    private void parseAnswer(String answer) {
        switch (answer){
            case "1": {
                contactService.addContact(getContactFromUser());
                break;
            }
            case "2": {
                
                break;
            }
        }
    }

    private Contact getContactFromUser() {
        menuView.askForNumber();
        String number = scanner.nextLine();

        menuView.askForName();
        String name = scanner.nextLine();

        menuView.askForSurname();
        String surname = scanner.nextLine();

        return new Contact(name, surname, number);
    }
}
