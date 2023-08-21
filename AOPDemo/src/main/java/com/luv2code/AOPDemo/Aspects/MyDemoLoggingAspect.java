package com.luv2code.AOPDemo.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    //THis is where we add all of our related advices for logging

    //lets start with the an @Before advice

    //@Before("execution(public void com.luv2code.AOPDemo.DAO.DAOImplementation.addaccount())")
    //@Before("execution(public void addaccount())")
    //@Before("execution(* add*())")
    //@Before("execution(public void add*())")
    //@Before("execution(* add*(com.luv2code.AOPDemo.Account , ..))")
    @Before("execution(* com.luv2code.AOPDemo.DAO.*.*(..))")
    public void beforeaddaccountadvice()
    {
        System.out.println("\n===>>>>> Executing @Before advice on addAccount");
    }

}
