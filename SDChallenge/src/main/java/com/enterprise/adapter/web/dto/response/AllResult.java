package com.enterprise.adapter.web.dto.response;

/**
 * 
 * @author anuj.kumar2
 *
 */
public class AllResult {

	private long id;
	private String productName;
	private String startTime;
	private String endTime;
	private String winnerName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getWinnerName() {
		return winnerName;
	}

	public void setWinnerName(String winnerName) {
		this.winnerName = winnerName;
	}

	@Override
	public String toString() {
		return "AllLiveAution [id=" + id + ", productName=" + productName + ", startTime=" + startTime + ", endTime="
				+ endTime + ", winnerName=" + winnerName + "]";
	}
}