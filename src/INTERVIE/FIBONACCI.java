package INTERVIE;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FIBONACCI {/*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */

    public static void main(String[] args) {
        List <Integer> FIBONACCI=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi=scan.nextInt();

        FIBONACCI.add(0);
        FIBONACCI.add(1);
        int i=1;
        if (sayi<=1){
            System.out.println("daha buyuk tam sayi giriniz......");
        }else{
            while (FIBONACCI.get(i)<sayi) {//fibonaci elemanlari sayidan kucuk oldugu surece
                // bir onceki eleman ile topla
                FIBONACCI.add(FIBONACCI.get(i)+FIBONACCI.get(i-1));
                i++;
            }
            if (FIBONACCI.get(FIBONACCI.size()-1)>sayi){//fibonacideki son eleman sayidan buyukse
                FIBONACCI.remove(FIBONACCI.get(FIBONACCI.size()-1));//bu elemani kaldir
            System.out.println("girdiginiz sayi fibonaci dizisinde bulunmamaktadir " +
                    "\nGirilen sayiya kadar fibinaci dizisi :"+FIBONACCI);


        }else {
                System.out.println("girdiginiz sayi fibonacci dizisinde bulunmaktadir : "+FIBONACCI );

    }

}
    }
}

