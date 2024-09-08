package org.surya;

public class Main{

    public static void main(String[] args){

        int[] numbs = {6, 5, 2, 8, 9, 4};

        int size = numbs.length;

        int temp = 0;

        System.out.println("\nBefore sorting");

        for ( int num : numbs ) {

            System.out.print(num + ", ");

        }

        for ( int i = 0; i < size; i++ ) {

            for ( int j = 0; j < size - 1 ; j++ ) {

                if ( numbs[j] > numbs[j+1] )  {

                    temp = numbs[j];
                    numbs[j] = numbs[j + 1];
                    numbs[j + 1] = temp;

                }

            }

        }

        System.out.println("\n\nAfter sorting");

        for ( int num : numbs ) {

            System.out.print(num + ", ");

        }

    }

}