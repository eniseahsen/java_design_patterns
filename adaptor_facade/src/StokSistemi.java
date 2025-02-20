public class StokSistemi {
    boolean stokKontrolEt(String urunKodu){
        System.out.println("Stok kontrol edildi "+urunKodu);
        return true;

    }

    void stokGuncelle(String urunKodu, int miktar){
        System.out.println(urunKodu + " ürününün stoğu güncellendi, yeni miktar: "+miktar);
    }

}
