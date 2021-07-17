package com.testproject.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testproject.test.model.Profiles;

/**
 * Service Layer of Profile Model
 * @author Asif
 *
 */
@Service
public interface ProfilesService {

	/**
	 * Save Profiles
	 * @param profiles
	 * @author Asif
	 */
	public void saveProfiles(List<Profiles> profiles);
}
