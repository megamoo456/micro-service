package com.esprit.microservice.employeeservice;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class Employe implements Serializable{
	private static final long serialVersionUID = 6711457437559348053L;
	
	@Id
	@GeneratedValue
	private int id;
	private String nom, prenom,email;
	
	@Enumerated(EnumType.STRING)
	//@NotNull
	private Role role;
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(String nom) {
		super();
		this.nom = nom;
	}
	public Employe(String nom, String prenom, String email, Role role) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.role = role;
	}
}
