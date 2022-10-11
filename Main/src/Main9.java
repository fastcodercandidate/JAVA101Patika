import java.util.Scanner;
public class Main9 {
    public static void main(String[] args){
        double a, e , d , m, p ;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Armut Kaç Kilo ? :" );
        a = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        e = inp.nextDouble();
        System.out.print(" Domates Kaç Kilo ? :");
        d = inp.nextDouble();
        System.out.print(" Muz Kaç Kilo ? :");
        m = inp.nextDouble();
        System.out.print(" Patlıcan Kaç Kilo ? :");
        p = inp.nextDouble();

        double toplamTutar=(a*2.14)+(e*3.67)+(d*1.1)+(m*0.95)+(p*5);
        System.out.println("Toplam alışveriş tutarı:" + toplamTutar+"TL" ) ;

    }
}