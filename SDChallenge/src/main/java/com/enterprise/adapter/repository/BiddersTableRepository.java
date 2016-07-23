package com.enterprise.adapter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.adapter.domain.Bidders;

@Repository
public interface BiddersTableRepository extends JpaRepository<Bidders, Integer> {

	Bidders findById(Long id);

	Bidders findByBidderUserId(Long id);

	Bidders findByProductId(Long id);

	List<Bidders> findAll();
}