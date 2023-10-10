package org.jrescalante.peoplelistapp;

import org.jrescalante.peoplelistapp.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();
        boolean goOut = false;

        while (!goOut){
            showMenu();
            try {
                goOut = executeOperation(console, peopleList);
            }catch (Exception e){
                System.out.println("An error ocurred -> " + e.getMessage());
            }
            System.out.println();

        }

    }

    private static void showMenu(){
        System.out.print( """
               *** PeopleList APP ***
               1. Add person
               2. To list
               3. Amount of people
               4. Salir
               """);
        System.out.print("Enter the option-> ");
    }

    private static boolean executeOperation(Scanner console, List<Person>peopleList){
        var option = Integer.parseInt(console.nextLine());
        var goOut = false;
        switch (option){
            case 1 -> addPerson(console,peopleList);
            case 2 -> seePeople(peopleList);
            case 3 -> System.out.println(peopleList.size());
            case 4 ->{
                System.out.println("See you soon");
                goOut = true;
            }
            default -> System.out.println("Wrong option -> " + option);
        }

        return goOut;


    }

    private static void addPerson(Scanner console, List<Person> peopleList){
        System.out.print("Enter the name: ");
        var name = console.nextLine();
        System.out.print("Enter the phone number: ");
        var tel = console.nextLine();
        System.out.print("Enter the email: ");
        var email = console.nextLine();
        var person = new Person(name, tel, email);
        peopleList.add(person);

    }
    private static void seePeople( List<Person> peopleList){
        System.out.println("List of people");
        peopleList.forEach(System.out::println);
    }
}