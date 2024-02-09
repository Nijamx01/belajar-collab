/**
 * Kalkulator
 */
import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1, angka2;

        System.out.println("pilih operasi : ");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");

        System.out.println("masukan pilihan (1/2) : ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1") || pilihan.equals("2")) {
            System.out.println("masukan bilangan pertama : ");
            angka1 = scanner.nextInt();
            System.out.println("masukan bilangan ke dua : ");
            angka2 = scanner.nextInt();

            if (pilihan.equals("1")) {
                System.out.println(angka1 + " + " + angka2 + " = " + (angka1 + angka2));
            } else {
                System.out.println(angka1 + " - " + angka2 + " = " + (angka1 + angka2));
            }
        }else{
            System.out.println("Pilihan invalid");
        }
    }
}