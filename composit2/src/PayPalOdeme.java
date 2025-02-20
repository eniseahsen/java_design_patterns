public class PayPalOdeme implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar){
        System.out.println("Paypal ile ödeme yapıldı tutar: "+tutar);

    }
}
