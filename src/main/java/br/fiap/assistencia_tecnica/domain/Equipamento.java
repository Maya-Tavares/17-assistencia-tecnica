package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

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
