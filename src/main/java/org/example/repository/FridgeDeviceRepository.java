package org.example.repository;

import org.example.model.FridgeDevice;
import org.springframework.stereotype.Repository;

@Repository
public interface FridgeDeviceRepository extends DeviceRepository<FridgeDevice,Long> {
}
