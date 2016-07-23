/**
 * 
 */
package com.enterprise.adapter.service;

import java.util.List;

import com.enterprise.adapter.domain.Bidders;

/**
 * @author karmveer.sharma
 *
 */
public interface BidderTableService {
	Bidders addNewRow(Bidders user);

	List<Bidders> findAll();

	void udpateRow(Bidders user);

	void deleteRow(Bidders user);

}
