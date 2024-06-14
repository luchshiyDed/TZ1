package org.example.sevice;

import org.example.model.Manufacture;
import org.example.repository.ManufactureRepository;


public class ManufactureService extends NamedService<Manufacture,String> {
    public ManufactureService(ManufactureRepository repository) {
        super(repository);
    }
}
