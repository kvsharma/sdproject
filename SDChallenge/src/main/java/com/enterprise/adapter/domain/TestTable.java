package com.enterprise.adapter.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author anuj.kumar2
 *
 */
@Entity
@Table(name = "test_table")
public class TestTable implements Serializable {
	private static final long serialVersionUID = -3028114538116703620L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "name", nullable = false, unique = true)
	private String name;
	@Column(name = "salary", nullable = false)
	private long salary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}