package tn.esprit.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entity.Project;
import tn.esprit.repository.ProjectRepository;


@Service
public class ProjectService implements IProjectService{

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project addProject(Project project) {
		projectRepository.save(project);
		return project;
	}

	@Override
	public Project updateProject(Project projectToUpdate, int id) {
		Project project = new Project();
		if(projectRepository.existsById(id)) {
			project = projectRepository.findById(id).get();
			project.setName(projectToUpdate.getName());
			project.setDescreption(projectToUpdate.getDescreption());
			project.setType(projectToUpdate.getType());
			project.setStatus(projectToUpdate.getStatus());
			project.setEndDate(projectToUpdate.getEndDate());
			project.setStartDate(projectToUpdate.getStartDate());
			project.setDuration(projectToUpdate.getDuration());
			projectRepository.save(project);
		}
		return project;
	}

	@Override
	public int deleteProject(int id) {
		Project project = new Project();
		if(projectRepository.existsById(id)) {
			project = projectRepository.findById(id).get();
			projectRepository.delete(project);
			return 1;
		}else {return 0;}
		
	}

	@Override
	public List<Project> getProjectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> retrieveAllProject() {
		return projectRepository.getAllProject();
	}
}
