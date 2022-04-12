package Day1;

import java.lang.reflect.Array;

public class C02_Array {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String[][] str={{"$12" , "$22" , "$0"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam=0;
        for (int i = 0; i < 3; i++) {//outer array
            for (int j = 0; j < 3; j++) {//inner array icin
                if (str[i][j].contains("$")) {
                    toplam+=Double.parseDouble(str[i][j].replace("$",""))*3.2;//parse metodu string ifadeyi integer a cevirir

                }else if(str[i][j].contains("€")) {
                    toplam+=Double.parseDouble(str[i][j].replace("€",""))*4.2;
                }


            }

        }
        System.out.println("toplam : "+toplam);







    }
}
