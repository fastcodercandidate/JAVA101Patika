import java.util.Scanner;

public class airplaneTicketPrice {
    /*
   Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
   yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
   uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
   Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
   Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
   Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
   Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
   Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
   Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
    */
   public static void main(String[] arg) {
       int travelType, age;
       double km, total,newtotal=0,top;

       Scanner input = new Scanner(System.in);
       System.out.println("Enter the distance in km:");
       km = input.nextDouble();

       System.out.println("Enter the age:");
       age = input.nextInt();

       System.out.println("Which travel typye you prefer:");
       System.out.println("1-One Way\n2-Round Trip");
       travelType = input.nextInt();

       total = km * 0.10;

       if (((km > 0) && (age > 0))&&(travelType==1)||(travelType==2)) {
           if (age < 12) {
               newtotal = total - (total * 0.2);
           } else if ((age >= 12) && (age < 24)) {
               newtotal = total - (total * 0.1);
           } else if ((age>=24)&&(age<=65)) {
               newtotal=total;
           } else if (age > 65) {
               newtotal = total - (total * 0.3);
           }if (travelType==2){
               newtotal=(newtotal-(newtotal*0.2))*2;
           } else if (travelType==1) {
               newtotal=newtotal;
           }
       }else {
           System.out.println("The data you entered is incorrect.Please try again... ");
       }

   }
}

