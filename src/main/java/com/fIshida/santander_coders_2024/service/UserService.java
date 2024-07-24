package com.fIshida.santander_coders_2024.service;

import com.fIshida.santander_coders_2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}