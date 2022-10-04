package j11_MethodCreation;

import java.util.Scanner;

public class methodtask1 {
    public static void main(String[] args) {

         /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

            Scanner scan = new Scanner(System.in);
            System.out.print("bir sayı giriniz: ");
            int max = scan.nextInt();
            System.out.println(randomNum(max));
        }
        public static double randomNum ( int max){
            double maxi = Math.random() * max;
            return maxi;

        }
    }