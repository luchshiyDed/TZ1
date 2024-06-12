package org.example.repository;

import org.example.model.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends NamedRepository<Country,String> {
}
