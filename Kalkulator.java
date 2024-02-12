/**
 * Kalkulator
 */
import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bilangan1, bilangan2;

        System.out.println("pilih operasi : ");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("5. Hasil bagi");
       

        System.out.println("masukan pilihan (1/2/3/4/6) : ");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3") || pilihan.equals("4")) {
            System.out.println("masukan bilangan pertama : ");
            bilangan1 = scanner.nextInt();
            System.out.println("masukan bilangan ke dua : ");
            bilangan2 = scanner.nextInt();

            if (pilihan.equals("1")) {
                System.out.println(bilangan1 + " + " + bilangan2 + " = " + (bilangan1 + bilangan2));
            } else if (pilihan.equals("2")){
                System.out.println(bilangan1 + " - " + bilangan2 + " = " + (bilangan1 - bilangan2));
            } else if (pilihan.equals("3")) {
                System.out.println(bilangan1 + " * " + bilangan2 + " = " + (bilangan1 * bilangan2));
            } else if (pilihan.equals("4")) {
                System.out.println(bilangan1 + " / " + bilangan2 + " = " + (bilangan1 / bilangan2));
            }
        }else{
            System.out.println("Pilihan invalid");
        }
    }
}
