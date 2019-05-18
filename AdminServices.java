package com.capgemini.adminstore.services;

import java.util.List;

import com.capgemini.adminstore.beans.Admin;
import com.capgemini.adminstore.beans.Coupon;
import com.capgemini.adminstore.beans.Customer;
import com.capgemini.adminstore.beans.Merchant;
import com.capgemini.adminstore.beans.Product;

public interface AdminServices {

	public List<Merchant> viewAllMerchants();
	
	public Merchant addMerchant(Merchant merchant);
	
	public Merchant removeMerchant(Merchant merchant);
	
	//public Merchant merchantDiscount(Merchant merchant);
	
	public Coupon removeCoupon(Coupon coupon);
	
	//public Coupon addMerchantCoupon(Coupon coupon);
	
	public List<Customer> viewAllCustomer();
	
	public List<Product> viewAllProduct();
    
	public void changeMinimumAmount(Admin admin);
	
	
}
