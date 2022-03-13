package com.example.demo.services;

import com.example.demo.models.StatusUser;

import java.util.Optional;

public interface StatusUserService extends GeneralService<StatusUser> {

    Optional<StatusUser> findByName(String name);
}
