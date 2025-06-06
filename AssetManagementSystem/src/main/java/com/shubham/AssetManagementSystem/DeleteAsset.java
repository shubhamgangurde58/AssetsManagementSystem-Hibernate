package com.shubham.AssetManagementSystem;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.shubham.AssetManagementSystem.Util.AssetEntity;

public class DeleteAsset {
	
	Session session = null;
	Transaction transaction = null ;
	
	public void deleteAssetById() {
		
		try {
			
			new ViewAllAsset().viewAsset();
			
			session = HibernateCom.getSessionFactoryInstance().openSession();
			
			System.out.println("Please enter the Asset id for delete the Asset : ");
			int id = HibernateCom.getScanner().nextInt();
			
			AssetEntity assetEntity = 	session.get(AssetEntity.class, id);
			if(assetEntity == null) {
				System.out.println("Invalid Asset id "+id+" id not found ...");
			}
			
			transaction =	session.beginTransaction();
			session.delete(assetEntity);
			transaction.commit();
			
		}catch (HibernateException ex) {
			
			System.out.println("Hibernate errror .. "+ex.getMessage());
			if (transaction != null) {
				transaction.rollback();
			}
			
		}catch (Exception ex) {
			
			System.out.println("Something Went Wrong .."+ex.getMessage());
			if (transaction != null) {
				transaction.rollback();
			}
			
		}finally {
			if (session != null) {
				session.close();
			}
		}
		
	}

}

