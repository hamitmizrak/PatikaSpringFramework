package com.hamitmizrak.qualifier3;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    // defaultta çalışacak kodlar
    // @Inject
    // private PatronInterface patronInterface;

    //  istediğim seçeneği seçiyorum. 1.SEÇENEK
    //  @Inject
    //  @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    //  private PatronInterface patronInterface;

    //istediğim seçeneği seçiyorum. 2.SEÇENEK
    @Inject
    @QualifierMultiple2(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;




    public String getData(String data){
        return patronInterface.surum(data);
    }
}
