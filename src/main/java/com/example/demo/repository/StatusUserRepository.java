package com.example.demo.repository;

import com.example.demo.models.StatusUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusUserRepository extends JpaRepository<StatusUser, Long> {
}
