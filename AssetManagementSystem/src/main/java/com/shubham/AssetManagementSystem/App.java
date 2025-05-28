package com.shubham.AssetManagementSystem;

import java.nio.channels.NonWritableChannelException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.shubham.AssetManagementSystem.Entity.Assets;

public class App {
	
	 
    public static void main(String[] args) throws ParseException {
       
    	System.out.println("!!! Welcome to Assets Management System !!!");
    	
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
    	
    	Configuration configuration = new Configuration();
    	configuration.configure();
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
        Transaction transaction = session.beginTransaction();
    	
        Assets  assets =  new Assets();
        assets.setAssetName("laptop");
        assets.setAssetType("electronic");
        assets.setSerialNo("dell102");
        assets.setPurchaseDate(simpleDateFormat.parse("12-05-2025"));
        
        session.save(assets);
        transaction.commit();
        
        session.close();
        
    }
}
