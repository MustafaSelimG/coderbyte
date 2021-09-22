import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args){

        double tutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("KM değerini giriniz : ");
        double km = scanner.nextDouble();


        tutar = 10 + (km * 2.20);

        if(tutar <= 20){
            System.out.println("Ödemeniz gereken tutar 20 TL'dir.");
        }
        else{
            System.out.println("Ödemeniz gereken tutar : " + tutar );
        }

    }
}

/*

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

 */
