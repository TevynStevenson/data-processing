package com.pluralsight.loops;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Initialize new people
        Person person1 = new Person("John", "Smith", 28);
        Person person2 = new Person("Sarah", "Johnson", 34);
        Person person3 = new Person("Michael", "Williams", 42);
        Person person4 = new Person("Emily", "Brown", 25);
        Person person5 = new Person("David", "Jones", 31);
        Person person6 = new Person("Jessica", "Garcia", 29);
        Person person7 = new Person("Robert", "Miller", 55);
        Person person8 = new Person("Ashley", "Davis", 22);
        Person person9 = new Person("James", "Wilson", 47);
        Person person10 = new Person("Amanda", "Taylor", 38);

        //Initialize arrayList
        //Add persons to the ArrayList
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

        //Input scanner and prompt user to search for a name
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name: (First or Last) ");

        //Save user input
        String name = input.nextLine();

        //Add for loop to search through list of persons
        //Check to see if the name matches user input
        //If so , print name
        for (Person person : people) {
            if (person.getFirstName().equals(name)) {
                System.out.println("Matching name: "
                        + person.getFirstName() + " "
                        + person.getLastName());
            } else if (person.getLastName().equals(name)) {
                System.out.println("Matching name: "
                        + person.getLastName() + " "
                        + person.getFirstName() + "\n");
            }
        }


        //Run average age method
        Program program = new Program();
        program.averageAge(people);
        System.out.println();

        //Run oldestAge method
        program.oldestAge(people);
        System.out.println();

        //Run youngestAge method
        program.youngestAge(people);
        System.out.println();


    }

    public void averageAge(List<Person> people) {

        //Set toal age variable
        int totalAge = 0;

        //Add for loop to sort through people
        for (Person person : people) {
            totalAge += person.getAge();
        }

        //Add formula
        double averageAge = (double) totalAge / people.size();

        System.out.println("Average age of people: " + averageAge);
    }

    public void oldestAge(List<Person> people) {

        //Set maxAge variable to people list
        int maxAge = people.get(0).getAge();

        //Initialize oldest person
        Person oldestPerson = people.get(0);

        //Add for loop to sort through the people
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
                oldestPerson = person;
            }
        }

        System.out.println("Oldest Person: "
                + oldestPerson.getFirstName() + " "
                + oldestPerson.getLastName() + " "
                + oldestPerson.getAge());
    }

    public void youngestAge(List<Person> people) {

        int minAge = people.get(0).getAge();

        Person youngestPerson = people.get(0);

        //Add for loop to sort through people
        for(Person person : people){
            if(person.getAge() < minAge){
                minAge = person.getAge();
                youngestPerson = person;
            }
        }

        System.out.println("Youngest Person: "
        + youngestPerson.getFirstName() + " "
        + youngestPerson.getLastName() + " "
        + youngestPerson.getAge());

    }
}
