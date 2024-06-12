package org.example.repository;

import org.example.model.DeviceAttributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceAttributeRepository extends JpaRepository<DeviceAttributes,Long> {
}
