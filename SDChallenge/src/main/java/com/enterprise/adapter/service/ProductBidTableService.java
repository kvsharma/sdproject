/**
 * 
 */
package com.enterprise.adapter.service;

import java.util.List;

import com.enterprise.adapter.domain.ProductBids;

/**
 * @author karmveer.sharma
 *
 */
public interface ProductBidTableService {
	ProductBids addNewRow(ProductBids user);

	List<ProductBids> findAll();

	void udpateRow(ProductBids user);

	void deleteRow(ProductBids user);

}
