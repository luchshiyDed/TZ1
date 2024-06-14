package org.example.repository;

import org.example.model.PhoneModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneModelRepository extends ModelRepository<PhoneModel,Long> {
    Page<PhoneModel> findByMemory(String memory, Pageable pageable);

    Page<PhoneModel> findByCamerasCnt(Integer camerasCnt, Pageable pageable);
}
