package com.example.demo.services;

import com.example.demo.models.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(String roleName);
}
