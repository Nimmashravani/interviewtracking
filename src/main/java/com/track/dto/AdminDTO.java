package com.track.dto;


import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.track.entity.Candidate;

@Component
public class AdminDTO extends Candidate {
	
	@NotNull
	private String designation;
	
	public AdminDTO() {
		super();
	}

	public AdminDTO(@NotNull String designation) {
		super();
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "AdminDTO [designation=" + designation + "]";
	}	
	
	
	
}
