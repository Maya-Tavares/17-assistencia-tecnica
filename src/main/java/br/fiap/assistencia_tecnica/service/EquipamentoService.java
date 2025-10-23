package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
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
}
