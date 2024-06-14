package org.example.sevice;

import org.example.model.TVDevice;
import org.example.repository.TVDeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class TVDeviceService extends DeviceService<TVDevice,Long> {
    public TVDeviceService(TVDeviceRepository repository) {
        super(repository);
    }
}
