package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        // 1.yol.. best practice (Recomended) tavsiye edilen
        int yas =48;
        int maas=33000;
        System.out.println(yas);//48
        System.out.println("yas");//yas
        System.out.println(maas);//33000;
        System.out.println("nur hanım başlangıç maaşı : " +maas);//nur hanm başlangıç maaşı : 33000
        // 2.yol
        int boy; // değeri atanmayan boy isminde bir int tanımalndı declaration
       // System.out.println(boy);// değeri atanmamış değişkeni hiç bir aksiyonda kullanılamaz CTE
        boy=175;
        System.out.println(boy);//175


        //3.yol
        int yevmiye,age,kilo;// birden çok aynı tipte değişken tanımlandı
        age=33;
        yevmiye=1000;
        kilo=99;// tanımlanan değişkenlere değer ataması yapıldı..

        int gunluk =1500, yil=2022, agirlik=99;
                //TRICK bir variable bir kez tanımlanabilir ama birden çok değer atanabilir
        System.out.println(gunluk);//1500

        gunluk=1800;// gunluk yeni değeri 1800 olarak atandı
        System.out.println("gunluk son değeri : " +gunluk);//1800
        System.out.println("gunluk değeri:" + gunluk+"yıl değeri :"+yil+ "+yil+yas+yevmiye+agirlik");


    }
}
