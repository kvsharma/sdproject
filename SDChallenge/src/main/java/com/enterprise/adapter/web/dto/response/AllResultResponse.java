package com.enterprise.adapter.web.dto.response;

import java.util.List;

/**
 * 
 * @author anuj.kumar2
 *
 */
public class AllResultResponse {
	private List<AllResult> liveAutions;

	public List<AllResult> getLiveAutions() {
		return liveAutions;
	}

	public void setLiveAutions(List<AllResult> liveAutions) {
		this.liveAutions = liveAutions;
	}

	@Override
	public String toString() {
		return "AllResultResponse [liveAutions=" + liveAutions + "]";
	}
}
