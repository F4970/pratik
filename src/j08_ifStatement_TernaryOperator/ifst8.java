package j08_ifStatement_TernaryOperator;

public class ifst8 {
    public static void main(String[] args) {

        /* 60 değerinde bir int oluşturun.
Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
*/

      int sayı = 60;
      if (sayı%9==0 || sayı%5==0) {
          System.out.println("Able to divide by 9 and 5 ");
      }if (sayı%4==0 || sayı%5==0 ) {
          System.out.println("Able to divide by and 15 ");
      }
    }
}
