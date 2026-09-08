package com.workflowx.workflowxbackend.controller;

import com.workflowx.workflowxbackend.entity.ProjectMember;
import com.workflowx.workflowxbackend.service.ProjectMemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/project-members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;

    public ProjectMemberController(ProjectMemberService projectMemberService) {
        this.projectMemberService = projectMemberService;
    }

    @PostMapping
    public ProjectMember addMember(@RequestBody ProjectMember projectMember) {
        return projectMemberService.addMember(projectMember);
    }

    @GetMapping
    public List<ProjectMember> getAllMembers() {
        return projectMemberService.getAllMembers();
    }

    @GetMapping("/{id}")
    public ProjectMember getMemberById(@PathVariable Long id) {
        return projectMemberService.getMemberById(id);
    }
}