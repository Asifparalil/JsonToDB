package com.testproject.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testproject.test.model.Candidate;

@Repository
public interface CandidateDao extends JpaRepository<Candidate, Long> {

}
