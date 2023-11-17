package com.lms.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.lms.entity.LearnerUser;

public interface LearnerUserService {

	public LearnerUser saveLU(LearnerUser lu);

	public List<LearnerUser> getLU(long id);

	public LearnerUser updateLU(LearnerUser lu);

	public void deleteLU(long id);

	Boolean getByemail(LearnerUser lu);

	public ResponseEntity<?> getby(LearnerUser lu);

}