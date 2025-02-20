public abstract class Kullanici {
    protected IArabulucu arabulucu;
    protected String isim;

    public Kullanici(IArabulucu arabulucu, String isim){
        this.arabulucu=arabulucu;
        this.isim=isim;
    }

    public abstract void mesajGonder(String mesaj);
    public abstract void mesajAl(String mesaj);
}
