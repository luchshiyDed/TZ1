package org.example.sevice;

import org.example.model.CleanerModel;
import org.example.repository.CleanerModelRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CleanerModelService extends ModelService<CleanerModel,Long> {
    private final CleanerModelRepository repository;
    public CleanerModelService(CleanerModelRepository repository) {
        super(repository);
        this.repository=repository;
    }
    public Page<CleanerModel> getByDustCollVolume(String dustCollVolume,Integer page){
        return repository.findByDustCollVolume(dustCollVolume, PageRequest.of(page,PAGE_COUNT));
    }
    public Page<CleanerModel> getByModeCnt(Integer modeCnt,Integer page){
        return repository.findByModeCnt(modeCnt, PageRequest.of(page,PAGE_COUNT));
    }
}
