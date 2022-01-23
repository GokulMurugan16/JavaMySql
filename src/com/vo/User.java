package com.vo;

import java.util.Objects;

public class User {
	

	private int user_id;
	private String user_nmae;
	private String first_nmae;
	private String last_nmae;
	private String gender;
	private String password;
	private int status;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int user_id, String user_nmae, String first_nmae, String last_nmae, String gender, String password,
			int status) {
		super();
		this.user_id = user_id;
		this.user_nmae = user_nmae;
		this.first_nmae = first_nmae;
		this.last_nmae = last_nmae;
		this.gender = gender;
		this.password = password;
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_nmae() {
		return user_nmae;
	}

	public void setUser_nmae(String user_nmae) {
		this.user_nmae = user_nmae;
	}

	public String getFirst_nmae() {
		return first_nmae;
	}

	public void setFirst_nmae(String first_nmae) {
		this.first_nmae = first_nmae;
	}

	public String getLast_nmae() {
		return last_nmae;
	}

	public void setLast_nmae(String last_nmae) {
		this.last_nmae = last_nmae;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(first_nmae, gender, last_nmae, password, status, user_id, user_nmae);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(first_nmae, other.first_nmae) && Objects.equals(gender, other.gender)
				&& Objects.equals(last_nmae, other.last_nmae) && Objects.equals(password, other.password)
				&& status == other.status && user_id == other.user_id && Objects.equals(user_nmae, other.user_nmae);
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_nmae=" + user_nmae + ", first_nmae=" + first_nmae + ", last_nmae="
				+ last_nmae + ", gender=" + gender + ", password=" + password + ", status=" + status + "]";
	}
	
	
	
	
}
