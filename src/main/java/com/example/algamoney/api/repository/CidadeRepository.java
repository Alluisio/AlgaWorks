package com.example.algamoney.api.repository;

import com.example.algamoney.api.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
