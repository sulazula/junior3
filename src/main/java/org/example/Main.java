package org.example;

import org.example.repo.Person;
import org.example.repo.PersonRepo;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        PersonRepo pr = new PersonRepo();
        Person person = new Person("Bob", 22);

        pr.addPerson(person);
    }
}