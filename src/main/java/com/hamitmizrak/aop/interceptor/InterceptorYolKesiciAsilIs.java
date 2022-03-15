package com.hamitmizrak.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("İlk Hali: "+context.getMethod().getName());

        //kullanıcı : giriş yapmış mı ?
        boolean isLogin=true; //true:önce login olmalı Yol kesici olacak değişkeninimiz
        //jdbc : session ?
        Object isContinue=null; // Eğer yol kesilmezse devam edeceğim

        if(isLogin){
            //Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın" );
            return  null;
        }else{
            try {
                isContinue=context.proceed(); //devam etmesini sağlamak
                System.out.println("Sonraki hali "+isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }

    }


}
