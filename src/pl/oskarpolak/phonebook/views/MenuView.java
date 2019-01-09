package pl.oskarpolak.phonebook.views;

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
}
