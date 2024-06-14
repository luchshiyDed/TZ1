package org.example.sevice;



import org.example.model.ColorName;
import org.example.repository.ColorRepository;
import org.springframework.stereotype.Service;

@Service
public class ColorService extends NamedService<ColorName,String> {
    public ColorService(ColorRepository repository) {
        super(repository);
    }
}
