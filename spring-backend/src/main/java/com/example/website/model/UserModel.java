package com.example.website.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
public class UserModel extends AbstractModel {

    @Email
    @NotBlank
    @Column(nullable = false)
    private String email;

    @NotBlank
    @Size(min = 2, max = 20)
    @Pattern(regexp = "^[A-Za-z]*$")
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Size(min = 2, max = 20)
    @Pattern(regexp = "^[A-Za-z]*$")
    @Column(nullable = false)
    private String surname;

    @Size(min = 2, max = 30)
    @Pattern(regexp = "^[A-Za-z\\-_.0-9@]*$")
    private String nickname;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;

    @Size(max = 256)
    @NotBlank
    @Column(nullable = false)
    private String password;

    @ManyToOne
    private EntryModel profilePicture;

    @OneToMany(mappedBy = "user")
    private List<EntryModel> entries;

}
