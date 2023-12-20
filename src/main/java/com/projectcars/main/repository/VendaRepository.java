package com.projectcars.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projectcars.main.models.Venda;

@Repository
public interface VendaRepository extends JpaRepository <Venda, Integer>{
}
