public class Main {
    public static void main(String[] args) {
        //facade: sipariş yönetimi
        SiparisYoneticisi siparisYoneticisi = new SiparisYoneticisi();

        //adapter: ödeme yöntemleri
        OdemeYontemi odemeYontemi = new KrediKartiAdapter();
        odemeYontemi.odemeYap(200);

        //sipariş işlemleri
        siparisYoneticisi.siparisIsle("urun23",3, "eniseahsen@","cadde sehir");
    }
}