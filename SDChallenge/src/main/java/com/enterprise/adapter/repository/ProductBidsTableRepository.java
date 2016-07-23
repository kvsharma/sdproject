package com.enterprise.adapter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.adapter.domain.Products;

@Repository
public interface ProductBidsTableRepository extends
		JpaRepository<Products, Integer> {

	Products findById(Long id);

	List<Products> findAll();
}
