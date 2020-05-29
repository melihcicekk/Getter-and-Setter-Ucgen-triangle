/**
 * Bu uygulama Getter ve Setter metodların kullanılması ile
 * üçgenin alan hesabını yapar.
 */



package ucgenalan;

import java.util.Scanner;

/**
 *
 * @author melih
 */
public class Ucgenalan {

   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);//Kullanıcının veri girmesini sağlayan kod satırı.
       
alan alan=new alan();//alan adlı classtan alan adlı nesneyi oluşturduğumuz kod satırı

System.out.println( "Taban kenar uzunluğu giriniz:");//Kullanıcıdan taban kenar uzunluğu aldığımız kod satırı.
int taban=scan.nextInt();

alan.settaban(taban);//alan'a girdiğimiz değeri tabana atayan kod satırı.

System.out.println("Yükseklik giriniz: ");//Kullanıcıdan yükseklik aldığımız kod satırı.
int h=scan.nextInt();

alan.seth(h);//alan'a girdiğimiz değeri h'ye atayan kod satırı.

System.out.print("Üçgenin alanı:"+(alan.gettaban()*alan.geth())/2);//Üçgenin alanının hesaplayıp ekrana yazdıran kod satırı.
    }
}
