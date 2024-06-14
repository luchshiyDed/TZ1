package org.example.sevice;


import org.example.model.PhoneModel;
import org.example.repository.PhoneModelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PhoneModelService extends ModelService<PhoneModel,Long> {
    private final PhoneModelRepository repository;
    public PhoneModelService(PhoneModelRepository repository) {
        super(repository);
        this.repository=repository;
    }

    public Page<PhoneModel> getByMemory(String memory, Integer page) {
        return repository.findByMemory(memory, PageRequest.of(page,PAGE_COUNT));
    }

    public Page<PhoneModel> getByCamerasCnt(Integer camerasCnt, Integer page) {
        return repository.findByCamerasCnt(camerasCnt, PageRequest.of(page,PAGE_COUNT));
    }
}
