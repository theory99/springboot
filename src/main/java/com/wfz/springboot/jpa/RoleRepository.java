package com.wfz.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfz.springboot.pojo.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
