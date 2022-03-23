package com.spring.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rest.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> getByNameAndDescription(String name, String Description);

}
