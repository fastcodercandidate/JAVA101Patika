import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
       //Değişkenleri oluşturalım.
        int a,b;
        double c;
        // Kullanıcıdan verileri scanner ile alalım.
        Scanner girdi= new Scanner(System.in);
        System.out.print("a kenarını yazınız:");
        a=girdi.nextInt();
        System.out.print("b kenarını yazınız:");
        b=girdi.nextInt();
        c=Math.sqrt ((a*a) + (b*b));
        System.out.print("Hipotenüs:" + c );
    }
}
