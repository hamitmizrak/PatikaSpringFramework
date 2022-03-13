package com.hamitmizrak.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

//kapsam
//yaşam süresi
//performansımızı + -
@Named
//@ApplicationScoped //bütün uygulama boyunca çalışıyor bütün kullanıcalar
//@RequestScoped //1 istek boyunca
//@SessionScoped //1 kullanıcı için yaşar ancak logout
//@Dependent //bukelemon
//@ConversationScoped //belli istek boyunca yaşar.
//@SessionScoped // Bean 1 instanse olmasını sağlamak için
public class _00_Scoped  {
}
