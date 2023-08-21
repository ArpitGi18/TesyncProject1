package com.luv2code.AOPDemo.DAO;

import com.luv2code.AOPDemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class DAOImplementation implements AccountDAO{
    @Override
    public void addaccount(Account account , boolean flag) {
        System.out.println(getClass()+"DOING MY DB WORK : ADDING AN ACCOUNT");
    }

    @Override
    public boolean dowork() {
        System.out.println(getClass()+"DO WORK()");

        return false;
    }
}
