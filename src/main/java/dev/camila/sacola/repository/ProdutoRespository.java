package dev.camila.sacola.repository;

import dev.camila.sacola.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRespository extends JpaRepository <Produto, Long> {
}
