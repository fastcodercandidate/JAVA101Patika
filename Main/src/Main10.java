/*public class Main10 {
    public static void main(String[] args){
        int a=5, b =10;
        System.out.println(a==b);
    }
} */
/*
public class Main10 {

    public static void main(String[] args){
        int a=5, b =10;
        System.out.println(a>=b);
    }
}
*/
/*public class Main10 {

    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;
       // System.out.println(A == B);//
       // System.out.println(A != D);//
        System.out.println(A <= C);
    }
}
*/
/*
public class Main10 {
    public static void main (String[] args){
        int a=10, b=20, c=5;
        boolean kosul1=(a<b);
        boolean kosul2=(a>c);
        //boolean sonuc=(kosul1 || kosul2);
        //System.out.print(sonuc);
        System.out.print(kosul1 || kosul2);
    }
}
*/
/* public class Main10 {
     public static void main(String[] args) {
         int a=20, b=20, c;
         c=(a==b)?2 : 3;
         System.out.print(c);
     }
} */
//JAVA101 Mantıksal Operatörler->TEST-soru1
/*
import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        int not;
        Scanner inp = new Scanner(System.in);
        System.out.print(" Notu yazınız:" );
        not = inp.nextInt();
        System.out.println(not > 45 ? "Geçti" : "Kaldı");

    }
}

 */


import java.security.KeyStore;

//JAVA101 Mantıksal Operatörler->TEST-soru2
   /*
    public class Main10 {
        public static void main(String[] args) {


            boolean a = true, b = false;
            System.out.println((a && b) || (a || b));
        }
    }

    */
/*public class Main10{
    int a=10;
    public static void main(String[] args){
        int a=5;
        System.out.print(a);
    }
}

 */
/*
public class Main10{

    public static void main(String[] args) {
        int a = 5, b = 10;
        boolean compare = a == b;
       /* String str = compare ? "Eşittir" :"Değildir";
        System.out.print(str);
    }
}

 */
/*
public class Main10 {


    public static void main(String[] args) {
        int a = 5, b = 10;
        boolean compare = a == b;
        if (a == b) {
            System.out.print("Eşittir");
        }else {
            System.out.print("Eşit Değildir.");
        }
    }
}
 */
/*
public class Main10 {

    public static void main(String[] args) {
        int a = 10, b = 10;
        boolean compare = a == b;
        if (compare) {
            a=50;
            System.out.println("a sayısı:" + a );
            System.out.println("Eşittir");
        }else {
            System.out.print("Eşit Değildir.");
        }
        System.out.print("Proğram bitti.");
    }
}

 */


/*
public class Main10 {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 1;
        boolean compare = a < b;

        if (a < b && a < c) {
            System.out.print(a);
        } else if (b < a && b < c) {
            System.out.print("c en küçüktür.");
        } else if (c < a && c < b) {
            System.out.print("c en küçüktür:"+c);
        }

    }

}

 */
/*
public class Main10 {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 1;
        boolean compare = a < b;

        if (a < b && a < c) {
            System.out.print(a);
        } else if (b < a && b < c) {
            System.out.print("c en küçüktür.");
        } else {
            System.out.print("c en küçüktür:" + c);
        }

    }

}

 */
/*
public class Main10 {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 1;
        boolean compare = a < b;

        if (a < b) {
            if (b < c) {
                if(a==10){
                    System.out.print(" a sayısı 10'dur.");
                }
                System.out.println("en büyük a sayısıdır.a:"+a);
            }
            else {
                System.out.println(" a sayısı c'den büyüktür.");
            }
        }
        System.out.println("Program bitti.");
    }
}

 */
//JAVA101-Test-soru1
/*public class Main10 {

    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);
    }
}
*/
//test-soru3
/*
public class Main10 {

    public static void main(String[] args) {
        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)) {
            System.out.println(a);
        } else {
            System.out.print(a);
        }
        System.out.println(b);
    }
}

 */
/*
public class Main10 {

    public static void main(String[] args) {
        int day = 5;
      /*  if (day == 1) {
            System.out.println("Bugün Pazartesi");
        } else if (day == 2) {
            System.out.println("Bugün Salı");
        } else if (day == 3) {
            System.out.println("Bugün Çarşamba");
        } else if (day == 4) {
            System.out.println("Bugün Perşembe");
        } else if (day == 5) {
            System.out.println("Bugün Cuma");
        } else if (day == 6) {
            System.out.println("Bugün Cumartesi");
        } else if (day == 7) {
            System.out.println("Bugün Pazar");
        }else{
            System.out.println("Hatalı giriş yaptınız.");
        } */
       /* switch (day){
            case 1:
                System.out.println("Bugün pazartesi");
                System.out.println("Program bitti");
                break; //break eklemezsen istenen günden en son koda kadar hepsini yazar.//
            case 2:
                System.out.println("Bugün salı");
                break;
            case 3:
                System.out.println("Bugün çarşamba");
                break;
            case 4:
                System.out.println("Bugün perşembe");
                break;
            case 5:
                System.out.println("Bugün cuma");
                break;
            case 6:
                System.out.println("Bugün cumartesi");
                break;
            case 7:
                System.out.println("Bugün pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
*/
//JAVA101-Test-Soru3
public class Main10 {

    public static void main(String[] args) {
        int points=6;
        switch(points)
        {
            case 6: ;
            case 7: System.out.println("Java");break;
            case 8: ;
            case 9: System.out.println("101");break;
            case 10: System.out.println("Patika"); break;
            default: System.out.println("Dev");
        }
    }
}