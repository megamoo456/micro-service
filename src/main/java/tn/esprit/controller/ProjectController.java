package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entity.Project;
import tn.esprit.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@PostMapping("/add-project")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Project> createCondidat(@RequestBody Project project){
		return new  ResponseEntity<>(projectService.addProject(project),HttpStatus.CREATED);
	}
	
	@PutMapping(value="/update-project/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Project> updateCondidat(@PathVariable(value="id")int id, @RequestBody Project project){
		return new  ResponseEntity<>(projectService.updateProject(project, id),HttpStatus.OK);
	}
	
	@GetMapping("/get/all")
	public List<Project> getDepById(){
		return projectService.retrieveAllProject();
	}
}
