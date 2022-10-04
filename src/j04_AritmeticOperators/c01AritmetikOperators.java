package j04_AritmeticOperators;

class C01AritmetikOperators {
    public static void main(String[] args) {
        //int a=13;
        int b=17;
        int c=47;

        //System.out.println(b+a*c);//628
        //System.out.println(c-a/(b-c)+a*b);//268

        int g=2;
        int h=3;
        String  s="JavaCAN";
//Task-> g h s variable'ları kullanarak 61JavaCAN-1 print eden code create ediniz.

        int a=7;

        System.out.println(++a);// 8 //(önce arttırır sonra yazdırır)
        System.out.println(a++);// 9 //(önce yazdırır sonra arttırır)
        System.out.println(a);  //9 //(önce arttırır sonra yazdırır)
        System.out.println(a++ + ++a);// 20//(önce yazdırcak 9 sonra arttırıp 10 olucak
                                            // önce artcak 11 sonra yazdırcak 11+9)


        //TASK ->
        int k = 5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);




    }
}
