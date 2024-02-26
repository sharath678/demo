package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String user_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Vehicle> user=new ArrayList<Vehicle>();

	public User() {
		super();
	}

	public User(int user_id, String user_name, List<Vehicle> user) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user = user;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public List<Vehicle> getUser() {
		return user;
	}

	public void setUser(List<Vehicle> user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user=" + user + "]";
	}
	
	
}
