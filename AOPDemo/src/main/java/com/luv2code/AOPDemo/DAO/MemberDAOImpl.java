package com.luv2code.AOPDemo.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
    @Override
    public boolean addaccount() {
        System.out.println(getClass()+"DOING MY DB WORK : ADDING AN ACCOUNT IN THE MEMBERSHIP DAO");
        return true;
    }

    @Override
    public void gotosleep() {
        System.out.println(getClass()+"GO TO SLEEP ()");
    }
}
