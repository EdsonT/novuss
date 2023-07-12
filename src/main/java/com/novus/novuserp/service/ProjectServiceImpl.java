package com.novus.novuserp.service;

import com.novus.novuserp.domain.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    private List<Project> projects = new ArrayList<>();
    @Override
    public List<Project> getProjects() {

//        To Be Removed
        Project firstProject = new Project("Test Edson123", "This is just a test example");
        Project secondProject = new Project("Test Edson456", "This is just a test example");
        projects.add(firstProject);
        projects.add(secondProject);

        return projects;
    }

    @Override
    public Project createProject(String name, String description) {
        Project newProject = new Project(name, description);

        projects.add(newProject);

        return newProject;
    }

    @Override
    public void removeProject() {

    }
}
