package org.example.sevice;

import org.example.model.ComputerModel;
import org.example.repository.ComputerModelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ComputerModelService extends ModelService<ComputerModel,Long> {
    private final ComputerModelRepository repository;
    public ComputerModelService(ComputerModelRepository repository) {
        super(repository);
        this.repository=repository;
    }
    public Page<ComputerModel> getByProcessor(String processor,Integer page){
        return repository.findByProcessor(processor, PageRequest.of(page,PAGE_COUNT));
    }
    public Page<ComputerModel> getByCategory(String category,Integer page){
        return repository.findByCategory(category, PageRequest.of(page,PAGE_COUNT));
    }

}
