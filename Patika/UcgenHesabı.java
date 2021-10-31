import java.util.Scanner;

public class UcgenHesabı {

    public static void main(String[] args){

        double u,sonuc;

        Scanner scanner = new Scanner(System.in);


        System.out.print("A kenarının uzunluğunu giriniz : ");
        double a = scanner.nextDouble();
        System.out.print("B kenarının uzunluğunu giriniz : ");
        double b = scanner.nextDouble();
        System.out.print("C kenarının uzunluğunu giriniz : ");
        double c = scanner.nextDouble();

        u = ((a + b + c) / 2.0);

        sonuc = Math.sqrt((u * (u-a)* (u-b) * (u-c)));

        System.out.println("Girdiniz üçgenin alanı : "+sonuc);
    }
}

