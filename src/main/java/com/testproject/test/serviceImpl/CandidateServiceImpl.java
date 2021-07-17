package com.testproject.test.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.test.dao.CandidateDao;
import com.testproject.test.model.Candidate;
import com.testproject.test.model.Email;
import com.testproject.test.model.Experience;
import com.testproject.test.model.Profiles;
import com.testproject.test.service.CandidateService;
import com.testproject.test.service.EmailsService;
import com.testproject.test.service.ExperienceService;
import com.testproject.test.service.ProfilesService;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateDao candidateDao; 
	
	@Autowired 
	private ExperienceService experienceService ;
	
	@Autowired
	private EmailsService emailsService;
	
	@Autowired
	private ProfilesService profilesService;
	
	Logger logger = LoggerFactory.getLogger(CandidateServiceImpl.class);
	
	@Override
	public void saveCandidate(Candidate candidate) {
		//Save Candidate details
		candidateDao.save(candidate);

		//Save Experience Details
		if (!candidate.getExperience().isEmpty()) {
			for (Experience experience : candidate.getExperience()) {
				experience.setSno(candidate.getSno());
			}
			
			experienceService.saveExperience(candidate.getExperience());
		}
		
		//Save Email Details
		if (!candidate.getEmails().isEmpty()) {
			for (Email email : candidate.getEmails()) {
				email.setSno(candidate.getSno());
			}
			
			emailsService.saveEmails(candidate.getEmails());
		}
		
		//Save Profile Details
		if (!candidate.getProfiles().isEmpty()) {
			for (Profiles profile : candidate.getProfiles()) {
				profile.setSno(candidate.getSno());
			}
			
			profilesService.saveProfiles(candidate.getProfiles());
		}
		

	}

}
