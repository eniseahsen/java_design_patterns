import java.util.*;

public class SohbetArabulucu implements IArabulucu{
    private List<Kullanici> kullanicilar = new ArrayList<>();

    @Override
    public void mesajGonder(String mesaj, Kullanici gonderen){
        for ( Kullanici kullanici : kullanicilar){
            if(kullanici != gonderen){
                kullanici.mesajAl(mesaj);
            }
        }

    }

    @Override
    public void kullaniciEkle(Kullanici kullanici){
       kullanicilar.add(kullanici);
    }
}
