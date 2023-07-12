package com.novus.novuserp.service;

import com.novus.novuserp.domain.Project;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjectService {
    List<Project> getProjects();
    Project createProject(String name, String description);
    void removeProject();
}
