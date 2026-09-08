package com.workflowx.workflowxbackend.repository;

import com.workflowx.workflowxbackend.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}