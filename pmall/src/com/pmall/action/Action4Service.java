package com.pmall.action;

import java.lang.reflect.Method;

import org.apache.commons.lang3.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.pmall.service.CategoryService;
import com.pmall.service.OrderItemService;
import com.pmall.service.OrderService;
import com.pmall.service.ProductImageService;
import com.pmall.service.ProductService;
import com.pmall.service.PropertyService;
import com.pmall.service.PropertyValueService;
import com.pmall.service.ReviewService;
import com.pmall.service.UserService;

public class Action4Service extends Action4Pojo{

	@Autowired
	CategoryService categoryService;
	@Autowired
	PropertyService propertyService;
	@Autowired
	ProductService productService;	
	@Autowired
	ProductImageService productImageService;	
	@Autowired
	PropertyValueService propertyValueService;	
	@Autowired
	UserService userService;	
	@Autowired
	OrderService orderService;	
	@Autowired
	OrderItemService orderItemService;	
	@Autowired
	ReviewService reviewService;	
	/**
	 * transient to persistent
	 * ˲ʱ����ת��Ϊ�־ö���
	 * @param o
	 */
	public void t2p(Object o){
			try {
				Class clazz = o.getClass();
				int id = (Integer) clazz.getMethod("getId").invoke(o);
				Object persistentBean = categoryService.get(clazz, id);

				String beanName = clazz.getSimpleName();
				Method setMethod = getClass().getMethod("set" + WordUtils.capitalize(beanName), clazz);
				setMethod.invoke(this, persistentBean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
