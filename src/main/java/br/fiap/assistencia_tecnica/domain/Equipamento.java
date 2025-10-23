package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

// definir chave-primária
@Entity
// para especificar o nome da tabela
@Table(name = "JAVA_EQUIPAMENTO")

public class Equipamento {
    // chave primária (constraint primary key)
    @Id
    // tipo de geração do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // inserindo pq o id nao esta com o mesmo nome requerido
    @Column(name = "ID_EQUIP")
    private long id;

    // muitos equipamentos para um cliente
    // lazy =  preguiçoso, eager = proativo
    @ManyToOne(fetch = FetchType.LAZY)

    // iguala o nome da chave estrangeira, não permite ser nula
    @JoinColumn(name = "ID_CLIENTE", nullable = false, foreignKey = @ForeignKey(name = "FK_EQUIP_CLIENTE"))
    private Cliente cliente;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;

}
