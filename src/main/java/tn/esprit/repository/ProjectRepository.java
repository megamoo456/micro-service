package tn.esprit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
	@Query("SELECT project From Project project")
	List<Project> getAllProject();
}
