public class Bus extends Kendaraan {
    private int jumlahKursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Jumlah Kursi        : " + jumlahKursi + " kursi";
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
}