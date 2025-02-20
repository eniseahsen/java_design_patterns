public class HavaleAdaptoru implements Odeme{
    private HavaleOdemeSistemi havaleOdemeSistemi;

    public HavaleAdaptoru(){
        this.havaleOdemeSistemi = new HavaleOdemeSistemi();
    }

    @Override
    public boolean odemeYap(double miktar){
        return havaleOdemeSistemi.havaleGonder("TR28490834903845", miktar);

    }



}
