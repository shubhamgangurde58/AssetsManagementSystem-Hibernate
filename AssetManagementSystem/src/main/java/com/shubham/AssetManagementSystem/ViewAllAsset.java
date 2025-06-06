package com.shubham.AssetManagementSystem;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.shubham.AssetManagementSystem.Util.AssetEntity;

public class ViewAllAsset {
	
	public void viewAsset() {
		
			Session session = null ;
		
		try {
				session = HibernateCom.getSessionFactoryInstance().openSession();
				
				String hql = "FROM AssetEntity";
				
				Query<AssetEntity> query = 	session.createQuery(hql,AssetEntity.class);
				
				List<AssetEntity> assetEntity = query.getResultList();
				
				for(AssetEntity assetEntity2 : assetEntity) {
					
					System.out.println(" id :"+assetEntity2.getId()
					+"| name : "+assetEntity2.getAssetName()
					+"| type : "+ assetEntity2.getAssetType()
					+"| serial No :"+assetEntity2.getSerialNo()
					+"| pruchaseDate :"+assetEntity2.getPurchaseDate()+"\n");
					
				}
				
				System.out.println("View Asset Sucessfully !!");		
				
			 } catch (HibernateException ex) {
				 
		          System.out.println("Hibernate error .. " + ex.getMessage());
		          
		      }catch (Exception e) {
		    	  
		          System.out.println("Error while fetching assets: " + e.getMessage());
		          
		      } finally {
		          if (session != null) {
		              session.close();
		          }
		      }
	}		
}
