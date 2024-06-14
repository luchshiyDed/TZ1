package org.example.sevice;


import org.example.model.PhoneDevice;
import org.example.repository.PhoneDeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class PhoneDeviceService extends DeviceService<PhoneDevice,Long> {
    public PhoneDeviceService(PhoneDeviceRepository repository) {
        super(repository);
    }
}
