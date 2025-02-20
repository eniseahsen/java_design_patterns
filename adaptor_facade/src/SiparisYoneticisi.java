public class SiparisYoneticisi {
    private StokSistemi stokSistemi = new StokSistemi();
    private BildirimSistemi bildirimSistemi = new BildirimSistemi();
    private KargoSistemi kargoSistemi = new KargoSistemi();

    void siparisIsle(String urunkodu, int miktar, String eposta, String adres){
        if(stokSistemi.stokKontrolEt(urunkodu)){
            stokSistemi.stokGuncelle(urunkodu, -miktar);
            bildirimSistemi.siparisOnayiGonder(eposta);
            kargoSistemi.KargoAyarla(adres);
            System.out.println("Sipariş başarıyla tamamlandı.");

        }
        else {
            System.out.println("Stok yetersiz. Sipariş tamamlanamadı.");
        }
    }
}
