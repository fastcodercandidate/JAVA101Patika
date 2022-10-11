import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){

        double tutar,kdvliToplamTutar,kdvOrani1=0.18,kdvOrani2=0.08;
        Scanner input = new Scanner (System.in);
        System.out.print("Ücret Tutarını giriniz:");
        tutar=input.nextInt();
        double kdvTutari=tutar<=1000 ? tutar*kdvOrani1 : tutar*kdvOrani2;
        kdvliToplamTutar=tutar+kdvTutari;
        System.out.println("KDV'siz Tutar:"+tutar);
        System.out.println("KDV Tutarı:"+kdvTutari);
        System.out.println("KDV'li Toplam Tutar:"+kdvliToplamTutar);








    }
}
