package com.example.website.services;

import com.example.website.models.UserModel;

import java.util.Optional;

/**
 * User security operations like login and logout, and CRUD operations on {@link com.example.website.models.UserModel}.
 *
 * @author marcin.andrzejczak
 *
 */
public interface UserCrudService {

    UserModel save(UserModel user);

    Optional<UserModel> find(Long id);

    Optional<UserModel> findByUsername(String username);

}
