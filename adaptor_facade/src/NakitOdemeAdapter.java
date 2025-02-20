public class NakitOdemeAdapter implements OdemeYontemi{
    private NakitServisi nakitServisi = new NakitServisi();

    @Override
    public void odemeYap(double tutar){
        nakitServisi.nakitOdeme(tutar);
    }


}
