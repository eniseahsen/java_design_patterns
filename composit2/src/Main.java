public class Main {
    public static void main(String[] args) {

        Baglam baglam = new Baglam();
        OdemeYontemi oy1 = new KrediKartiOdeme();
        baglam.setOdemeYontemi(oy1);
        baglam.odemeyiTamamla(323.45);

        OdemeYontemi oy2 = new PayPalOdeme();
        baglam.setOdemeYontemi(oy2);
        baglam.odemeyiTamamla(443.43);

        OdemeYontemi oy3 = new BankaTransferi();
        baglam.setOdemeYontemi(oy3);
        baglam.odemeyiTamamla(990.43);


    }
}