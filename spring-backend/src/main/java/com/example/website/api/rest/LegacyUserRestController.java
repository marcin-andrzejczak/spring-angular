package com.example.website.api.rest;

import com.example.website.exception.ResourceNotFoundException;
import com.example.website.models.UserModel;
import com.example.website.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/legacy/api/rest/users")
@CrossOrigin(origins = "http://localhost:4200")
public class LegacyUserRestController {

    private Logger log = LogManager.getLogger(LegacyUserRestController.class);

    private UserRepository userRepository;

    public LegacyUserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<UserModel> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping
    public UserModel createUser(@Valid @RequestBody UserModel user){
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable(value = "id") Long userId){
        return userRepository.findById(userId).orElseThrow( () -> new ResourceNotFoundException("User", "id", userId));
    }

    @PutMapping("/{id}")
    public UserModel updateUser(@PathVariable(value = "id") Long userId,
                                @Valid @RequestBody UserModel userDetails){
        UserModel user = userRepository.findById(userId).orElseThrow( () -> new ResourceNotFoundException("User", "id", userId));
        user.setName(userDetails.getName());
        user.setSurname(userDetails.getSurname());
        user.setNickname(userDetails.getNickname());
        user.setEmail(userDetails.getEmail());
        user.setPassword(userDetails.getPassword());
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId){
        UserModel user = userRepository.findById(userId).orElseThrow( () -> new ResourceNotFoundException("User", "id", userId));
        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }

}
