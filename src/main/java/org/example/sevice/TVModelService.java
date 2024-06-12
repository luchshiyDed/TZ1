package org.example.sevice;


import org.example.model.TVModel;
import org.example.repository.CleanerModelRepository;
import org.example.repository.TVModelRepository;
import org.springframework.stereotype.Service;

@Service
public class TVModelService extends ModelService<TVModel,Long> {
    public TVModelService(TVModelRepository repository) {
        super(repository);
    }
}
