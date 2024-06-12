package org.example.repository;


import org.example.model.ModelEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

@NoRepositoryBean
public interface ModelRepository <T extends ModelEntity,V> extends NamedRepository<T,V> {
    @Query("select d from #{#entityName} d where upper(d.modelAttributes.serialNumber) like %:serialNumber%")
    public Page<T> findBySerialNumber(@Param("serialNumber") String serialNumber, Pageable pageable);
    @Query("select d from #{#entityName} d where d.modelAttributes.cost>cost1 and d.modelAttributes.cost<cost2")
    public Page<T> findByCost(@Param("cost1") Integer minCost,@Param("cost2") Integer maxCost, Pageable pageable);
    @Query("select d from #{#entityName} d where upper(d.modelAttributes.color) like %:color%")
    public Page<T> findByColor(@Param("color") String colorName, Pageable pageable);
    @Query("select d from #{#entityName} d where upper(d.modelAttributes.modelSize) like %:size%")
    public Page<T> findBySize(@Param("size") String size, Pageable pageable);
}
