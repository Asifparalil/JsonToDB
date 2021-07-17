package com.testproject.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testproject.test.dao.EmailsDao;
import com.testproject.test.model.Email;
import com.testproject.test.service.EmailsService;

@Service
public class EmailsServiceImpl implements EmailsService {

	@Autowired
	private EmailsDao emailsDao;
	
	@Override
	public void saveEmails(List<Email> emails) {
		emailsDao.saveAll(emails);
	}


}
