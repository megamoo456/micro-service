package com.esprit.microservice.employeeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class EmployeService implements IEmployeService {

	@Autowired
	private EmployeRepository employeRepository;

	public int ajouterEmploye(Employe employe) {
		employeRepository.save(employe);
		return employe.getId();
	}
	public String getEmployePrenomById(int employeId) {
		Employe employeManagedEntity = employeRepository.findById(employeId).get();
		return employeManagedEntity.getPrenom();
	}
	public void deleteEmployeById(int employeId)
	{
		Employe employe = employeRepository.findById(employeId).get();


		employeRepository.delete(employe);
	}
	public int getNombreEmployeJPQL() {
		return employeRepository.countemp();
	}
	
	public List<String> getAllEmployeNamesJPQL() {
		return employeRepository.employeNames();

	}
	public void mettreAjourEmailByEmployeIdJPQL(String email, int employeId) {
		employeRepository.mettreAjourEmailByEmployeIdJPQL(email, employeId);

	}
	public List<Employe> getAllEmployes() {
		return (List<Employe>) employeRepository.findAll();
}
	@Override
	public void deleteContratById(int contratId) {
		// TODO Auto-generated method stub
		
	}
	
}
