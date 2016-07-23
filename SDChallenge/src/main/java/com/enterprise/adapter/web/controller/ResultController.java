package com.enterprise.adapter.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.enterprise.adapter.web.controller.contants.ControllerURL;
import com.enterprise.adapter.web.dto.response.GetAllProductsResponse;
import com.enterprise.adapter.web.dto.response.ResponseDTO;
import com.enterprise.adapter.web.dto.response.ResponseHeaderDto;

/**
 * 
 * @author anuj.kumar2
 *
 */
@Controller
@RequestMapping(value = ControllerURL.RESULT)
public class ResultController {
	private static final Logger logger = LoggerFactory.getLogger(ResultController.class);

	@RequestMapping(value = ControllerURL.GET_RESULT, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllBidResult(HttpServletRequest servletRequest) throws Exception {
		logger.info("get all product request");
		ResponseDTO<GetAllProductsResponse> response = new ResponseDTO<GetAllProductsResponse>();
		ResponseHeaderDto header = new ResponseHeaderDto();
		GetAllProductsResponse allProductsResponse = new GetAllProductsResponse();

		response.setHeaders(header);
		response.setBody(allProductsResponse);
		logger.info("Response: " + response);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
