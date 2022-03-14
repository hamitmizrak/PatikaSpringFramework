package com.hamitmizrak.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    ////defaultta çalışacak kodlar
    //@Inject
    //private PatronInterface patronInterface;

    //defaultta çalışacak kodlar
    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;



    public String getData(String data){
        return patronInterface.surum(data);
    }
}
