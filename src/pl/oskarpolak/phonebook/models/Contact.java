package pl.oskarpolak.phonebook.models;

public class Contact {
    private String name;
    private String surname;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean validateAndSetNumber(String number){
        if(number.length() != 9){
            return false;
        }
        setNumber(number);
        return true;
    }
}
