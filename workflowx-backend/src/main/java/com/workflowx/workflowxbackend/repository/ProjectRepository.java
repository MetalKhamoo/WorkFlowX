package com.workflowx.workflowxbackend.repository;

import com.workflowx.workflowxbackend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}