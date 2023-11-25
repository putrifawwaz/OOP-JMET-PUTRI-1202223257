import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO: Create List of Konser Object to Store Konser from Konser Class
    public static void main(String[] args) {
        List<Konser> concertList = new ArrayList<>();
    }


    // TODO: Create Method to insert Konser to Database
    public void insertConcert(Konser konser) {
        concertList.add(konser);
    }

    // TODO: Create Method to Show Konser from Database
    public void displayConcertInfo() {
        System.out.println(concertList);
    }

    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void showPrice() {
        System.out.println("Total Price : " + getTicketPrice()); 
    }

}
