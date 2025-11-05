package com.pluralsight.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jerry",     "Pittman",   19));
        people.add(new Person("Rachael",    "Strong",    22));
        people.add(new Person("Rae",  "Shepherd",     35));
        people.add(new Person("Bernardo",    "Torres",    28));
        people.add(new Person("Gregorio",    "Franklin",    41));
        people.add(new Person("Jane",    "Doe",      31));
        people.add(new Person("Nathan",    "Fox",    26));
        people.add(new Person("Brenton",   "Barry",     24));
        people.add(new Person("Victoria",     "French",       18));
        people.add(new Person("Timothy",   "Ortega",     29));
        people.add(new Person("Alex",    "Johnson",  33));


        System.out.print("Please enter a name(First or Last) to search:");
        String input = scanner.nextLine().trim();

        List<Person> matches = new ArrayList<>();

        for (Person p : people) {
            if (p.getFirstName().equalsIgnoreCase(input) ||
                    p.getLastName().equalsIgnoreCase(input)) {
                matches.add(p);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("No match found for: " + input);
        } else {
            System.out.println("Matches:");
            for (Person match : matches) {
                System.out.println(" - " + match.getFirstName() + " - " + match.getLastName() + " - " + match.getAge() );
            }
        }
        int avgAge = 0;
        int oldest = -1;
        int youngest = 1000;

        for (Person person: people) {
            avgAge += person.getAge();
            if (person.getAge() > oldest)  oldest = person.getAge();
            if (person.getAge() < youngest) youngest = person.getAge();
        }
        System.out.println("Average Age of all People: " + avgAge / people.size());
        System.out.println("Oldest Age of all People: " + oldest);
        System.out.println("Youngest Age of all People: " + youngest);




    }
}
