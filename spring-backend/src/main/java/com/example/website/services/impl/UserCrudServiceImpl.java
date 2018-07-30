package com.example.website.services.impl;

import com.example.website.models.UserModel;
import com.example.website.repository.UserRepository;
import com.example.website.services.UserCrudService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserCrudServiceImpl implements UserCrudService {

    @NonNull
    private UserRepository userRepository;

    @Override
    public UserModel save(UserModel user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<UserModel> find(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<UserModel> findByUsername(String username) {
        return userRepository.findByEmail(username);
    }
}
