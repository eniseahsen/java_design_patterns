import interfaceler.IKargoSistemi;
import interfaceler.IOdemeSistemi;
import interfaceler.IStokYonetimi;
import interfaceler.IBildirimSistemi;

public class SiparisYoneticisi {
    private IStokYonetimi stok;
    private IOdemeSistemi odeme;
    private IKargoSistemi kargo;
    private IBildirimSistemi bildirim;

    public SiparisYoneticisi(IStokYonetimi stok, IOdemeSistemi odeme, IKargoSistemi kargo, IBildirimSistemi bildirim){
        this.stok=stok;
        this.odeme=odeme;
        this.kargo=kargo;
        this.bildirim=bildirim;
    }

    public void siparisVer(String urunId, String krediKarti, String adres, String email){
        if(!stok.urunStoktaVarMi(urunId)){
            System.out.println("stok yok");

        }
        if(!odeme.odemeAl(krediKarti, 100)){
            System.out.println("ödeme yok");
        }

        String kargoTakip = kargo.kargoOlustur(adres, urunId);
        bildirim.bildirimGonder(email, "Sipariş başarıyla oluşturuldu. takip numarası: "+kargoTakip);
        System.out.println("Sipariş başarıyla tamamlandı.");

    }

}
