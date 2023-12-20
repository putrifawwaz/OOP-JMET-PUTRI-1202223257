import java.util.Scanner;
import java.util.InpurMismatchException;
import java.utilArrayIndexOutOfBoundsException;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        User user = new User();

        System.out.println("==== Silahkan Register ====");

        System.out.println("Masukkan Nama       : ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan No Telepon : ");
        String noHandPhone = scanner.nextLine();

        bioskop.displaySeating();

        while(true) {
            try {
                System.out.println("Apakah Anda ingin memesan kursi? (y/n)");
                String answer = scanner.nextLine();

                if (answer == "y") {
                    System.out.println("Pilih baris kursi: ");
                    String answer1 = scanner.nextLine();

                    System.out.println("Pilih posisi kursi: ");
                    String answer2 = scanner.nextLine();

                } catch (InputMismatchException e) {
                    System.out.println("Input harus berupa angka");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Input angka harus dalam range seat");
                } 

                } else {
                    
                }

        }

        bioskop.displaySeating();

        scanner.close();
    }
}