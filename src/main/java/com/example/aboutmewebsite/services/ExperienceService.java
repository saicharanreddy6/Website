package com.example.aboutmewebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aboutmewebsite.entity.Experience;
import com.example.aboutmewebsite.repositories.ExperienceRepository;

@Service
public class ExperienceService {
	
	@Autowired
	private ExperienceRepository experienceRepository;
	
	public List<Experience> getAllExperience(){
		return experienceRepository.findAll();
	}
	
	public Experience getExperienceById(Long Id) {
		return experienceRepository.findById(Id).orElse(null);
	}
	
	public Experience saveExperience(Experience experience) {
		return experienceRepository.save(experience);
	}
	
	public void deleteExperience(Long Id) {
		experienceRepository.deleteById(Id);
	}

}
