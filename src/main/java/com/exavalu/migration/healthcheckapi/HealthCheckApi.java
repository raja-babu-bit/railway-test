package com.exavalu.migration.healthcheckapi;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1",consumes = "application/json", produces = "application/json")
public class HealthCheckApi {
	
	@GetMapping("/health")
	public ResponseEntity<Object> healthCheck(@RequestBody EmployeePOJO Employee) {
		HashMap<String, String> response = new HashMap<>();
		response.put("Id", Employee.getEmployeeId());
		response.put("Name", Employee.getEmployeeName());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
