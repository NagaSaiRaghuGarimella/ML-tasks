package com.student.soapstudent.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.soapstudent.Eligibility;
import com.student.soapstudent.StudentRequest;

@Service
public class EligibilityForJobService {
	
	public Eligibility checkEligibility(StudentRequest request) {
		
	Eligibility eligible = new Eligibility();
	List<String> mismatch = eligible.getCriteriaMismatch();
	
	if(!(request.getPercentage()>60)) {
		mismatch.add("Percentage Should be above 60 to get Job  ");
	}
	
	if(request.getQualification()!="Btech") {
		mismatch.add("Qualification Should be Btech only");
	}
	
	if(mismatch.size()>0) {
		eligible.setSalaryPackage(0);
		eligible.setIsEligible(false);	
	}
	
	else {
		
		eligible.setSalaryPackage(30000);
		eligible.setIsEligible(true);	
		
	}
	
	return eligible;
	}
}