package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.



 //task: string type verilen iki adet bağış miktarını toplayan code create ediniz.

        String bagıs1 ="1500";
        String bagış2 ="2500";

        int BağışDeğeri =Integer.valueOf(bagıs1); //bağış1 string içindeki sayı değerini int 'e çevirdi
        int BağışDeğeri2=Integer.valueOf(bagış2); //bagış2 string içindeki sayı değerini int'e çevirdi

        System.out.println("toplam bagış miktarı : " + (BağışDeğeri+BağışDeğeri2));

        int fetih=Integer.valueOf("1453");
        System.out.println(1453);

        System.out.println(Integer.parseInt(bagıs1) + Integer.parseInt(bagış2));//4000

        int tc=1234567;
        String strc = String.valueOf(tc);
        System.out.println("strc = " + strc);//1234567 **artık string oldu işlem yapılamaz
        System.out.println("strc+tc = " + (strc+tc));//12345671234567

        String fiyat="$150"; //cte verir replace yapılmalı dolar işareti hiçlik olmalı
        int yenifiyat = Integer.valueOf(fiyat);
        System.out.println("yenifiyat = " + yenifiyat);



    }
}
