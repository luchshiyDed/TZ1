package org.example.repository;

import org.example.model.CleanerDevice;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerDeviceRepository extends DeviceRepository<CleanerDevice,Long> {
}
