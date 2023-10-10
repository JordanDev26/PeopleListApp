package org.jrescalante.peoplelistapp.models;

public class Person {
    private int id;
    private String name;
    private String tel;
    private String email;
    private static int counter;

    public Person() {
        this.id = ++counter;
    }

    public Person(String name, String tel,String email) {
        this();
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Id: ").append(id)
                .append(", Name: ").append(name).append(", Tel: ").append(tel)
                .append(", Email: ").append(email);
        return sb.toString();
    }
}
