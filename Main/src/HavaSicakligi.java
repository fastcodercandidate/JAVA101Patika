/*
//Dersteki sorunun çözüm yolu //
import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] agr) {
        int heat;

        Scanner input = new Scanner(System.in);
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Vakti");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinema zamanı");
                {
                    if(heat>=10){
                        System.out.println("Piknik vakti");
                    }
                }

            }
        }else {
            System.out.println("Yüzme vakti");
        }
    }
}
*/
import java.util.Scanner;
public class HavaSicakligi {
    /*
    heat<5 kayak yap
    5<heat<15 sinemaya git
    10<heat<25 piknik yap
    heat<=25 yüzmeye git
     */
    public static void main(String[] agr) {
        int heat;

        Scanner input = new Scanner(System.in);
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Vakti");
        }else if (heat<=25) {
            System.out.println("Yüzme Vakti");
            if (heat >= 5 && heat < 15) {
                System.out.println("Sinema Vakti");
               if (heat >= 10 && heat < 25) {
                    System.out.println("Piknik Vakti");
                }
            }
        }

    }

}