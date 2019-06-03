package com.cts.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.FriendEntity;

public interface FriendRepository extends JpaRepository<FriendEntity, Integer> {
 
	Optional<FriendEntity> findByName(String name);
}
