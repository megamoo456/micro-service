package tn.esprit.service;

import java.util.List;


import tn.esprit.entity.Project;

public interface IProjectService {
	   
	   public Project addProject(Project project);
	   public Project updateProject(Project projectToUpdate,int id);
	   public int deleteProject(int id);
	   public List<Project> getProjectByName(String name);
	   public List<Project> retrieveAllProject();
}
