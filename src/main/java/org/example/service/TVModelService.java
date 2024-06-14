package org.example.sevice;


import org.example.model.TVModel;
import org.example.repository.CleanerModelRepository;
import org.example.repository.TVModelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class TVModelService extends ModelService<TVModel,Long> {
    private final TVModelRepository repository;
    public TVModelService(TVModelRepository repository) {
        super(repository);
        this.repository=repository;
    }

    public Page<TVModel> getByTechnology(String technology, Integer page) {
        return repository.findByTechnology(technology, PageRequest.of(page,PAGE_COUNT));
    }

    public Page<TVModel> getByCategory(String category, Integer page) {
        return repository.findByCategory(category, PageRequest.of(page,PAGE_COUNT));
    }
}
