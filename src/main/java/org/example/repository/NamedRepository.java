package org.example.repository;


import org.example.model.NamedEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface NamedRepository<T extends NamedEntity,V>  extends JpaRepository<T,V> {
    public Page<T> findAll(Pageable pageable);
    public Page<T> findByName(String name,Pageable pageable);
}
