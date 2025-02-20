public class SohbetKullanicisi extends Kullanici{

    public SohbetKullanicisi(IArabulucu arabulucu, String isim){
        super(arabulucu, isim);

    }

    @Override
    public void mesajGonder(String mesaj){
        System.out.println(isim + " gönderdi: "+mesaj);
        arabulucu.mesajGonder(mesaj, this);

    }

    @Override
    public void mesajAl(String mesaj){
        System.out.println(this.isim+ " aldı: "+mesaj);

    }
}
