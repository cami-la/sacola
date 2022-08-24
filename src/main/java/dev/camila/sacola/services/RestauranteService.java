package dev.camila.sacola.services;

import dev.camila.sacola.models.Restaurante;
import dev.camila.sacola.models.dto.RestauranteForm;

import java.util.List;

public interface RestauranteService {
  Restaurante saveRestaurante(RestauranteForm form);
  List<Restaurante> getAllRestaurante();
  Restaurante getRestauranteById(Long id);
  Restaurante updateRestaurante(Long id, RestauranteForm formUpdate);
  void deleteRestaurante(Long id);
}
