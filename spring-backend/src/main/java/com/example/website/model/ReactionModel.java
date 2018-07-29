package com.example.website.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "reactions")
@EqualsAndHashCode(callSuper = true)
public class ReactionModel extends AbstractModel{

    @NotNull
    @ManyToOne
    private ReactionTypeModel reactionType;

    @NotNull
    @ManyToOne
    private UserModel user;

    @NotNull
    @ManyToOne
    private EntryModel entry;

}
