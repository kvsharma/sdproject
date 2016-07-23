package com.enterprise.adapter.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.enterprise.adapter.domain.Bidders;

@Repository
public interface BiddersTableRepository extends JpaRepository<Bidders, Integer> {

	Bidders findById(Long id);

	List<Bidders> findByBidderUserId(Long id);

	List<Bidders> findByProductId(Long id);

	List<Bidders> findAll();

	@Query("Select bidders.id as bidderId, max(bidders.amount) from Bidders bidders, Product_Bids productBids "
			+ "where bidders.productBidId = productBids.id" + " and productBids.bidStartTime<(:currentTime)"
			+ " and productBids.bidStopTime>(:currentTime)  group by bidderId")
	List<Bidders> getIntermediateWinners(@Param("currentTime") LocalDateTime currentTime);

}
