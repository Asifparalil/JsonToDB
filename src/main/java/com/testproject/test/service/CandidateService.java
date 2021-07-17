package com.testproject.test.service;

import org.springframework.stereotype.Service;

import com.testproject.test.model.Candidate;
/**
 * Service Layer for Candidate Model
 * @author Asif
 * 
 */

@Service
public interface CandidateService {
	
	/**
	 * Save Candidate
	 * @param candidate
	 * @author Asif
	 */
	public void saveCandidate(Candidate candidate);
}
