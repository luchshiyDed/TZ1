package org.example.repository;

import org.example.model.FridgeModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeModelRepository extends ModelRepository<FridgeModel,Long>{
    Page<FridgeModel> findByDoorCnt(Integer cnt, Pageable pageable);

    Page<FridgeModel> findByCompressor(String compressor, Pageable pageable);
}
