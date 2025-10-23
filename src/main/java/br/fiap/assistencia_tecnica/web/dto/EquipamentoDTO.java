package br.fiap.assistencia_tecnica.web.dto;

import br.fiap.assistencia_tecnica.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Lombok: diminuir o código boilerplate

@Data
// construtor sem argumentos
@NoArgsConstructor
// @AllArgsConstructor

public class EquipamentoDTO {

    private Long id;
    private Cliente cliente;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;
}
