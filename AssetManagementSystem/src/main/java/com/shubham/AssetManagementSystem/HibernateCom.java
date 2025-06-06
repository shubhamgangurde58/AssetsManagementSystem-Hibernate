package com.shubham.AssetManagementSystem;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCom {
	
	public static SessionFactory sessionFactory;
	
	public static Scanner scanner;
	
	public static SimpleDateFormat simpleDateFormat;
	
	public static SessionFactory getSessionFactoryInstance() {
		
		if(sessionFactory == null) {
			
			Configuration configuration = new Configuration();
			configuration.configure();
			//configuration.addAnnotatedClass(AssetEntity.class);
			
			sessionFactory = configuration.buildSessionFactory();
			
		}
		return sessionFactory;
	}
	
	public static SimpleDateFormat getSimpleDateFormate() {
		
		if(simpleDateFormat == null) {
			
			simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		}
		return simpleDateFormat;
		
	}
	
	public static Scanner getScanner() {
		
		if(scanner == null) {
			
			 scanner = new Scanner(System.in);
		}
		return scanner;
	}
	
	

}

