package j10_StringManipulations;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.


        Scanner scanner = new Scanner(System.in);
        System.out.println("gmail hesabını giriniz : ");
        String cümle = scanner.nextLine().toLowerCase();



            if (cümle.endsWith("@gmail.com")) {
                System.out.println("hesabınız onaylandı");

            } else {
                System.out.println("Lütfen geçerli hesap giriniz");

            }if (cümle.contains("@gmail.com")) {
            System.out.println("Geçerli hesap");

             } else{
            System.out.println("Lütfen gmail hesabını giriniz");





            }

        }
    }






        

                









