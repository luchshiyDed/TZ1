package org.example.repository;

import org.example.model.TVDevice;
import org.springframework.stereotype.Repository;

@Repository
public interface TVDeviceRepository extends DeviceRepository<TVDevice,Long> {
}
