package com.shubham.AssetManagementSystem;

import java.text.ParseException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shubham.AssetManagementSystem.Util.AssetEntity;

public class UpdateAsset {
	
	Session session = null;
	AssetEntity assetEntity = null;
	Transaction transaction = null;

	public void updateAssetById()  {
		
		try {
			
			new ViewAllAsset().viewAsset();
		
			session = HibernateCom.getSessionFactoryInstance().openSession();
			System.out.println("Enter the Asset Id for Update the Asset :");
			int id = HibernateCom.getScanner().nextInt();
			assetEntity = 	session.get(AssetEntity.class,id);
			if(assetEntity == null) {
				System.out.println("AssetEntity ID "+id+" Not Found :");
			}
			
			transaction = session.beginTransaction();
			
			System.out.println("Enter the Asset Name :");
			assetEntity.setAssetName(HibernateCom.getScanner().next());
			System.out.println("Enter the Asset Type :");
			assetEntity.setAssetType(HibernateCom.getScanner().next());
			System.out.println("Enter the Serial No :");
			assetEntity.setSerialNo(HibernateCom.getScanner().next());
			System.out.println("Enter the purchase Date :");
			assetEntity.setPurchaseDate(HibernateCom.getSimpleDateFormate().parse(HibernateCom.getScanner().next()));
			
			session.update(assetEntity);
			transaction.commit();
			
		}catch (ParseException ex) {
			System.out.println("Invalid date formate  please enter the date as dd-MM-yyyy :");
			if(transaction != null) {		
				transaction.rollback();	
			}
				
		}catch (HibernateException ex) {
			System.out.println("Hibernate error .. " +ex.getMessage());
			if(transaction != null) {
				transaction.rollback();
			}
		}catch (Exception ex) {
			System.out.println("Something Went Wrong :"+ex.getMessage());
			if (transaction != null) {
				transaction.rollback();
			}
		}	
		finally {
			
			if (session != null) {
				session.close();
			}			
		}
			
	}
	
}
