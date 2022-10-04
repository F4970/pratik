package j11_MethodCreation;

public class C04_MethodDepo {

    //main method olmayacak... malzeme taşıyan römork

    /*HER CLASS DA MAİN METHOD MECBURİYETİ YOKTUR. BELİRLİ AKSİYONLARA ÖZEL CLASSLAR TANIMLANABİLİR.*/

    public static void geçmeNotu(int not) {

        if (not>=85) {
            System.out.println("agam tebrik çook başraılısın :) ");
        }else if (not>70) {
            System.out.println("agam başarılı");
        }else if (not >60) {
            System.out.println("agam sadece geçtin");
        }else if (not>=45) {
            System.out.println("agam ucuz yırttım :( ");
        }else System.out.println("agam fena çaktın :( ");

    }
    public static void topla (int a,int b ) {
        System.out.println(a + b);

    }









}
