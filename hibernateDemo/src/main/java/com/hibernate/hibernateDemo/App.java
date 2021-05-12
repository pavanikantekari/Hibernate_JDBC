package com.hibernate.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        Employee emp = new Employee();
        emp.setEmpNo(2);
        emp.seteName("sai");
        emp.setSalary(25000.00);
        ses.save(emp);
//        ses.flush();
        tx.commit();
        System.out.println("Inserted Successfully");
    }
}
