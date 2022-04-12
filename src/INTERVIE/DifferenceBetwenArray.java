package INTERVIE;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DifferenceBetwenArray {/*
Create a function that takes an array and the difference between the largest
and the smallest numbers.
Ask user to enter array elements.
   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

    public static void main(String[] args) {
        arraylustur();

    }

    private static void arraylustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("array uzunlugu giriniz : ");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.print("arrayin " +(i+1)+" inci elemani giriniz :");
            arr[i]=scan.nextInt();
            Arrays.sort(arr);

            System.out.println("arrayin son ve ilk elemanlarinin farki : "+(arr[uzunluk-1] - arr[0]));

        }

    }
}
