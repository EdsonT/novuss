package com.novus.novuserp.controller;

import com.novus.novuserp.controller.dto.Response;
import com.novus.novuserp.domain.Project;
import com.novus.novuserp.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProjectController {

    @Autowired
    ProjectServiceImpl projectService;

    @GetMapping("projects")
    public Response getProjects(){
        Response response = new Response();
        response.setContent(projectService.getProjects());
        return response;
    }

    @PostMapping("create-project")
    public Response createProject(@RequestBody Project project){
        Response response = new Response();
        response.setContent(projectService.createProject(project.getName(),project.getDescription()));
        return response;
    }

}
