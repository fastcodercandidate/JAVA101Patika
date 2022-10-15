/*
import java.util.Scanner;
//Java101 konu anlatımındaki örneğin çözümü //

public class KullaniciGirisi {
    public static void main(String[] args){
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName=inp.nextLine();

        System.out.print("Şifreniz : ");
        password=inp.nextLine();

        if(userName.equals("patika")&& password.equals("java123")){
            System.out.print("Giriş Yaptınız ");
        }else{
            System.out.print("Hatalı giriş yaptınız.");
        }

    }
}


import java.util.Scanner;
/* 1)Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
2)eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
 3)şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

 */
import java.util.Scanner;
public class KullaniciGirisi {

public static void main(String[] args) {
        String userName, password, select, newPassword;

        Scanner input = new Scanner (System.in);

        System.out.println("Kullanıcı Adı : ");
        userName=input.nextLine();

        System.out.println("Şifre : ");
        password=input.nextLine();

        if (userName.equals("gulsah") && password.equals("java101")){
        System.out.println("Sisteme Giriş Yaptınız");
        }
        else {
        System.out.println("Kullanıcı Adınız veya Şifreniz Hatalı,Şifrenizi Sıfırlamak ister misiniz? : \"Evet\" ya da \"Hayır\" yazınız.");
        }
        select=input.nextLine();
        if(select.equals("Hayır")){
            System.out.println("Şifrenizi tekrar giriniz");
            select=input.nextLine();
        }
        if (select.equals("Evet")){
        System.out.println("Yeni Şifrenizi Giriniz : ");
        newPassword=input.nextLine();
        if (newPassword.equals("java101")){
        System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz : ");
        newPassword=input.nextLine();
        }
        else{
        System.out.println("Yeni Şifre Başarıyla Oluşturuldu");
        }
        }
    }
}