package dev.camila.sacola.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class RestauranteForm {
  private String nomeRestaurante;
  private String rua;
  private String cidade;
  private String cep;
  private String complemento;
}
