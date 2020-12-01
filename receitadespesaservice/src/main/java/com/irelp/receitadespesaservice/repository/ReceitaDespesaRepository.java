package com.irelp.receitadespesaservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irelp.receitadespesaservice.entity.ReceitaDespesa;

public interface ReceitaDespesaRepository extends JpaRepository<ReceitaDespesa, Integer> {

}