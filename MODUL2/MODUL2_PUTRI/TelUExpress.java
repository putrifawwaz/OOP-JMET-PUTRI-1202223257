public class TelUExpress extends Ekspedisi {
    protected boolean antarInter;

    public TelUExpress (int jumlahCabang, String pusat, float tarif, boolean antarInter) {
        super(jumlahCabang, pusat, tarif);
        this.antarInter = antarInter;
    }

    @Override
    public void informasi() {
        if (antarInter == true) {
            System.out.println("Ekspedisi TELUExpress dengan jumlah cabang " + jumlahCabang + " dan berpusat di " + pusat + " mempunyai tarif sebesar " + tarif + " perkilogram.");
            System.out.println("Selain itu, ekspedisi ini melayani pengantaran International");
        } else {
            System.out.println("Ekspedisi TELUExpress tidak melayani pengantaran International");

        }
    }

    public void ambil (String tempat) {
        System.out.println("TELUExpress berhasil mengambil paket ke " + tempat);
    }

    public void antar (int resi) {
        System.out.println("TELUExpress berhasil mengantar paket dengan no resi " + resi);
    }

    public void antar (int resi_1, int resi_2) {
        System.out.println("TELUExpress berhasil mengantar paket dengan no resi " + resi_1 + " dan " + resi_2);
    }
}
