package org.example.model;

import lombok.Data;


import javax.persistence.*;

@Data
@Entity(name = "DeviceAttributes")
@Table
public class DeviceAttributes
{
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private Country country;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    private Manufacture manufacture;
    private Boolean canBeOrderedOnline;
    private Boolean instalment;
}
