package com.example.hwWeb.Repository;

import com.example.hwWeb.Entity.ParentEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AbiturParentRepository extends CrudRepository<ParentEntity,Long> {
    ParentEntity findByIdLike(Long id);
    List<ParentEntity> findByAbiturIdLike(Long abiturId);
    ParentEntity findByNameLike(String name);
}
