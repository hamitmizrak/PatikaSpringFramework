package com.hamitmizrak.iocsiz_disiz;

import jdk.jfr.Name;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizCalisan")
@ApplicationScoped
public class Calisan {

    private Patron patron;

    //parametresiz contructor
    public  Calisan(){
        patron=new Patron();
    }

    public String getData(String data){
        return patron.surum(data);
    }
}
