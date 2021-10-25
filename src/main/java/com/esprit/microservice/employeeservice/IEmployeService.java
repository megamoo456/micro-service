package com.esprit.microservice.employeeservice;

import java.util.List;




public interface IEmployeService {
	
	public int ajouterEmploye(Employe employe);

	public String getEmployePrenomById(int employeId);
	public void deleteEmployeById(int employeId);
	public void deleteContratById(int contratId);
	public int getNombreEmployeJPQL();
	public List<String> getAllEmployeNamesJPQL();
	public void mettreAjourEmailByEmployeIdJPQL(String email, int employeId);
	public List<Employe> getAllEmployes();

	
	
	

	
}
