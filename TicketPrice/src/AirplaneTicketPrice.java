import java.util.Scanner;

public class AirplaneTicketPrice {

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
            double age, distance, travelType, priceWithDiscount = 0, DiscountBecauseOfRoundTrip, normalPrice, discountRate;

            Scanner input = new Scanner(System.in);

            System.out.print("Please enter your age :");
            age = input.nextInt();

            System.out.print("Please enter the distance :");
            distance = input.nextInt();

            System.out.print("Please enter your travel type : write \"1 \" for one way travel or \"2\" for two way." );
            travelType = input.nextInt();
            double discountRate1 = 0.50;
            double discountRate2 = 0.10;
            double discountRate3 = 0.30;


            if (((age < 0) || (distance < 0)) || ((travelType < 1) || (travelType > 2))) {
                if (age < 12) {
                    if (travelType == 2) {
                        normalPrice = distance * 0.10;
                        discountRate = discountRate1 * normalPrice;
                        priceWithDiscount = normalPrice - discountRate;
                        DiscountBecauseOfRoundTrip = priceWithDiscount * 0.20;
                        System.out.println("Round trip airplane ticket :  " + DiscountBecauseOfRoundTrip);
                    } else {
                        System.out.println("One way trip airplane ticket :  " + priceWithDiscount);
                    }
                }
                if ((age >= 12) && (age <= 24)) {
                    if (travelType == 2) {
                        normalPrice = distance * 0.10;
                        discountRate = discountRate2 * normalPrice;
                        priceWithDiscount = normalPrice - discountRate2;
                        DiscountBecauseOfRoundTrip = priceWithDiscount * 0.20;
                        System.out.println("Round trip airplane ticket :  " + DiscountBecauseOfRoundTrip);
                    } else {
                        System.out.println("One way trip airplane ticket :  " + priceWithDiscount);
                    }
                    if (travelType == 2) {
                        if (age > 65) {
                            normalPrice = distance * 0.10;
                            discountRate = discountRate3 * normalPrice;
                            priceWithDiscount = normalPrice - discountRate3;
                            DiscountBecauseOfRoundTrip = priceWithDiscount * 0.20;
                            System.out.println("Round trip airplane ticket :  " + DiscountBecauseOfRoundTrip);
                        } else {
                            System.out.println("One way trip airplane ticket :  " + priceWithDiscount);
                        }
                    }

                } else {
                    System.out.print("\nThe data you entered is incorrect.Please try again...");
                }

            }
        }
}
