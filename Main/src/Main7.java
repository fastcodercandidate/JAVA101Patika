import java.util.Scanner;
public class Main7 {
    public static void main(String[] args){
        int r, a;
        double pi = 3.14 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını yazınız:");
        r = inp.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü yazınız:");
        a = inp.nextInt();

        double alan = (pi * (r * r) *a )/360 ;

        System.out.println("Dairenin alanı:"+alan);

    }
}
