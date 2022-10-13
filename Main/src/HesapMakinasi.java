/*
import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String [] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        // System.out.print(n1+"-"+n2);//Hata olup olmadığını kontrol etmek için yazıldı.
        System.out.println("1-çarpma\n2-bölme\n3-çıkarma\n4-toplama");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();
        System.out.println(+select);
        if (select == 1) {
            System.out.print(" çarpma :" + (select=n1 * n2));
        } else if (select == 2) {
            if(n2!=0){
                System.out.print(" bölme :" + (select=n1 / n2));
            } else {
                System.out.print("Bir sayı sıfıra bölünemez." );
            }
        }else if (select == 3) {
            System.out.print(" çıkarma :" + (n1 - n2));
        }else if (select == 4) {
            System.out.print(" toplama :" + (n1 + n2));
        } else  {
            System.out.print(" Hatalı tuşlama.Tekrar deneyiniz. " );
        }


    }

}

 */
//JAVA- Hesap Makinasının Switch ile Kodlanması

import java.util.Scanner;
public class HesapMakinasi {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-çarpma\n2-bölme\n3-çıkarma\n4-toplama");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();
        System.out.println(+select);
        switch (select) {
            case 1:
                System.out.println(" çarpma : " + (n1 * n2));
                break;
            case 2:
                switch (n2) {
                case 0:
                        System.out.println("Bir sayı sıfıra bolunemez.");
                        break;
                    default:System.out.println("Bolme = "+ (n1 / n2));
                }
            break;
            case 3:
                System.out.println("çıkarma : " + (n1 - n2));
                break;
            case 4:
                System.out.println("bölme : " + (n1 + n2));
                break;

            default:
                System.out.println("Hatalı tuşlama.Tekrar deneyiniz. ");
        }
    }
}


