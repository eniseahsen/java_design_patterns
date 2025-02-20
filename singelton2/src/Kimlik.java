public class Kimlik {
    private static Kimlik nesne;
    private Kimlik(){

    }
    static Kimlik kimlikOlustur(){
        if(nesne==null)
            nesne = new Kimlik();
        return nesne;
    }

    public String kimlikGoruntule(){
        return "Kimlik nesnesi: "+ nesne;
    }
}
