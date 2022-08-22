package dev.camila.sacola.models;

import dev.camila.sacola.enums.FormaPagamento;
import dev.camila.sacola.enums.StatusSacola;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Sacola {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne(cascade={CascadeType.ALL}, optional = false, fetch = FetchType.LAZY)
  @JoinColumn(name="cliente_id", nullable = false)
  private Cliente cliente;
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "restaurante_id", nullable = false)
  private Restaurante restaurante;
  @ManyToMany(cascade={CascadeType.ALL}, fetch = FetchType.LAZY)
  @JoinTable(name="sacola_item", joinColumns=@JoinColumn(name="sacola_id"),
      inverseJoinColumns=@JoinColumn(name="item_id"))
  private List<Item> itensSacola;
  private double valorTotalSacola;
  private LocalDateTime dataCriacaoSacola;
  @Enumerated(EnumType.STRING)
  private FormaPagamento formaPagamento;
  @Enumerated(EnumType.STRING)
  private StatusSacola statusSacola;


}
