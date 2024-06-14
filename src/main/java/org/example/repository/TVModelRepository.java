package org.example.repository;

import org.example.model.TVModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;



@Repository
public interface TVModelRepository extends ModelRepository<TVModel,Long> {
    Page<TVModel> findByTechnology(String technology, Pageable pageable);

    Page<TVModel> findByCategory(String category, Pageable pageable);
}
