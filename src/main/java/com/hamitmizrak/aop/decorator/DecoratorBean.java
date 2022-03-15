package com.hamitmizrak.aop.decorator;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    IEv iEv;


    public String beanMethod(String data){
        return  iEv.boyama(data);
    }
}
