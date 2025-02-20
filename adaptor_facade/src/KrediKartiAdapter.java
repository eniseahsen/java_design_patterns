public class KrediKartiAdapter implements OdemeYontemi{
    private KrediKartiServisi krediKartiServisi= new KrediKartiServisi();

    @Override
    public void odemeYap(double tutar){
        krediKartiServisi.krediKartiIleOdeme(tutar);
    }
}
