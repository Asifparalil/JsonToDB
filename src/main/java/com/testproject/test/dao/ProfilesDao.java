package com.testproject.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testproject.test.model.Profiles;

public interface ProfilesDao extends JpaRepository<Profiles, Long> {

}
