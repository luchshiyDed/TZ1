package org.example.repository;

import org.example.model.ComputerModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerModelRepository extends ModelRepository<ComputerModel,Long> {
    Page<ComputerModel> findByCategory(String category, Pageable pageable);

    Page<ComputerModel> findByProcessor(String processor, Pageable pageable);
}
