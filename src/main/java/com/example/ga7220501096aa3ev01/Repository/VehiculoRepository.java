package com.example.ga7220501096aa3ev01.Repository;

import com.example.ga7220501096aa3ev01.Models.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

// Repositorio que proporciona operaciones de acceso a datos para la entidad Vendedor
public interface VehiculoRepository extends JpaRepository<Vendedor, Integer> {
}
