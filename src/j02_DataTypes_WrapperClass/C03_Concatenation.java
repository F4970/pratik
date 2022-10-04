package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad= "ozge ";
        String soyad="celebi ";

        int a=7;
        int b=11;
        //Birden çok String variable ile farklı data type variablelar + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur.

        System.out.println(ad+soyad+a+b); // özgecelebi711 task:ad string string varsa bundan sonra hepsi string
        System.out.println(a+ad+soyad+b); // 7 özgeçelebi11
        System.out.println(a+b+ad+soyad); // integer ile başladı toplayacak 18özgecelebi
        System.out.println(" "+a+b); // çift tırnak varsa string ...711 olur
        System.out.println(ad+soyad+(a+b)); // özel yapılar önce çalışır özgeçelebi18
        System.out.println((a+b)+ad+soyad); // 18özgeçelebi
        System.out.println(ad+(a-b)+(a-b)); // özge-4-4
        System.out.println(ad+((a-b)+(a-b))); // özge-8


        char ch='1';//
        System.out.println(ad+ch); //özge1
        System.out.println(a+ch+ad);// hc 1 in ascıı da değeri 49 /49+7: 56 özge yazdırır
        System.out.println(ad+(ch+b)); //özge56
        System.out.println(a+ad+ch);// 7özge1

        /* TRICK: char data turu işleme girdiği variablesin turune göre farklı işlem yapar
        eğer işleme girdiği variables aritmetik bir işlemse ascii değeri ile işlem yapar
         */




    }
}
