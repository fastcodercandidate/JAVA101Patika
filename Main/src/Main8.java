
import java.util.Scanner;
public class Main8 {
    public static void main (String[] args){
        double kilo,boy,vki;
        Scanner giris = new Scanner(System.in);
        System.out.print("Kg cinsinden kilonuzu giriniz:");
        kilo = giris.nextDouble();
        System.out.print("Cm cinsinden boyunuzu giriniz:");
        boy = giris.nextDouble();
        vki=kilo/(boy*boy) ;
        System.out.print("Vücut Kitle İndeksiniz: " + vki);

    }
}


