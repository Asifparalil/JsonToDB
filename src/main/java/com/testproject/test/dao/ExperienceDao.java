package com.testproject.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testproject.test.model.Experience;

public interface ExperienceDao  extends JpaRepository<Experience, Long> {

}
