package com.ridelog.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ridelog.backend.entity.UsersEntity;


@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Long>{

    Optional <UsersEntity> findByEmail(String email);

    boolean existsByEmail(String email);
    
}
