package j11_MethodCreation;

public class C04MethodCreation { //motor
    public static void main(String[] args) {
        String name = "özge";
        System.out.println("car car " + name);
        C04_MethodDepo.geçmeNotu(24);// Depo class'tan class name ile moethod call ettik
        C04_MethodDepo .topla(3,5);//8

        /* FARKLI CLASSTAN METHOD CALL ETMEK İÇİN..
        1.METHOD STATİC : GÖKTEKİ GÜNEŞ GİBİ
        2.Classname.methodname()şeklinde call edilir. aynı class daki method doğrudan methodname ile call edilir
         */

      Selamver();

    }//main dışı
    public static void Selamver() {
        System.out.println("agam selamlar devamkeee :) ");
    }
}
