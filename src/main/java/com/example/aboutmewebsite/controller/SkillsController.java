package com.example.aboutmewebsite.controller;

import com.example.aboutmewebsite.entity.Skills;
import com.example.aboutmewebsite.services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @GetMapping
    public List<Skills> getAllSkills() {
        return skillsService.getAllSkills();
    }

    @GetMapping("/{id}")
    public Skills getSkillsById(@PathVariable Long id) {
        return skillsService.getSkillsById(id);
    }

    // Endpoint to create a new skill
    @PostMapping
    public ResponseEntity<Skills> createSkill(@RequestBody Skills skills) {
        Skills createdSkill = skillsService.saveSkills(skills);
        return new ResponseEntity<>(createdSkill, HttpStatus.CREATED);
    }

    @PostMapping
    public Skills createSkills(@RequestBody Skills skills) {
        return skillsService.saveSkills(skills);
    }

    @PutMapping("/{id}")
    public Skills updateSkills(@PathVariable Long id, @RequestBody Skills skills) {
        skills.setId(id);
        return skillsService.saveSkills(skills);
    }

    @DeleteMapping("/{id}")
    public void deleteSkills(@PathVariable Long id) {
        skillsService.deleteSkills(id);
    }

    
    
}
