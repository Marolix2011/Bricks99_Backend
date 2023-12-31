package com.marolix.Bricks99.repository;

import org.springframework.data.repository.CrudRepository;

import com.marolix.Bricks99.entity.UserType;

public interface UserTypeRepository extends CrudRepository<UserType, Integer> {
	UserType findByUserTypeName(String name);
}
