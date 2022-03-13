package com.example.demo.repository;

import com.example.demo.models.StatusUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatusUserRepository extends JpaRepository<StatusUser, Long> {

    Optional<StatusUser> findByName(String name);
}
