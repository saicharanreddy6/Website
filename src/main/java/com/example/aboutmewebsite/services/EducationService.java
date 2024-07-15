package com.example.aboutmewebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aboutmewebsite.entity.Education;
import com.example.aboutmewebsite.repositories.EducationRepository;


@Service
public class EducationService {
	
	@Autowired
	private EducationRepository educationRepository;
	
	public List<Education> getAllEducation(){
		return educationRepository.findAll();
	}
	
	public Education getEducationById(Long Id) {
		return educationRepository.findById(Id).orElse(null);
	}
	
	public Education saveEducation(Education education) {
		return educationRepository.save(education);
	}
	
	public void deleteEducation(Long Id) {
		educationRepository.deleteById(Id);
	}

}
