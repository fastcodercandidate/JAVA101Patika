/****
import java.util.Scanner;
public class SayiSiralama {
    // 3 sayıyı büyükten küçüğe sıralama örneği   //
   /* ****
    public static void main(String[] arg) {

        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("a sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("b sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("c sayısını giriniz : ");
        c = input.nextInt();

 */
/****
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b ");
            }

        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b>a>c ");
            } else {
                System.out.println("b>c>a ");
            }

        }
        if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("c>a>b");
            } else if (a < b) {
                System.out.println("c>b>a");
                {
                }

            }

        } else if ((a == b) || (a == c)) {
            System.out.println("2 veya daha fazla değer aynı.Lütfen farklı değer giriniz... ");
            {
                if (b == c) {
                    System.out.println("2 veya daha fazla değer aynı.Lütfen farklı değer giriniz... ");
                }
            }

        }
    }
}
*****/

import java.util.Scanner;
public class SayiSiralama {
    // 3 sayıyı  küçükten büyüğe sıralama örneği   //
    public static void main(String[] arg) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("a sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("b sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("c sayısını giriniz : ");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b ");
            }

        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b<a<c ");
            } else {
                System.out.println("b<c<a ");
            }

        }
        if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("c<a<b");
            } else  {

                System.out.println("c<b<a");

            }

        } else if ((a == b) || (a == c)) {
            System.out.println("2 veya daha fazla değer aynı.Lütfen farklı değer giriniz... ");
            {
                if (b == c) {
                    System.out.println("2 veya daha fazla değer aynı.Lütfen farklı değer giriniz... ");
                }
            }

        }
    }
}
