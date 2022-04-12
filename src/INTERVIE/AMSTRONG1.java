package INTERVIE;

import java.util.Scanner;

public class AMSTRONG1 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi=scan.nextInt();
        amstrong(sayi);
        girilenSayiyakadarOlanAmstrong(sayi);

    }



    private static void amstrong(int n) {
        int sayiniKupleriToplami=0;
        int basamaktakiRakam=0;
        int girilenSayi=n;

        while (n>0) {
            basamaktakiRakam=n%10;
            sayiniKupleriToplami+=(basamaktakiRakam*basamaktakiRakam*basamaktakiRakam);
            n=n/10;
        }
        if (sayiniKupleriToplami==girilenSayi) {
            System.out.println(girilenSayi+" sayisi amstriong sayidir");

        }else{
            System.out.println(girilenSayi+" sayisi amstriong sayi degildir");
        }

        System.out.println("************************************************");
    }

    //soru2 icin
    private static void girilenSayiyakadarOlanAmstrong(int sayi) {
        for (int i = 0; i <= sayi; i++) {
            amstrong(i);//recursive method uyguladik yani metot icinde method cagirdik


        }
    }
}
