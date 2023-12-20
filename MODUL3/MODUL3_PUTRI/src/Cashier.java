public class Cashier extends Bioskop {
    boolean isbooked = false;

    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        for (int r = 0; r < super.seats.length; r ++) {
            for (int s = 0; s < super.seats.length; s ++) {
                if(!(r == 0 && s == 2) || (r == 1 && s == 5) || (r == 3 && s == 7)) {
                    System.out.println("Mencetak Tiket..." +
                                       "=========================" + 
                                       "Nama    : " + getNama() +
                                       "Phone   : " + getNoHandPhone() +
                                       "Seat    : " + rows + ", " + seats_per_row +
                                       "=========================" +
                                       "Selamat Menonton!");
                } else {
                    System.out.println("Anda belum memesan kursi!");
                }
            }
        }
    }

    private String getNoHandPhone() {
        return null;
    }

    private String getNama() {
        return null;
    }
    
}

