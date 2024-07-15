package com.example.aboutmewebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.example.aboutmewebsite.entity.Education;
import com.example.aboutmewebsite.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

}
