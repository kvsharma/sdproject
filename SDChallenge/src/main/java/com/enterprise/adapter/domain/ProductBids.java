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
@Table(name = "product_bids")
public class ProductBids {
	private static final long serialVersionUID = -3028114538116703623L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "productId", nullable = false)
	private Long productId;
	@Column(name = "bidStartTime", nullable = false)
	private LocalDateTime bidStartTime;
	@Column(name = "bidStopTime", nullable = false)
	private LocalDateTime bidStopTime;
	@Column(name = "winnerUserId", nullable = false)
	private Long winnerUserId;
	@Column(name = "minPrice", nullable = false)
	private Long minPrice;
	@Column(name = "numBidders", nullable = false)
	private Long numBidders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public LocalDateTime getBidStartTime() {
		return bidStartTime;
	}

	public void setBidStartTime(LocalDateTime bidStartTime) {
		this.bidStartTime = bidStartTime;
	}

	public LocalDateTime getBidStopTime() {
		return bidStopTime;
	}

	public void setBidStopTime(LocalDateTime bidStopTime) {
		this.bidStopTime = bidStopTime;
	}

	public Long getWinnerUserId() {
		return winnerUserId;
	}

	public void setWinnerUserId(Long winnerUserId) {
		this.winnerUserId = winnerUserId;
	}

	public Long getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Long minPrice) {
		this.minPrice = minPrice;
	}

	public Long getNumBidders() {
		return numBidders;
	}

	public void setNumBidders(Long numBidders) {
		this.numBidders = numBidders;
	}

	@Override
	public String toString() {
		return "ProductBids [id=" + id + ", productId=" + productId
				+ ", bidStartTime=" + bidStartTime + ", bidStopTime="
				+ bidStopTime + ", winnerUserId=" + winnerUserId
				+ ", minPrice=" + minPrice + ", numBidders=" + numBidders + "]";
	}

}
