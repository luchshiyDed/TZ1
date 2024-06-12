package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = false)
public class ColorName implements NamedEntity {
    @Id
    private String name;
}
