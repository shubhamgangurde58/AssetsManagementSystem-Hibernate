package com.shubham.AssetManagementSystem.Util;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class AssetEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  id;
	@NotBlank(message = "Please enter the valid Asset Name ;")
	private String assetName;
	@NotBlank(message = "Please enter the valid Asset Type :")
	private String assetType;
	@NotBlank(message = "Please enter the valid Serial no :")
	//@Pattern(regexp = "[a-zA-Z0-9],{3,10}",message = "Serial No always Required  3 to 10 number :")
	private String serialNo;
	private Date purchaseDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	
	@Override
	public String toString() {
		return "AssetEntity [id=" + id + ", assetName=" + assetName + ", assetType=" + assetType + ", serialNo="
				+ serialNo + ", purchaseDate=" + purchaseDate + "]";
	}
	
	
	

	
}