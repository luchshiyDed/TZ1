package org.example.sevice;


import org.example.model.ModelEntity;
import org.example.model.NamedEntity;
import org.example.repository.ModelRepository;
import org.example.repository.NamedRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class ModelService<T extends ModelEntity,V> extends NamedService<T,V> {
    protected final ModelRepository<T,V> repository;
    public ModelService(ModelRepository<T, V> repository) {
        super(repository);
        this.repository= repository;
    }
    public Page<T> getBySerialNumber(String serialNumber, Integer page){
        return repository.findBySerialNumber(serialNumber.toUpperCase(), PageRequest.of(page,PAGE_COUNT));
    }
    public Page<T> getByCost(Integer min , Integer max, Integer page, Sort sort){
        return repository.findByCost(min,max, PageRequest.of(page,PAGE_COUNT).withSort(sort));
    }
    public Page<T> getByColor(String color, Integer page){
        return repository.findByColor(color.toUpperCase(), PageRequest.of(page,PAGE_COUNT));
    }
    public Page<T> getBySize(String size, Integer page){
        return repository.findBySize(size.toUpperCase(), PageRequest.of(page,PAGE_COUNT));
    }
}
