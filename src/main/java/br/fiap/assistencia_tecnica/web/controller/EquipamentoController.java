package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.service.EquipamentoService;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.web.bind.annotation.*;

// controller only é feito com HTML
// restcontroller é feito com Json
@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    public void inserir(@RequestBody EquipamentoDTO equipamentoDTO){
        return service.inserir(equipamentoDTO);
    }
//    @PostMapping
//    @ResponseStatus()
}
