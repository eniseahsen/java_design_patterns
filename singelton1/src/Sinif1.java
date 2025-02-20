public class Sinif1 {
    private static Sinif1 nesne;

    private Sinif1(){

    }

    static Sinif1 getSinif1(){
        if(nesne==null)
            nesne = new Sinif1();
        return nesne;
    }

}
