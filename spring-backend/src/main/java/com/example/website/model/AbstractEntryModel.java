package com.example.website.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
public abstract class AbstractEntryModel extends AbstractModel {



}
