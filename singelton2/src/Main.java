public class Main {
    public static void main(String[] args) {
        Kimlik k1 = Kimlik.kimlikOlustur();
        System.out.println(k1);
        String s = k1.kimlikGoruntule();
        System.out.println(s);


    }
}