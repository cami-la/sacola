package dev.camila.sacola.repository;

import dev.camila.sacola.models.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends JpaRepository <Restaurante, Long> {
}
