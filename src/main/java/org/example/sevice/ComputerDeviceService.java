package org.example.sevice;

import org.example.model.ComputerDevice;
import org.example.repository.ComputerDeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class ComputerDeviceService extends DeviceService<ComputerDevice,Long> {
    public ComputerDeviceService(ComputerDeviceRepository repository) {
        super(repository);
    }
}
