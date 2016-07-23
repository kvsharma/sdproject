/**
 * 
 */
package com.enterprise.adapter.service;

import java.util.List;

import com.enterprise.adapter.domain.Products;

/**
 * @author karmveer.sharma
 *
 */
public interface ProductTableService {
	Products addNewRow(Products user);

	List<Products> findAll();

	void udpateRow(Products user);

	void deleteRow(Products user);

}
