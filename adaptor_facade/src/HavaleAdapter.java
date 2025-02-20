public class HavaleAdapter implements OdemeYontemi{
    private HavaleServisi havaleServisi = new HavaleServisi();

    @Override
    public void odemeYap(double tutar){
        havaleServisi.havaleIleOdeme(tutar);
    }
}
