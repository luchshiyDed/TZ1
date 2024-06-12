package org.example.repository;

import org.example.model.ModelAttributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelAttributeRepository extends JpaRepository<ModelAttributes,Long> {
}
