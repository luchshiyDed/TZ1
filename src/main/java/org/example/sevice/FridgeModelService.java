package org.example.sevice;


import org.example.model.FridgeModel;
import org.example.repository.FridgeModelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class FridgeModelService extends ModelService<FridgeModel,Long> {
    private final FridgeModelRepository repository;
    public FridgeModelService(FridgeModelRepository repository) {
        super(repository);
        this.repository=repository;
    }

    public Page<FridgeModel> getByCompressor(String compressor, Integer page) {
       return repository.findByCompressor( compressor, PageRequest.of(page,PAGE_COUNT));
    }

    public Page<FridgeModel> getByDoorCnt(Integer cnt, Integer page) {
        return repository.findByDoorCnt( cnt, PageRequest.of(page,PAGE_COUNT));
    }
}
