package j06_Comparasion_Karsılastırma_Oparators;

public class C01_Comparison {
    public static void main(String[] args) {
//s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
//s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
//Böylece ekrana TRUE yazdırır.

        String s1="Kerem Bey";
        String s2="Kerem Bey";
        System.out.println(s2==s1); //true
    }
}
