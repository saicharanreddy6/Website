package com.example.aboutmewebsite.controller;




import com.example.aboutmewebsite.entity.Experience;
import com.example.aboutmewebsite.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @GetMapping
    public List<Experience> getAllEducation() {
        return experienceService.getAllExperience();
    }

    @GetMapping("/{id}")
    public Experience getExperienceById(@PathVariable Long id) {
        return experienceService.getExperienceById(id);
    }

    @PostMapping
    public Experience createExperience(@RequestBody Experience education) {
        return experienceService.saveExperience(education);
    }


    @PutMapping("/{id}")
    public Experience updateExperience(@PathVariable Long id, @RequestBody Experience experience) {
        experience.setId(id);
        return experienceService.saveExperience(experience);
    }


    @DeleteMapping("/{id}")
    public void deleteExperience(@PathVariable Long id) {
        experienceService.deleteExperience(id);
    }
}

