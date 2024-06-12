package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table
public class FridgeModel implements ModelEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private ModelAttributes modelAttributes;
    // TODO: в идеале вынести в отдельные сущности
    private Long doorCnt;
    private String compressor;
}