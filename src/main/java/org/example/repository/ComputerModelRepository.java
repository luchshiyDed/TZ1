package org.example.repository;

import org.example.model.ComputerModel;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerModelRepository extends ModelRepository<ComputerModel,Long> {
}
