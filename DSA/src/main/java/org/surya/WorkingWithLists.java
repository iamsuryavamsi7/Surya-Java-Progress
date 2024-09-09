package org.surya;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<String>();

        colors.add("blue");

        colors.add("Red");

        colors.add("Green");

        System.out.println(colors);

        for ( String color : colors ) {

            System.out.println(color);

        }

        colors.forEach(System.out::println);

        System.out.println("\n\n");

        System.out.println(colors.get(1));

    }

}
