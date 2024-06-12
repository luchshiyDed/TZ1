package org.example.sevice;
import org.example.model.Country;
import org.example.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends NamedService<Country,String>{

    public CountryService(CountryRepository repository) {
        super(repository);
    }
}
