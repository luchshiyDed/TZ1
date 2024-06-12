package org.example.repository;


import org.example.model.Manufacture;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufactureRepository extends NamedRepository<Manufacture,String> {
}
