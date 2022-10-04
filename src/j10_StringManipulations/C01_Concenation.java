package j10_StringManipulations;

public class C01_Concenation {

    public static void main(String[] args) {

        /*
        concat() methodu içine aldığı (parametre) aldığı string veriable'ı çalıştıgı stringin sonuna ekler...
        javada + işlemi yapılırken eğer en az bir string veriable varsa java toplama değil concat yapar.
         */


        String name= "Nur";
        String meslek =" Qa tester ";
        System.out.println(name.concat(meslek));
        System.out.println(name);


        //String methodları veriable geçici değişiklik yapar.
        //ama değişken atama yapılırsa kalıcı değişir

        name =meslek.concat(name);
        System.out.println("name = " + name );

        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)


        //concat methodu parametre olarak string type harici tüm dataları srtinge çevirip concat eder.


    }
}
