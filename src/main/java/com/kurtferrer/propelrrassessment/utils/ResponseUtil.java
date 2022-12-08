package com.kurtferrer.propelrrassessment.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
	
	public static ResponseEntity<Object> generateResponse(String message,Object data,HttpStatusCode status){
		Map<String,Object> body = new HashMap<String,Object>();
		body.put("message", message);
		body.put("data", data);
		return new ResponseEntity<Object>(body,status);
	}
}
