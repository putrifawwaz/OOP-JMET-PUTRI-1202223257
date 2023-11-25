public class MainApp {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("M1", 120.0, 5, 4);
        System.out.println("=====  Informasi Mobil  =====");
        System.out.println(mobil1);

        double jarak = 300.0;
        System.out.printf("\nWaktu tempuh dengan Mobil: %.2f jam\n", mobil1.hitungWaktuTempuh(jarak));

        Bus bus1 = new Bus("B1", 80.0, 40, 30);
        System.out.println("\n=====  Informasi Bus  =====");
        System.out.println(bus1);

        System.out.printf("\nWaktu tempuh dengan Bus: %.2f jam\n", bus1.hitungWaktuTempuh(jarak));

    }
}