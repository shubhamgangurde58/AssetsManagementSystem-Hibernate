package com.shubham.AssetManagementSystem;

public class App {
	
    public static void main(String[] args)  {
 	
	   System.out.println("!!!! Welcom to Asset Management System !!!! \n");	   
	   int a ;
	   
	   do {
		   
		   System.out.println("1. AddNewAsset \n2. ViewAllAsset \n3. UpdateAsset \n4. DeleteAsset \n5. Exit \n\nEnter Your choice :");
		   int Choice = HibernateCom.getScanner().nextInt();
		   
		   switch (Choice) {
			case 1: 
				 new AddNewAsset().addAsset();;
				break;
			case 2:
				 new ViewAllAsset().viewAsset();
				break;
			case 3: 
				new UpdateAsset().updateAssetById();
				break;
			case 4:
				new DeleteAsset().deleteAssetById();
				break;
			case 5: 
				System.exit(Choice);
				break;
			default:
				System.out.println("Your No is Invalid please Enter the Valid No :");		
		}
		  
		System.out.println("\nContinue to Enter  1/yes 0/no : ");
		a = HibernateCom.getScanner().nextInt();
	 	  		
	} while (a != 0);
         
 }
	   	
}



