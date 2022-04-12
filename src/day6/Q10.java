package day6;

import java.util.Scanner;

public class Q10 {
    static  int toplam=0;
    public static void main(String[] args) {
        // istedigimiz kadar sayi girdigiimizde
        // toplamlari bize veren bir method yazalim...

        Scanner scan=new Scanner(System.in);


        int sayi=1;

        while(sayi>0){

            System.out.println("istediginiz kadar sayi giriniz :" +"\nsayilarin toplami icin 0 a basiniz ");
            sayi= scan.nextInt();
            sayiTopla(sayi);



        }
        System.out.println("toplam : "+toplam);




    }
    private static void sayiTopla(int...sayi){//varags oldugunu ... dan anliyoruz

        for (int each:sayi
             ) {toplam+=each;

        }

    }


}
