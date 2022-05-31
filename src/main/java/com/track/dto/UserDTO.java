package com.track.dto;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
    
	
	private int userId;
	@NotNull
	private String name;
	@NotNull
	private String gender;
    
	
	
	@NotNull
	private String userName;
	@NotNull
	private String password;

	public UserDTO() {
		super();
	}

	public UserDTO(int userId, @NotNull String name, @NotNull String gender, @NotNull String userName,
			@NotNull String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", name=" + name + ", gender=" + gender + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	

}