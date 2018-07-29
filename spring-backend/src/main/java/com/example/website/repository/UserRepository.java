package com.example.website.repository;

import com.example.website.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
@CrossOrigin(origins = "http://localhost:4200")
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
