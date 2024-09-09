package org.surya;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WorkingWIthArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];

        colors[0] = "Purple";
        colors[1] = "Blue";

        System.out.println(Arrays.toString(colors));

        colors[2] = "Red";

        System.out.println(Arrays.toString(colors));

        int[] numbers = { 100, 200};

        String[] names = {"Surya", "Vamsi", "Yeshwanth", "Gokul"};

        System.out.println(Arrays.toString(names));

        names[2] = "Surya";

        System.out.println(Arrays.toString(names));

        for ( int i = 0; i < names.length; i++ ) {

            System.out.println(names[i]);

        }

        Arrays.stream(colors).forEach(System.out::println);



    }

}