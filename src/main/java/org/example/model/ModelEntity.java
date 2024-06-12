package org.example.model;

import lombok.EqualsAndHashCode;


public interface ModelEntity extends NamedEntity{
    public ModelAttributes getModelAttributes();

    public void setModelAttributes(ModelAttributes modelAttributes);
}
