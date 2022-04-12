package INTERVIE;

import java.util.ArrayList;
import java.util.List;

public class IntervieQuestion4_1 {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        randomekle(list);


    }

    private static void randomekle(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() *20));//0-20 arasi sayi ekler
            // double veri tipine sahip olanMath.random classini
            // casting ile int yaptik
        }
        int sayac=0;
        for (int i = 0; i < list.size(); i++) {//ramdom olusuturlan elemanlarin listesine bakiyoruz

            if (list.get(i)%2==0){//cift sayi varsa
                sayac++;
                list.set(i,111);
            }

        }
        System.out.println("111 eklendikten sonra "+list);
        if (sayac==0) {
            System.out.println("listede cift sayi yoktur");
        }

        System.out.println("ramdom list : "+list);
    }


}
