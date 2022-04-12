package INTERVIE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.valueOf;

public class IntervieQuestion4_4 {
     /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */

    public static void main(String[] args) {
        List <String> list = new ArrayList<>(Arrays.asList("$13", "$15", "$-20"));
        System.out.println(getSum(list));


    }

    private static int getSum(List<String> list) {
        int toplam = 0;
        for (String each:list) {
            String str=each.replace("$","");
            toplam+=Integer.parseInt(str);//String olan degerleri casting ile int cevirdik


        }
       if (toplam<0){

           return -1;//toplam 0 dan kucukse method -1 dondursun dedigi icin yaptik
       }
       else return toplam;//0 dan buyukse toplami dondursun dedik
    }
}
