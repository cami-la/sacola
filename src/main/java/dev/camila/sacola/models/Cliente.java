package dev.camila.sacola.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nomeCliente;
  @Column(unique = true, updatable = false)
  private String cpf;
  @Embedded
  private Endereco endereco;
}
