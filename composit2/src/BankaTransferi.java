public class BankaTransferi implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar){
        System.out.println("Banka transferi ile ödeme yaoıldı tutar: "+tutar);
    }
}
