import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){

       // Degiskenleri olustur
        int matematik, fizik , kimya , turkce  , muzik , tarih ;

        //Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcı Değerlerini al
        System.out.println("matematik notunuzu giriniz:");
        matematik=inp.nextInt();
        System.out.println("fizik notunuzu giriniz:");
        fizik=inp.nextInt();
        System.out.println("turkce notunuzu giriniz:");
        turkce=inp.nextInt();
        System.out.println("tarih notunuzu giriniz:");
        tarih=inp.nextInt();
        System.out.println("muzik notunuzu giriniz:");
        muzik=inp.nextInt();
        System.out.println("kimya notunuzu giriniz:");
        kimya=inp.nextInt();
        int toplam= matematik + muzik + tarih + fizik + kimya + turkce;
        double ortalamaniz = toplam / 6.0;
        boolean kosul=ortalamaniz>=60;
        System.out.println("Not ortalamanız:"+ortalamaniz);
        String str=kosul? "Geçtiniz":"Kaldınız";
        System.out.println(str);

    }
}




