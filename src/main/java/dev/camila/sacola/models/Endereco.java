package dev.camila.sacola.models;

import javax.persistence.Embeddable;


@Embeddable
public class Endereco {
  private String rua;
  private String cidade;
  private String cep;
  private String complemento;
}
