package com.testproject.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.testproject.test.model.Education;

/**
 * Dao Layer for Education 
 * @author Asif
 *
 */
@Repository
public interface EducationDao extends JpaRepository<Education, Long> {


}
