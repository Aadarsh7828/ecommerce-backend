package com.example.shop.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.shop.models.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review,String>{
	Page<Review> findByProductId(long productId, Pageable pageble);
	List<Review> findByProductId(long productId);
}
