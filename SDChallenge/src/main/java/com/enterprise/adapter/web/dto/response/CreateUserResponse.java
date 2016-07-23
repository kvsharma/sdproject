package com.enterprise.adapter.web.dto.response;

/**
 * 
 * @author anuj.kumar2
 *
 */
public class CreateUserResponse {
	private Long name;
	private String email;

	public Long getName() {
		return name;
	}

	public void setName(Long name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CreateUserResponse [name=" + name + ", email=" + email + "]";
	}
}
