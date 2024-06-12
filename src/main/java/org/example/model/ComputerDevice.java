package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table
public class ComputerDevice implements DeviceEntity{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private DeviceAttributes deviceAttributes;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private List<ComputerModel> models= new ArrayList<>();
}