package org.example.sevice;


import org.example.model.FridgeModel;
import org.example.repository.FridgeModelRepository;
import org.springframework.stereotype.Service;

@Service
public class FridgeModelService extends ModelService<FridgeModel,Long> {
    public FridgeModelService(FridgeModelRepository repository) {
        super(repository);
    }
}
