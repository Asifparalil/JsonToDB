package com.testproject.test.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testproject.test.model.Candidate;
import com.testproject.test.service.CandidateService;

@RestController
public class TestController {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
		
	@Autowired CandidateService candidateService;
	
	 @GetMapping(path = "/save")
	 public String jason() throws IOException {
		 
		 try {
			 byte[] jsonData = Files.readAllBytes(Paths.get("Bath&Bristol_Sample.json"));
				
				//create ObjectMapper instance
				ObjectMapper objectMapper = new ObjectMapper();
				
				//convert json string to object
				Candidate candidate = objectMapper.readValue(jsonData, Candidate.class);
				
				logger.trace("Saving Candidate Details From Json file");
				candidateService.saveCandidate(candidate);
			    logger.info("Candidate saved with id {}",candidate.getSno());
			    return "Candidate Details Saved";
		 }catch(Exception e) {
			 logger.error("Failed To Save Candidate Details! {}",e);
			 return "Failed To Save Candidate Details! ";
		 }	 
		 
	 }
	 

}
