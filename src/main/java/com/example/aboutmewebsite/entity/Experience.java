package com.example.aboutmewebsite.entity;

import javax.persistence.*;

@Entity
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long experience_id;
	private String organization;
	private String startDate;
	private String endDate;
	private String description;
	private String position;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public Long getId() {
		return experience_id;
	}

	public void setId(Long id) {
		this.experience_id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

//	public void setId(Long id2) {
//		// TODO Auto-generated method stub
//		
//	}

	

}
