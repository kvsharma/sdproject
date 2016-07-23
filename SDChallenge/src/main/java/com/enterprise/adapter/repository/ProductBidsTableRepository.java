package com.enterprise.adapter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.adapter.domain.ProductBids;
import com.enterprise.adapter.domain.Products;

@Repository
public interface ProductBidsTableRepository extends
		JpaRepository<ProductBids, Integer> {

	ProductBids findById(Long id);

	List<ProductBids> findByProductId(Long productId);

	List<ProductBids> findAll();
}
