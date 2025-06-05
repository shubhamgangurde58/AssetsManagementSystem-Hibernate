package com.shubham.AssetManagementSystem;

import java.text.ParseException;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.shubham.AssetManagementSystem.Util.AssetEntity;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class App {
	
	public App() {
		
		  Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
	        
	   	  AssetEntity assetEntity = new AssetEntity();
	
	   try {
		   		System.out.println("Enter the Asset Name :");
		   		assetEntity.setAssetName(HibernateCom.getScanner().next());
		   		System.out.println("Enter the Asset Type :");
		        assetEntity.setAssetType(HibernateCom.getScanner().next());
		        System.out.println("Enter the Serial No :");
		        assetEntity.setSerialNo(HibernateCom.getScanner().next());
		        System.out.println("Enter the Purchase Date of dd-MM-yyyy This format :");
		        assetEntity.setPurchaseDate(HibernateCom.getSimpleDateFormate().parse(HibernateCom.getScanner().next()));
		        
		        Set<ConstraintViolation<AssetEntity>>	validations = validator.validate(assetEntity);
		        Iterator<ConstraintViolation<AssetEntity>> iterator  =   validations.iterator();
		        while (iterator.hasNext()) {
		   		
		       	 ConstraintViolation<AssetEntity> obj = iterator.next();
		       	 System.out.println("error "+obj.getPropertyPath()+" - "+obj.getMessage()+" - "+obj.getInvalidValue());
		   		
		        }
		        
		        Session session = HibernateCom.getSessionFactoryInstance().openSession();
		           
		        Transaction transaction =  session.beginTransaction();
			        
		   try {
		    			    
		       //session.save(assetEntity);
		       
		       session.persist(assetEntity);
		       
		       transaction.commit();
		     
		       System.out.println("Asset Add Successfully !!");				   
		      
		   } catch (Exception e) {
		
		    	transaction.rollback();
		    
		    	System.out.println("Error while saving: " + e.getMessage());
		   				
		   } finally {
		
			   session.close();
		   } 
	
		   
	   } catch (ParseException ex) {
	
		   System.out.println("Date parsing error: " + ex.getMessage());
	
	   } catch (Exception ex) {
	
		   System.out.println("Error: " + ex.getMessage());
	
	   }      
		
		
	}
	
    public static void main(String[] args)  {
   
      	
	   System.out.println("!!!! Welcom to Asset Management System !!!! \n");
	   
	   
	   int a ;
	   
	   do {
		   
		   System.out.println("1. AddNewAsset \n2. ViewAllAsset \n3. Exit  \n\nEnter Your choice :");
		   int Choice = HibernateCom.getScanner().nextInt();
		   
		   switch (Choice) {
			case 1: 
				 new App();
				break;
			case 2:
				 new ViewAllAsset();
				break;
			case 3: 
				System.exit(3);
				break;
			default:
				System.out.println("Your No is Invalid please Enter the Valid No :");		
		}
		  
		System.out.println("Continue to Enter  1/yes 0/no : ");
		a = HibernateCom.getScanner().nextInt();
	 	  		
	} while (a != 0);
         
 }
	   	
}



