public class Main {
    public static void main(String[] args) {

        IArabulucu ara = new SohbetArabulucu();
        Kullanici enise = new SohbetKullanicisi(ara, "enise");
        Kullanici ahsen = new SohbetKullanicisi(ara, "ahsen");
        Kullanici karadag = new SohbetKullanicisi(ara, "karadağ");

        enise.mesajGonder("hello");
        ahsen.mesajAl("he");
    }
}