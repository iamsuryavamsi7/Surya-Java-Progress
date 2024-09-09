package org.surya;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

    public static void main(String[] args) {

        LinkedList<Person> linkedlist = new LinkedList<>();

    }

    public static void queue(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Surya", 21));
        supermarket.add(new Person("Gokul", 26));
        supermarket.add(new Person("Kusuma", 53));

        System.out.println(supermarket);

        System.out.println(supermarket.poll());

        System.out.println(supermarket);

    }

    record Person(String name, int age){}

}
