package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = false)
public class Country implements NamedEntity {
    @Id
    private String name;
}
