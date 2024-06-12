package org.example.repository;

import org.example.model.ComputerDevice;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerDeviceRepository extends DeviceRepository<ComputerDevice,Long>{
}
