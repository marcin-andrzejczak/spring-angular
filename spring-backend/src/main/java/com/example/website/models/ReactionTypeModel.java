package com.example.website.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "reaction_types")
@EqualsAndHashCode(callSuper = true)
public class ReactionTypeModel extends AbstractModel {

    @NotNull
    @Column(nullable = false)
    private String name;

    @NotNull
    @Column(nullable = false)
    private String icon;

    @OneToMany(mappedBy = "reactionType")
    private List<ReactionModel> reactions;
}
