package com.cts.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> { 

}
