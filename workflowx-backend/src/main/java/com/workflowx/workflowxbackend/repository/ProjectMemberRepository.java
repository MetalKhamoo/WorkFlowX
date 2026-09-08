package com.workflowx.workflowxbackend.repository;

import com.workflowx.workflowxbackend.entity.ProjectMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, Long> {
}