package org.example.sevice;



import org.example.model.CleanerDevice;
import org.example.model.CleanerModel;
import org.example.repository.CleanerDeviceRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CleanerDeviceService extends DeviceService<CleanerDevice,Long> {
    public CleanerDeviceService(CleanerDeviceRepository repository) {
        super(repository);
    }
}
