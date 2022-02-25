package com.student.soapstudent.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.student.soapstudent.Eligibility;
import com.student.soapstudent.StudentRequest;
import com.student.soapstudent.service.EligibilityForJobService;

@Endpoint
public class EligibilityEndpoint {

	private static final String NAMESPACE = "http://www.student.com/soapstudent";
    @Autowired
	private EligibilityForJobService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "StudentRequest")
	@ResponsePayload
	public Eligibility getJobEligibility(@RequestPayload StudentRequest request) {

		return service.checkEligibility(request);

	}
}