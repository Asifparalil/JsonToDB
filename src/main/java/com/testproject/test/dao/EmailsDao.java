package com.testproject.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testproject.test.model.Email;

/**
 * Dao Layer for Emails 
 * @author Asif
 *
 */
@Repository
public interface EmailsDao extends JpaRepository<Email, Long> {

}
