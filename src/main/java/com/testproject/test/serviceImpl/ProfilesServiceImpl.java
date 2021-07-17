package com.testproject.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.test.dao.ProfilesDao;
import com.testproject.test.model.Profiles;
import com.testproject.test.service.ProfilesService;

@Service
public class ProfilesServiceImpl implements ProfilesService {

	@Autowired
	private ProfilesDao profilesDao;
	
	@Override
	public void saveProfiles(List<Profiles> profiles) {
		profilesDao.saveAll(profiles);
	}

}
