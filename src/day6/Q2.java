package day6;

import java.time.Period;

public class Q2 {
    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {

        String[] arr = {"fruits", "vegetables", "meat", "milk"};

        for (String each : arr) {
            System.out.print(each + " : " + each.length() + " ");

        }



        System.out.println();
        for (String each : arr) {


            if (each.startsWith("v")) {
                break;
            }
            System.out.println(each);
        }

    }
}
