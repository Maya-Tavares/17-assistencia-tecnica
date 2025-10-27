package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.stereotype.Service;

@Service
public class EquipamentoService {
    //inserir equipamento após a adição do cliente
    private final ClienteRepository clienteRepository;
    private final EquipamentoRepository equipamentoRepository;

    public EquipamentoService(ClienteRepository clienteRepository, EquipamentoRepository equipamentoRepository) {
        this.clienteRepository = clienteRepository;
        this.equipamentoRepository = equipamentoRepository;
    }

    // inserir na DB
    public Equipamento inserir(EquipamentoDTO equipamentoDTO) throws NoSuchFieldException {
        // usar var para local como opção quando não quiser declarar o padrão
        var cliente = clienteRepository.findById(equipamentoDTO.getIdCliente())
                .orElseThrow(() -> new NoSuchFieldException("Cliente não encontrado"));
        // função anônima sem parâmetro, se o cliente é = null, exceção

        var equipamento = new Equipamento();

        equipamento.setTipo(equipamentoDTO.getTipo());
        equipamento.setMarca(equipamentoDTO.getMarca());
        equipamento.setModelo(equipamentoDTO.getModelo());
        equipamento.setCliente(equipamentoDTO.getCliente());
        equipamento.setNumeroSerie(equipamento.getNumeroSerie());

        return equipamentoRepository.save(equipamento);
    }
}
