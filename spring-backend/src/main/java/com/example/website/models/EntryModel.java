package com.example.website.models;

import com.example.website.models.validators.Conditional;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "entries")
@EqualsAndHashCode(callSuper = true)
@Conditional(selected = "entryType", values = "COMMENT", required = {"text", "user", "parent"})
@Conditional(selected = "entryType", values = "POST", required = {"text", "user"})
@Conditional(selected = "entryType", values = {"IMAGE", "VIDEO"}, required = {"url", "user"})
@Conditional(selected = "entryType", values = "MEME", required = {"title", "user"})
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

    @OneToMany(mappedBy = "parent")
    private List<EntryModel> children;

    @ManyToOne
    private EntryModel parent;

}
