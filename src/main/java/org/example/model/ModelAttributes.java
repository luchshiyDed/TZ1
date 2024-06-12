package org.example.model;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Data
@Entity
@Table
public class ModelAttributes {
    @Id
    @GeneratedValue
    private Long id;
    private String serialNumber;
    private Integer cost;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private ColorName color;
    private Boolean inStock;
    private String modelSize;
}
