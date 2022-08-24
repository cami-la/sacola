package dev.camila.sacola.resources;

import dev.camila.sacola.models.Restaurante;
import dev.camila.sacola.models.dto.RestauranteForm;
import dev.camila.sacola.services.impl.RestauranteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/restaurantes")
public record RestauranteResource(
    RestauranteServiceImpl restauranteService) {

  @PostMapping
  public Restaurante saveRestaurante(@RequestBody RestauranteForm form) {
    return restauranteService.saveRestaurante(form);
  }

  @GetMapping
  public List<Restaurante> getAllRestaurantes() {
    return restauranteService.getAllRestaurante();
  }

  @GetMapping("/{id}")
  public Restaurante getRestauranteById(@PathVariable(value = "id") Long id) {
    return restauranteService.getRestauranteById(id);
  }

  @PutMapping(path = "/update/{id}")
  public Restaurante updateRestaurante(
      @PathVariable(value = "id") Long id,
      @RequestBody RestauranteForm formUpdate) {
    return restauranteService.updateRestaurante(id, formUpdate);
  }

  @DeleteMapping(path = "/delete/{id}")
  @ResponseBody
  public void deleteRestaurante(@PathVariable(value = "id") Long id) {
    restauranteService.deleteRestaurante(id);
  }

}
