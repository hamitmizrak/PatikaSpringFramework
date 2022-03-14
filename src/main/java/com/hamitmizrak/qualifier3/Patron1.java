package com.hamitmizrak.qualifier3;


import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    //@Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    @Override
    public String surum(String data){
        return "default data:  "+data;
    }
}
