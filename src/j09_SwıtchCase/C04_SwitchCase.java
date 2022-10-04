package j09_SwıtchCase;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        //


        Scanner scanner=new Scanner(System.in);
        System.out.println("bir ay numarası girin : ");
        int ayNo=scanner.nextInt();

          switch (ayNo) {
              case 12:
              case 1:
              case 2:
                  System.out.println("Kış mevsimi");
                  break;
              case 3:
              case 4:
              case 5:

                  System.out.println("ilkbahar mevsimi");
                  break;
              case 6:
              case 7:
              case 8:
                  System.out.println("yaz mevsimi");
                  break;
              case 9:
              case 10:
              case 11:
                  System.out.println("sonbahar mevsimi ");

              default:
                  System.out.println("lütfen ay numarası girin");
          }























    }
}
