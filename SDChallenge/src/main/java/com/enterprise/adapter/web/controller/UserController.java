package com.enterprise.adapter.web.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.enterprise.adapter.domain.TestTable;
import com.enterprise.adapter.service.TestTableService;
import com.enterprise.adapter.web.controller.contants.ControllerURL;
import com.enterprise.adapter.web.dto.request.Request;
import com.enterprise.adapter.web.dto.response.Response;

/**
 * 
 * @author anuj.kumar2
 *
 */
@Controller
@RequestMapping(value = ControllerURL.DEFAULT_URL)
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private Environment environment;
	@Autowired
	private TestTableService tableService;

	@PostConstruct
	public void init() {
		logger.info("Start social media pack");
	}

	@RequestMapping(value = ControllerURL.test, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> sdcTest(@RequestBody Request request, HttpServletRequest servletRequest) throws Exception {
		logger.info("Request Object:\n" + request);
		Response response = new Response();
		response.setName(request.getName());

		TestTable table = tableService.findByName(request.getName());

		if (table == null) {
			table = new TestTable();
			table.setName(request.getName());
			table.setSalary(request.getSalary());
			tableService.addNewRow(table);
			response.setMessage(environment.getProperty("ADD_MSG"));
		} else {
			table.setName(request.getName());
			table.setSalary(request.getSalary());
			tableService.udpateRow(table);
			response.setMessage(environment.getProperty("UPDATE_MSG"));
		}

		logger.info("Response: " + response);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}