package org.example.repository;

import org.example.model.PhoneModel;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneModelRepository extends ModelRepository<PhoneModel,Long> {
}
