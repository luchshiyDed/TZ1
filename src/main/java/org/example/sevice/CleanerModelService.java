package org.example.sevice;

import org.example.model.CleanerModel;
import org.example.repository.CleanerModelRepository;
import org.springframework.stereotype.Service;

@Service
public class CleanerModelService extends ModelService<CleanerModel,Long> {
    public CleanerModelService(CleanerModelRepository repository) {
        super(repository);
    }
}
