package ie.atu;

import java.util.Scanner;
public class Person {
    String firstName;
    String lastName;
    int age;

    // Default Constructor
    public  Person() {
        this.firstName = "John";
        this.lastName = "Doe";
        this.age = 30;
    }
    // Constructor
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age);
    }

    public class Main {
        public static void main(String[] args) {
            // Create a new person object
            Person johnDoe = new Person("Andrew", "Fox", 30);
            // Call displayInfo()
            johnDoe.displayInfo();
        }
    }


}
