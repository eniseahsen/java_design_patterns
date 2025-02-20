public class Main {
    public static void main(String[] args) {

        Odeme odeme1 = new HavaleAdaptoru();
        odeme1.odemeYap(55);

        Odeme odeme2 = new KrediKartiAdaptoru();
        odeme2.odemeYap(155);

        Odeme odeme3 = new NakitAdaptoru();
        odeme3.odemeYap(255);

    }
}