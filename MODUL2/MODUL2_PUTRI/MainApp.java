public class MainApp {
    public static void main(String[] args){

        Ekspedisi eks1 = new Ekspedisi(10, "Jakarta ", 10000);
        TelUExpress t1 = new TelUExpress(100, "Bandung", 50000, true);
        FRIExpress f1 = new FRIExpress(30, "Bojongsoang", 70000, true);

        eks1.informasi();

        System.out.println("");

        t1.informasi();
        t1.ambil("Sukabirus");
        t1.antar(162839);
        t1.antar(1922722, 7628262);

        System.out.println("");

        f1.informasi();
        f1.terima(2000);
        f1.kirim("Lembang");
        f1.kirim("Braga", "Rancaekek");
    }
}
