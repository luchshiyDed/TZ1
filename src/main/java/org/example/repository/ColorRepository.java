package org.example.repository;

import org.example.model.ColorName;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends NamedRepository<ColorName,String> {
}
