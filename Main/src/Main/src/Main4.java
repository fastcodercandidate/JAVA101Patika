import java.util.Scanner;
public class Main4 {
    public static void main(String[] args){
        //Değişkenleri oluşturalım.
        int a,b,c;
        int u;
        int alan;
        // Kullanıcıdan verileri scanner ile alalım.
        Scanner girdi= new Scanner(System.in);
        System.out.print("a kenarını yazınız:");
        a=girdi.nextInt();
        System.out.print("b kenarını yazınız:");
        b=girdi.nextInt();
        System.out.print("c kenarını yazınız:");
        c=girdi.nextInt();
        u = (a+b+c) / 2;
        alan  = (int) Math.sqrt ( u * (u-a)* (u-b) * (u-c));
        System.out.print("Üçgenin Alan:"+  alan);
    }
}
