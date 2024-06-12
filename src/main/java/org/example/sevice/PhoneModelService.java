package org.example.sevice;


import org.example.model.PhoneModel;
import org.example.repository.PhoneModelRepository;
import org.springframework.stereotype.Service;

@Service
public class PhoneModelService extends ModelService<PhoneModel,Long> {
    public PhoneModelService(PhoneModelRepository repository) {
        super(repository);
    }
}
