package javatask1;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {

        /* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz : ");
        double boy = scanner.nextDouble();
        boy=boy/100;
        System.out.println("Kilonuzu kg cinsinden giriniz :");
        double kilo = scanner.nextDouble();

        double vke = (kilo / (boy*boy));


        if (vke <= 20 ) {
            System.out.println("oldukca zayıfsınız");
         }else if (vke >20 && vke <=25){
                System.out.println("Normal sınırlardasınız");
          } else if (vke>25 && vke<=30) {
            System.out.println("Sisman kategorisindesiniz");
          }  else if (vke>30) {
            System.out.println("Obez grubundasınız");

        }
                }

        }























