package dev.camila.sacola.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
@Entity
@NoArgsConstructor
public class Restaurante implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nomeRestaurante;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
  @JoinColumn(name = "restaurante_id")
  private List<Produto> catalogoProdutos;
  @Embedded
  private Endereco endereco;
}
