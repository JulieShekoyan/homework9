package com.company;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        if (dateOfBirth >= 1950 && dateOfBirth <= 2021) {
            this.dateOfBirth = dateOfBirth;

        } else {
            System.out.println("Check age ");
        }
    }


    public Human() {

    }

    public Human(String name, String surname, int dateOfBirth) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                        ", Surname: " + surname +
                        ", Date Of Birth: " + dateOfBirth;
    }
}
