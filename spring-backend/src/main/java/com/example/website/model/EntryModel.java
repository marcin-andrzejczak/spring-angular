package com.example.website.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.annotation.Conditional;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "entries")
@EqualsAndHashCode(callSuper = true)
public class EntryModel extends AbstractModel {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EntryType entryType;

    private String text;

    private String url;

    private String title;

    @OneToMany(mappedBy = "entry")
    private List<ReactionModel> reactions;

    @ManyToOne
    private UserModel user;

}
