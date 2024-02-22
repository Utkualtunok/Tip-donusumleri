import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan tam sayı ve ondalıklı sayıyı alıyoruz
        System.out.print("Lütfen bir tam sayı giriniz : ");
        int intNumber = inp.nextInt();

        System.out.print("Lütfen bir ondalıklı sayı giriniz : ");
        double floatingPointNumber = inp.nextDouble();

        //Tip dönüşümlerini yaptırıp sonuçları ekrana yazdırıyoruz
        double intToFloat = intNumber;
        int floatToInteger = (int) floatingPointNumber;

        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürme sonucu: " + intToFloat);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme sonucu: " + floatToInteger);

    }
}
