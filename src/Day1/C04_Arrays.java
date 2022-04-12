package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("olusturmak istediginiz listin uzunlugunu giriniz");
        int listeleng=scan.nextInt();



        List<Integer> list =new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz..");

        for (int i = 0; i < listeleng; i++) {
            list.add(scan.nextInt());

        }

        listeyeEkleme(list);

    }

    private static void listeyeEkleme(List<Integer> list) {
        List <Integer> tekrarliList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {//ilk liste
            for (int j = i+1; j < list.size(); j++) {//diger elemanlari bakiyor
                if (list.get(i)== list.get(j) && !tekrarliList.contains(list.get(j))) {

                    tekrarliList.add(list.get(j));
                }



            }


        }

        System.out.println("tekrarli liste : "+tekrarliList);
    }



}
