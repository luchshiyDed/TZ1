package org.example.repository;

import org.example.model.DeviceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

@NoRepositoryBean
public interface DeviceRepository<T extends DeviceEntity,V> extends NamedRepository<T,V> {
    @Query("select d from #{#entityName} d where upper(d.deviceAttributes.country) like :country%")
    public Page<T> findByCountry(@Param("country") String country, Pageable pageable);
    @Query("select d from #{#entityName} d where upper(d.deviceAttributes.manufacture) like %:manufacture%")
    public Page<T> findByManufacture(@Param("manufacture") String manufacture, Pageable pageable);
    @Query("select d from #{#entityName} d where d.deviceAttributes.canBeOrderedOnline=:canBeOrderedOnline")
    public Page<T> findByOnlineOrder(@Param("canBeOrderedOnline") Boolean canBeOrderedOnline, Pageable pageable);
    @Query("select d from #{#entityName} d where d.deviceAttributes.instalment=:instalment")
    public Page<T> findByInstalment(@Param("instalment") Boolean instalment, Pageable pageable);
}
