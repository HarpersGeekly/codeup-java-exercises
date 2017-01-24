package TestOOP;

import java.util.Scanner;
/**
 * Created by RyanHarper on 1/6/17.
 */
public class PersonObjectDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // create a new TestOOP.Person object based on the TestOOP.Person class:, and then two more people:

//        TestOOP.Person /*class*/ person1 /*variable*/ = new TestOOP.Person(); /*calls the object constructor (in Java has to have the same name remember?)*/
//        TestOOP.Person person2 = new TestOOP.Person();
//        TestOOP.Person person3 = new TestOOP.Person();

        Person firstPerson = getPerson(scan);
        System.out.println("Hello " + firstPerson.firstName + " " + firstPerson.lastName + ". Your email is: " + firstPerson.email);

//        System.out.println("Hello, what is your first name?");
//        person1.firstName = scan.nextLine();
//
//        System.out.println("What is your last name?");
//        person1.lastName = scan.nextLine();
//
//        System.out.println("What is your email address?");
//        person1.email = scan.nextLine();
//
//        System.out.println("Hello, " + person1.firstName + " " + person1.lastName + ", We have your email address as " + person1.email + "." + "\n");
//
//        System.out.println("We have two more people here.");
//        System.out.println("What is the second person's first name?");
//        person2.firstName = scan.nextLine();
//
//        System.out.println("What is the second person's last name?");
//        person2.lastName = scan.nextLine();
//
//        System.out.println("What is the second person's e-mail?");
//        person2.email = scan.nextLine();
//
//        System.out.println("What is the third person's first name?");
//        person3.firstName = scan.nextLine();
//
//        System.out.println("What is the third person's last name?");
//        person3.lastName = scan.nextLine();
//
//        System.out.println("What is the third person's email?");
//        person3.email = scan.nextLine();
//
//        System.out.println("Hello, " + person2.firstName + " " + person2.lastName + " and " + person3.firstName + " " + person3.lastName + "\n");
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
    }

    public static Person getPerson(Scanner scan) {

        Person person = new Person(); //making a new TestOOP.Person object and it calls the constructor.

        System.out.println("Hello new person, your serial number is " + person);
        System.out.println("First name?");
        person.firstName = scan.nextLine();
        System.out.println("Last name?");
        person.lastName = scan.nextLine();
        System.out.println("email?");
        person.email = scan.nextLine();

        return person;
    }
}
