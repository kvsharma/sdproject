package com.enterprise.adapter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.adapter.domain.ProductBids;

@Repository
public interface ProductTableRepository extends
		JpaRepository<ProductBids, Integer> {

	ProductBids findById(Long id);

	ProductBids findByProductId(Long id);

	List<ProductBids> findAll();
}
