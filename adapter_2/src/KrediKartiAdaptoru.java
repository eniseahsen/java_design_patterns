public class KrediKartiAdaptoru implements Odeme{
    private KrediKartiOdemeSistemi krediKartiOdemeSistemi;

    public KrediKartiAdaptoru(){
        this.krediKartiOdemeSistemi = new KrediKartiOdemeSistemi();
    }

    @Override
    public boolean odemeYap(double miktar){
        return krediKartiOdemeSistemi.kartCek("1234-5678-9876", miktar);
    }
}
