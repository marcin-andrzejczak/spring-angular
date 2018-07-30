package com.example.website.repository;

import com.example.website.models.EntryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "medias", path = "medias")
@CrossOrigin(origins = "http://localhost:4200")
public interface EntryRepository extends JpaRepository<EntryModel, Long> {
}
