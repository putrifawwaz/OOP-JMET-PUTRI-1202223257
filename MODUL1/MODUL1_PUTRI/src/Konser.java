public class Konser {
    private String bandName;
    private String Date;
    private String Location;
    private double ticketPrice;

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public double getTicketPrice() {
        return ticketPrice;
        
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    } 
}