import interfaceler.*;
import Siniflar.*;

public class Main {
    public static void main(String[] args) {
        IStokYonetimi stok = new StokYonetimi();
        IOdemeSistemi odeme = new OdemeSistemi();
        IKargoSistemi kargo = new KargoSistemi();
        IBildirimSistemi bildirim = new BildirimSistemi();

        SiparisYoneticisi yonetici = new SiparisYoneticisi(stok, odeme, kargo, bildirim);

        yonetici.siparisVer("urun", "333", "adres", "msuteri@");



    }
}