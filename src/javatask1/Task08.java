package javatask1;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */


        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      char O= pickName.charAt(pickName.indexOf("O"));
      char Z=pickName.charAt(pickName.indexOf("Z"));
      char G=pickName.charAt(pickName.indexOf("G"));
      char E=pickName.charAt(pickName.indexOf("E"));

        System.out.println(O+Z+G+E);
        System.out.println("adım : "+O+Z+G+E);

    }
}
