package com.luv2code.AOPDemo;

import com.luv2code.AOPDemo.DAO.AccountDAO;
import com.luv2code.AOPDemo.DAO.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopDemoApplication {

    /*static AccountDAO accountDAO;*/

   /* @Autowired
    public AopDemoApplication(AccountDAO accountDAO)
    {
        this.accountDAO=accountDAO;
    }*/

    public static void main(String[] args) {

        SpringApplication.run(AopDemoApplication.class, args);
       /* demoTheBeforeAdvice(accountDAO);*/


    }

   @Bean
    public CommandLineRunner commandLineRunner(AccountDAO accountDAO , MemberDAO memberDAO) {
        return runner ->
        {
            demoTheBeforeAdvice(accountDAO);
            demoTheBeforeAdvice1(memberDAO);

        };
    }

    private void demoTheBeforeAdvice1(MemberDAO memberDAO) {
        memberDAO.addaccount();
        memberDAO.gotosleep();

    }

    private static void demoTheBeforeAdvice(AccountDAO accountDAO) {
        Account account=new Account();

        accountDAO.addaccount(account , true);

        accountDAO.dowork();

        System.out.println("------------");

        //System.out.println("Calling the Business Method again");

        //Calling again method

        //accountDAO.addaccount();


    }

}
