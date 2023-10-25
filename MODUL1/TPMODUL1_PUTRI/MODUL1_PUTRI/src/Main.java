import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // TODO: Create Database Object
        Scanner scanner = new Scanner(System.in, null)
        Database database1 = new Database();


        // TODO: Create Konser Object and Set the Attributes
        Konser concert = new Konser();


        // TODO: Insert Konser Object to Database
        concert.insertConcert();


        // TODO: Display Greeting Message and Prompt User to Register
        Konser.displayConcertInfo();


        // TODO: Create a User Object and Set the Attributes



        // TODO: Display Main Menu and Prompt User to Choose Menu
        System.out.println("Selamat Datang di Konser EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("===================================");
        System.out.println("Nama : " );
        System.out.println("No Handphone");
        System.out.println("===================================")
        
    }
}
