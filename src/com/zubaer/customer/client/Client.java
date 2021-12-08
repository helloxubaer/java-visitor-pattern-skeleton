package com.zubaer.customer.client;

import com.zubaer.customer.catergory.BronzeCustomer;
import com.zubaer.customer.catergory.Category;
import com.zubaer.customer.catergory.Customer;
import com.zubaer.customer.catergory.SuperCustomer;
import com.zubaer.customer.offer.CustomerVisitor;
import com.zubaer.customer.offer.OfferTravelDiscount;
import com.zubaer.customer.offer.ProvideNewPaymentCalculation;

public class Client {

	public static void main(String[] args) {
		CustomerVisitor visitor1 = new OfferTravelDiscount();
		CustomerVisitor visitor2 = new ProvideNewPaymentCalculation();
		
		
		Customer theCustomer1 = new BronzeCustomer("John", Category.BRONZE);
		System.out.println("From child class: Already implemethod mehod called:");
		System.out.println(theCustomer1);
		System.out.println("----------------");
		System.out.println("From visitor class: new implementation,"
				+ " without modification of parent class");
		theCustomer1.accept(visitor1);
		theCustomer1.accept(visitor2);
		System.out.println("----------------\n");
		
		Customer theCustomer2 = new SuperCustomer("Smith", Category.SUPER_CUSTOMER);
		theCustomer2.accept(visitor1);
		theCustomer2.accept(visitor2);
		

	}

}
