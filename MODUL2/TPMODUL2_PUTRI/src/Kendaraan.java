public class Kendaraan {
    private String nomorIdentifikasi; 
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String toString() {
        return "Nomor Identifikasi  : " + nomorIdentifikasi + "\n" +
               "Kecepatan Maksimum  : " + kecepatanMaksimum + " km/jam" + "\n" +
               "Kapasitas Penumpang : " + kapasitasPenumpang + " penumpang";
    }

    public double hitungWaktuTempuh(double jarak) {
        return jarak / kecepatanMaksimum;
    }

    public String getNomorIdentifikasi() {
        return nomorIdentifikasi;
    }

    public void setNomorIdentifikasi(String nomorIdentifikasi) {
        this.nomorIdentifikasi = nomorIdentifikasi;
    }

    public double getKecepatanMaksimum() {
        return kecepatanMaksimum;
    }

    public void setKecepatanMaksimum(double kecepatanMaksimum) {
        this.kecepatanMaksimum = kecepatanMaksimum;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang) {
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
}