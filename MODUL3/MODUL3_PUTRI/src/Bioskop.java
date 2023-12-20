public class Bioskop {
    public int rows = 5;
    public int seats_per_row = 10; 

    int[][] seats = new int [rows][seats_per_row];
    
    public Bioskop() {
        seats [0][2] = 1;
        seats [1][5] = 1;
        seats [3][7] = 1;   
    }

    public void displaySeating() {
        System.out.println("Bioskop Tiket Bisokop: ");
        for (int r = 0; r < rows; r++) {
            for (int s = 0; s < seats_per_row; s++) {
                System.out.println(seats[r][s] + " "); 
            }
            System.out.println();
        }
    }

    public void bookSeat(int row, int seat) {
        if (seats [rows][seats_per_row] == 0) {
            seats [rows][seats_per_row] = 1;
            System.out.println("Kursi Berhasil Dipesan" + rows + ", " + seats_per_row);
        } else {
            System.out.println("Error " + rows + ", " + seats_per_row + "sudah dipesan");
        }
    }
}