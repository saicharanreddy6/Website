package com.example.aboutmewebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aboutmewebsite.entity.Skills;
import com.example.aboutmewebsite.repositories.SkillsRepository;

@Service
public class SkillsService {
	
	@Autowired
	private SkillsRepository skillsRepository;
	
	public List<Skills> getAllSkills(){
		return skillsRepository.findAll();
	}
	
	public Skills getSkillsById(Long Id) {
		return skillsRepository.findById(Id).orElse(null);
	}
	
	public Skills saveSkills(Skills skills) {
		return skillsRepository.save(skills);
	}
	
	public void deleteSkills(Long Id) {
		skillsRepository.deleteById(Id);
	}

}
