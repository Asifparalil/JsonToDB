package com.testproject.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.test.dao.ExperienceDao;
import com.testproject.test.model.Experience;
import com.testproject.test.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService {

	
	@Autowired
	private ExperienceDao experienceDao; 
	@Override
	public void saveExperience(List<Experience> experience) {
		experienceDao.saveAll(experience);
	}

}
