package Siniflar;

import interfaceler.IBildirimSistemi;

public class BildirimSistemi implements IBildirimSistemi {
    @Override
    public void bildirimGonder(String email, String mesaj){
        System.out.println(email +" Adresine"+" bildirim gönderildi. Bildirim:   "+mesaj);
    }

}
