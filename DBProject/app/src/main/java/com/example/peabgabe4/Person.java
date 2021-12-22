package com.example.peabgabe4;

/**
 * POJO Klasse für Person.
 * Desweiteren wird noch ComparTo überschrieben.
 */
public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    Person() {
    }

    @Override
    public int compareTo(Person p2) {
        Person p1 = this;
        if (p1.getFirstName().toLowerCase().equals(p2.getFirstName().toLowerCase())) {
            return p1.getAge() - p2.getAge();
        } else {
            return p1.getFirstName().toLowerCase().compareTo(p2.getFirstName().toLowerCase());
        }
    }
}
