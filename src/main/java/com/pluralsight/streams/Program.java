package com.pluralsight.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
         * Jerry Pittman
         * Rachael Strong
         * Rae Shepherd
         * Bernardo Torres
         * Gregorio Franklin
         * Nathan Fox
         * Brenton Barry
         * Victoria French
         * Timothy Ortega
         * Roslyn Tran
        */
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


        System.out.println("Please enter a name(First and Last) to search:");
        String input = scanner.nextLine().trim();

        List<Person> matches = new ArrayList<>();

        for (int i = 0; i < people.size(); i++){


        }

    }
}
