package org.example.sevice;




import org.example.model.FridgeDevice;
import org.example.repository.FridgeDeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class FridgeDeviceService extends DeviceService<FridgeDevice,Long> {

    public FridgeDeviceService(FridgeDeviceRepository repository) {
        super(repository);
    }
}
