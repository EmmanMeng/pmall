package com.pmall.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pmall.pojo.Product;
import com.pmall.pojo.ProductImage;
import com.pmall.service.ProductImageService;

@Service
public class ProductImageServiceImpl  extends BaseServiceImpl implements ProductImageService {

	@Override
	public void setFirstProdutImage(Product product) {
		if(null!=product.getFirstProductImage())
			return;
		List<ProductImage> pis= list("product", product, "type", ProductImageService.type_single);
		if(!pis.isEmpty())
			product.setFirstProductImage(pis.get(0));
	}
}
