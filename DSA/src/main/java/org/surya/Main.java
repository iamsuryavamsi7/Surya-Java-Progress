package org.surya;

public class Main{

    public static void main(String[] args) {

        int[] nums = {5, 6, 11, 13, 17};

        int target = 11;

        int result = linearSearch(nums, target);

        int result2 = binarySearch(nums, target);

        if ( result != -1) {

            System.out.println("\n\n\nElement found at Index in linear :- " + result + "\n\n\n");
            System.out.println("\n\n\n ELement found at Index in binary :- " + result2 + "\n\n\n");

        } else {

            System.out.println("\n\n\nElement Not Found\n\n\n");

        }

    }

    public  static int linearSearch(int[] nums, int target) {

        int steps = 0;

        for ( int i = 0; i < nums.length; i++ ) {

            steps++;

            if ( nums[i] == target ) {

                System.out.println("Steps taken by linear : " + steps);

                return i;

            }

        }

        System.out.println("Steps taken by linear : " + steps);

        return -1;

    }

    public  static int binarySearch(int[] nums, int target) {

        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while ( left <= right ) {

            steps++;

            int mid = (left + right) / 2;

            if ( nums[mid] == target ) {

                System.out.println("Steps taken by binary : " + steps);

                return mid;

            } else if ( nums[mid] < target ) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }


        System.out.println("Steps taken by binary :" + steps);

        return -1;

    }

}