public class Baglam {
    private OdemeYontemi odemeYontemi;

    public void setOdemeYontemi(OdemeYontemi odemeYontemi){
        this.odemeYontemi=odemeYontemi;
    }

    public void odemeyiTamamla(double tutar){
        odemeYontemi.odemeYap(tutar);
    }
}
