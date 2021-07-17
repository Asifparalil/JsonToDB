package com.testproject.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testproject.test.model.Email;

/**
 * Service Layer for Email Model
 * @author Asif
 *
 */

@Service
public interface EmailsService {
	/**
	 * Save Emails
	 * @param emails
	 * @author Asif
	 */
	public void saveEmails(List<Email> emails);
}
