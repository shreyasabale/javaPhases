package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        
        Product s1 = new Product();
        s1.setPname("Jeans");
        s1.setPdescription("Denim jeans, Black");
        s1.setPprice(1200.50);
        
        s.save(s1);
    }
}
