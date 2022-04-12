package INTERVIE;

import java.util.Scanner;

public class PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        for (int i = 1; i <sayi ; i++) {
            mukemmelSayi(i);
        }
        mukemmelSayi(sayi);





    }

    private static void mukemmelSayi(int sayi) {
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {//1 den basliyor sayi dahil olmadigi icin esit degil
            if (sayi%i==0) {//sayinin herhangi bir boleni varsa
                toplam +=i;
                System.out.print(i+" ");


        }

    }
        if (toplam==sayi){//bolenlerin toplami sayiya esitse
            System.out.println(sayi+" sayisi mukemmel sayidir");
        }else {
            System.out.println(sayi+" sayisi mukemmel sayi degildir");
        }
}

}
