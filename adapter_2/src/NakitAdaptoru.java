public class NakitAdaptoru implements Odeme{
    private NakitOdemeSistemi nakitOdemeSistemi;

    public NakitAdaptoru(){
        this.nakitOdemeSistemi = new NakitOdemeSistemi();
    }

    @Override
    public boolean odemeYap(double miktar){
        nakitOdemeSistemi.nakitAl(miktar);
        return true;
    }

}
