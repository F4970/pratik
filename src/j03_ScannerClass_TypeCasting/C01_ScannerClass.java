package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için şu 3 adım takip edilir
        //1.adım: Scanner class'dan obje crate edilir

        Scanner scan=new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obje)
        
        
        //2.adım: Kullanıcıdan istenen veri için bildirimde bulunulur: sout("...");
        System.out.println("adınızı giriniz");
        
        //3.adım: kullanıcının girdiği veri data type'na göre bir veriable atanır.
        //String isim=scan.nextLine();//kullanıcıdan gelen String tipinde isim verisi scan objni nextLine methodu ile atandı

        //System.out.println("isim = " + isim);

        //TASK: Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz...

        //Scanner scanner= new Scanner(System.in);//1.adım
        //System.out.println("karenin kenarını giriniz :");//2.adım
        //int kenar= scan.nextInt();//3.adım
        //int çevre;
        //System.out.println("alan: +(kenar*kenar)+"çevre: "+kenar*4"));
        /*
        Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
        Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
        1 seker = 1.7 gr
        Ornek : Input : cay sayisi : 10 seker sayisi :2
        Output : Yilda 12.41 kg seker kullaniyorsunuz
        */
        System.out.println("günlük içtiğiniz çay sayısını giriniz:"); //2.adım
        int caySayisi= scan.nextInt();//çay için 3.adım

        System.out.println("şeker sayinizi giriniz : ");//şeker için 2.adım
        int seker= scan.nextInt();// şeker için 3. adım


        System.out.println("yıllık şeker tüketiminiz :" + (caySayisi*seker*1.7*365)/100+"kg");

        Scanner sc = new Scanner(System.in);//1.adım
        System.out.println("isminizi giriniz :"); //2.adım
        char ch=sc.nextLine().charAt(0);//kullanıcıdan gelen string ifadenin 0.index ilk karakterini alır
        System.out.println("isminizin ilk karakteri"+ch);

        //String isim =sc.nextLine(); //kullanıcının girdiği tüm satırı isim'e atar.
        //String isim =sc.nextLine(); //kullanıcının girdiği tüm satırı isim'e atar.
        //String isim =sc.next(); //kullanıcının girdiği ilk ifadeyi ad'a atar.


       // System.out.println("isim=" + isim);







    }
}
