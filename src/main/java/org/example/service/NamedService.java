package org.example.sevice;

import org.example.model.NamedEntity;
import org.example.repository.NamedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;

public class NamedService<T extends NamedEntity,V> {
    protected final int PAGE_COUNT=10;
    @Autowired
    protected final NamedRepository<T,V> repository;
    public NamedService(NamedRepository<T, V> repository){
        this.repository = repository;
    }
    public Page<T> getAll(Integer page, Sort sort){
        return repository.findAll(PageRequest.of(page,PAGE_COUNT).withSort(sort));
    }

    public HttpStatus delete(T entity){
        repository.delete(entity);
        return HttpStatus.OK;
    }

    public HttpStatus createIfNotExists(T namedEntity){
        if(namedEntity==null)
            return HttpStatus.BAD_REQUEST;
        if(repository.exists(Example.of(namedEntity)))
            return HttpStatus.CONFLICT;
        repository.save(namedEntity);
        return HttpStatus.CREATED;
    }
}
