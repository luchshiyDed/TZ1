package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Table
@Entity
public class PhoneModel implements ModelEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private ModelAttributes modelAttributes;
    // TODO: в идеале вынести в отдельные сущности
    private String memory;
    private Long camerasCnt;
}