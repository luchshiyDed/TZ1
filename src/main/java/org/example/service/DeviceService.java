package org.example.sevice;

import org.example.model.DeviceEntity;
import org.example.model.ModelEntity;
import org.example.repository.DeviceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;

import java.util.Optional;
@SuppressWarnings("unchecked")
public class DeviceService<T extends DeviceEntity, V> extends NamedService<T,V>{
    protected  final DeviceRepository<T,V> repository;
    public DeviceService(DeviceRepository<T,V> repository) {
        super(repository);
        this.repository= repository;

    }

    public Page<T> getByCountry(String country, Integer page){
        return  repository.findByCountry(country.toUpperCase(), PageRequest.of(page,PAGE_COUNT));
    }
    public Page<T> getByManufacture(String manufacture, Integer page){
        return repository.findByManufacture(manufacture.toUpperCase(), PageRequest.of(page,PAGE_COUNT));
    }
    public HttpStatus addModel(V id,ModelEntity model){
        Optional<T> device=repository.findById(id);
        if(device.isPresent()){
            //TODO: неприятно но с Generics не сработало
            device.get().getModels().add(model);
            repository.save(device.get());
            return HttpStatus.CREATED;
        }
        return HttpStatus.CONFLICT;
    }
}
