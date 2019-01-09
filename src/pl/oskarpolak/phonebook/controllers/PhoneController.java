package pl.oskarpolak.phonebook.controllers;

import pl.oskarpolak.phonebook.views.MenuView;
import java.util.Scanner;

public class PhoneController {

    private MenuView menuView;
    private Scanner scanner;


    public PhoneController() {
        menuView = new MenuView();
        scanner = new Scanner(System.in);
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
                getContactFromUser();
                break;
            }
            case "2": {

                break;
            }
        }
    }

    private void getContactFromUser() {
        menuView.askForNumber();
        String number = scanner.nextLine();

        menuView.askForName();
        String name = scanner.nextLine();

        menuView.askForSurname();
        String surname = scanner.nextLine();


    }
}
