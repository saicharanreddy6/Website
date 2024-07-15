package com.example.aboutmewebsite.entity;

import javax.persistence.*;

@Entity
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long skills_id;
	private String name;
	private String proficiency;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Skills() {
	}
	

	public Long getId() {
		return skills_id;
	}

	public void setId(Long id) {
		skills_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}
	

}
