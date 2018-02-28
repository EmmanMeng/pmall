package com.pmall.comparator;

import java.util.Comparator;

import com.pmall.pojo.Product;

public class ProductSaleCountComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getSaleCount()-p1.getSaleCount();
	}

}