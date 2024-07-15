package com.example.aboutmewebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aboutmewebsite.entity.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {

}
