package dev.camila.sacola.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nomeProduto;
  private boolean disponivel;
  private double valorUnitario;
}
