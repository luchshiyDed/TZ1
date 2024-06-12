package org.example.repository;

import org.example.model.PhoneDevice;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneDeviceRepository extends DeviceRepository<PhoneDevice,Long> {
}
