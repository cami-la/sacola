package dev.camila.sacola.services.impl;

import dev.camila.sacola.models.Endereco;
import dev.camila.sacola.models.Restaurante;
import dev.camila.sacola.models.dto.RestauranteForm;
import dev.camila.sacola.repository.RestauranteRepository;
import dev.camila.sacola.services.RestauranteService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public record RestauranteServiceImpl(
    RestauranteRepository restauranteRepository
) implements RestauranteService {

  @Override
  public Restaurante saveRestaurante(RestauranteForm form) {
    Restaurante novoRestaurante = Restaurante.builder()
        .nomeRestaurante(form.getNomeRestaurante())
        .catalogoProdutos(new ArrayList<>())
        .endereco(new Endereco().builder()
            .rua(form.getRua())
            .cidade(form.getCidade())
            .cep(form.getCep())
            .complemento(form.getComplemento())
            .build())
        .build();
    return restauranteRepository.save(novoRestaurante);
  }

  @Override
  public List<Restaurante> getAllRestaurante() {
    return restauranteRepository.findAll();
  }

  @Override
  public Restaurante getRestauranteById(Long id) {
    return restauranteRepository.findById(id).get();
  }

  @Override
  public Restaurante updateRestaurante(Long id, RestauranteForm formUpdate) {
    Restaurante restauranteById = getRestauranteById(id);
    restauranteById.setEndereco(new Endereco().builder()
        .rua(formUpdate.getRua())
        .cidade(formUpdate.getCidade())
        .cep(formUpdate.getCep())
        .complemento(formUpdate.getComplemento())
        .build());
    return restauranteRepository.save(restauranteById);
  }

  @Override
  public void deleteRestaurante(Long id) {
    restauranteRepository.deleteById(id);
  }
}
