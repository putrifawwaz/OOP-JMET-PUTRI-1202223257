public class Ekspedisi {
    protected int jumlahCabang;
    protected String pusat;
    protected float tarif;

   public Ekspedisi (int jumlahCabang, String pusat, float tarif) {
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
   }

   public void informasi() {
    System.out.println("Ekspedisi tidak diketahui dengan jumlah cabang " + jumlahCabang + " dan berpusat di " + pusat + "mempunyai tarif sebesar " + tarif + " perkilogram.");
   }
}
