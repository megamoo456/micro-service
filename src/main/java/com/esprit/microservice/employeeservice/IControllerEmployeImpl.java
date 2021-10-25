package com.esprit.microservice.employeeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class IControllerEmployeImpl  {
	@Autowired
	IEmployeService iemployeservice;


	public int ajouterEmploye(Employe employe)
	{
		iemployeservice.ajouterEmploye(employe);
		return employe.getId();
	}
    

	
	public String getEmployePrenomById(int employeId) {
		return iemployeservice.getEmployePrenomById(employeId);
	}

	
	public void deleteEmployeById(int employeId) {
		iemployeservice.deleteEmployeById(employeId);
		
	}
	public void deleteContratById(int contratId) {
		iemployeservice.deleteContratById(contratId);
	}

	
	public int getNombreEmployeJPQL() {
		
		return iemployeservice.getNombreEmployeJPQL();
	}

	
	public List<String> getAllEmployeNamesJPQL() {
		
		return iemployeservice.getAllEmployeNamesJPQL();
	}



	public void mettreAjourEmailByEmployeIdJPQL(String email, int employeId) {	
	iemployeservice.mettreAjourEmailByEmployeIdJPQL(email, employeId);
		
	}



	public List<Employe> getAllEmployes() {
		
		return iemployeservice.getAllEmployes();
	}

	
	

	
	

	
	

	
	
    
	
	
	
}
