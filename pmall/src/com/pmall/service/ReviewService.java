package com.pmall.service;

import com.pmall.pojo.Order;
import com.pmall.pojo.Review;

public interface ReviewService extends BaseService {

	void saveReviewAndUpdateOrderStatus(Review review, Order order);

	
}
