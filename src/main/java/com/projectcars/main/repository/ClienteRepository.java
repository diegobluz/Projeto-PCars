package com.projectcars.main.repository;

import com.projectcars.main.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

}
