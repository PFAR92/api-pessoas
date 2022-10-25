package com.paulo.crmapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paulo.crmapi.model.Pessoas;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long>{
    
}
