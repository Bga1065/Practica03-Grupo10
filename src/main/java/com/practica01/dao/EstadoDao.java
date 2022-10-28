package com.practica01.dao;

import com.practica01.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDao extends JpaRepository<Estado,Long>{
    
}
