package dev.camila.sacola.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "produto_id", nullable = false)
  private Produto produto;
  private int quantidade;
  @ManyToMany(
      mappedBy = "item",
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )  private Sacola sacola;

}
