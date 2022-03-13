package com.example.demo.services.impl;

import com.example.demo.models.StatusUser;
import com.example.demo.repository.StatusUserRepository;
import com.example.demo.services.StatusUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusServiceImpl implements StatusUserService {

    @Autowired
    private StatusUserRepository statusUserRepository;

    @Override
    public Iterable<StatusUser> findAll() {
        return null;
    }

    @Override
    public Optional<StatusUser> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(StatusUser statusUser) {

    }

    @Override
    public Optional<StatusUser> findByName(String name) {
        return statusUserRepository.findByName(name);
    }
}
