package org.example.repository;

import org.example.model.CleanerModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerModelRepository extends ModelRepository<CleanerModel,Long> {
    Page<CleanerModel> findByDustCollVolume(String dustCollVolume, Pageable pageable);

    Page<CleanerModel> findByModeCnt(Integer modeCnt, Pageable pageable);
}
