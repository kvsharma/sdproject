/**
 * 
 */
package com.enterprise.adapter.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author karmveer.sharma
 *
 */
@Entity
@Table(name = "products")
public class Bidders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "bidderUserId", nullable = false)
	private Long bidderUserId;
	@Column(name = "bidStartTime", nullable = false, unique = true)
	private LocalDateTime bidStartTime;
	@Column(name = "bidStopTime", nullable = false, unique = true)
	private LocalDateTime bidStopTime;
	@Column(name = "minPrice", nullable = false)
	private Long minPrice;
	@Column(name = "numBidders", nullable = false)
	private Long numBidders;

}
