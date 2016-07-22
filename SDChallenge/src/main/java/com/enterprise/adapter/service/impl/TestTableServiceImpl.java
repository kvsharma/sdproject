package com.enterprise.adapter.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enterprise.adapter.domain.TestTable;
import com.enterprise.adapter.repository.TestTableRepository;
import com.enterprise.adapter.service.TestTableService;

@Service
public class TestTableServiceImpl implements TestTableService {

	private static final Logger logger = LoggerFactory
			.getLogger(TestTableServiceImpl.class);
	@Autowired
	TestTableRepository processListRepository;

	@Override
	public TestTable addNewRow(TestTable table) {
		logger.info("Add row: " + table);
		return processListRepository.save(table);
	}

	@Override
	public List<TestTable> findAll() {
		return processListRepository.findAll();
	}

	@Override
	public TestTable findByName(String name) {
		logger.info("find for name: " + name);
		return processListRepository.findByName(name);
	}

	@Override
	public void udpateRow(TestTable table) {
		logger.info("Update row: " + table);
		processListRepository.save(table);
	}

	@Override
	public void deleteRow(TestTable table) {
		logger.info("delete row: " + table);
		processListRepository.delete(table);
	}
}