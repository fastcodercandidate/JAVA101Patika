/************* Dersteki burç alıştırması 1. yol *******************
 ************************************************/
/**********

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] arg){
        int month, day;

        Scanner input= new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day =input.nextInt();

        switch (month){
            case 1:
                if(day>=1 && day<=31){
                    if(day<22){
                        System.out.print("Oğlak Burcu");
                    }else{
                        System.out.print("Kova Burcu");
                    }
                }else{
                    System.out.print("Geçersiz bir ay girdiniz.");
                }

                break;
            case 2:
                if(day>=1 && day<=28){
                    if(day<20){
                        System.out.print("Kova Burcu");
                    }else{
                        System.out.print("Balık Burcu");
                    }
                }else{
                    System.out.print("Geçersiz bir ay girdiniz.");
                }
            default :
                System.out.print("Hatalı bir ay girdiniz.");

        }
    }
}
*************/
/****  Dersteki burç alıştırması 2. yol    *****/
/***

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] arg){
        int month, day;
        String burc = " ";
        boolean isError = false; //is error--> hata var mı yok mu? is error varsa true, yoksa false verir.//

        Scanner input= new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day =input.nextInt();

        switch (month){
            case 1:
                if(day>=1 && day<=31){
                    if(day<22){
                       // System.out.print("Oğlak Burcu"); String atadığımıdan bunu iptal ederiz. //
                        burc="Oğlak";
                    }else{
                        //System.out.print("Kova Burcu");//
                        burc = "Kova";
                    }
                }else{
                   // System.out.print("Geçersiz bir ay girdiniz."); //
                    isError = true; // girilen gün yanlışsa hata var --> true. //
                }

                break;
            case 2:
                if(day>=1 && day<=28) {
                    if(day<20){

                        burc = "Kova";
                    }else{

                        burc = "Balık";
                    }
                }else{

                    isError = true;
                }
                break;
            case 3:
                if (day>=1 && day<=31){
                    if(day<22){
                       burc = "Balık";
                    }
                }else{
                    isError = true;
                }

            default :
               // System.out.print("Hatalı bir ay girdiniz."); //
                isError = true;

        }
        if(isError){
            System.out.print("Hatalı giriş yaptınız.Tekrar deneyiniz.");
        }else{
            System.out.print("Burcunuz : "+ burc );
        }
    }
}

********/

/************ Ödev ***********************
 Aynı örneği switch-case kullanmadan yapınız.
 *************************************************/
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] arg) {
        int day, month;
        String burc="";
        boolean isError=false;

        // Ay ve gün Değerlerini al
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün :");
        day = input.nextInt();

        // Ay ve gun değeri kontrol et
        if (month == 1) {
            if ( day>=1 && day<=31){
                if (day < 22 ) {
                    burc="Oğlak";
                } else {
                    burc="Kova";
                }
            }else {
                isError=true;
            }
        } else if (month == 2) {
            if (day>=1 && day <= 28) {
                if (day < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day>=1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day>=1 && day <= 31) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day>=1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day>=1 && day <= 31) {
                if (day < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day>=1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day>=1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day>=1 && day <= 31) {
                if (day < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (day == 10) {
            if (day>=1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day>=1 && day <= 31) {
                if (day < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day>=1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError = true;
            }
        }else {
            isError=true;
        }

        // Hata değeri true ise hata ver.
        if (isError){
            System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
        }else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}