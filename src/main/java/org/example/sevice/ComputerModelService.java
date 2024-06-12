package org.example.sevice;

import org.example.model.ComputerModel;
import org.example.repository.ComputerModelRepository;
import org.springframework.stereotype.Service;

@Service
public class ComputerModelService extends ModelService<ComputerModel,Long> {
    public ComputerModelService(ComputerModelRepository repository) {
        super(repository);
    }
}
