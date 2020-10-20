package com.example.hwWeb.Repository;

import com.example.hwWeb.Entity.AbiturientEntity;
import org.springframework.data.repository.CrudRepository;

public interface AbiturientRepository extends CrudRepository<AbiturientEntity, Long> {
    AbiturientEntity findByIdLike(Long id);
    AbiturientEntity findByNameLike(String name);

}
