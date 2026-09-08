package com.workflowx.workflowxbackend.service;

import com.workflowx.workflowxbackend.entity.ProjectMember;
import com.workflowx.workflowxbackend.exception.ResourceNotFoundException;
import com.workflowx.workflowxbackend.repository.ProjectMemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberService {

    private final ProjectMemberRepository projectMemberRepository;

    public ProjectMemberService(ProjectMemberRepository projectMemberRepository) {
        this.projectMemberRepository = projectMemberRepository;
    }

    public ProjectMember addMember(ProjectMember projectMember) {
        return projectMemberRepository.save(projectMember);
    }

    public List<ProjectMember> getAllMembers() {
        return projectMemberRepository.findAll();
    }

    public ProjectMember getMemberById(Long id) {
        return projectMemberRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Project member not found with id: " + id));
    }
}