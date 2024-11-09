package br.edu.unoesc.parkalot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import br.edu.unoesc.parkalot.model.Veiculo;

@RestController
public class VeiculoControllers {
    @Autowired
    private br.edu.unoesc.parkalot.repository.veiculoRepository veiculoRepository;
    
    @GetMapping(value = "listaVeiculos")
    public ResponseEntity<List<Veiculo>> listaVeiculos() {
        List<Veiculo> veiculos = veiculoRepository.findAll();
        return new ResponseEntity<List<Veiculo>>(veiculos, HttpStatus.OK);
    }

    @GetMapping(value = "criarVeiculo")
    public ResponseEntity<Veiculo> criarVeiculo(@RequestBody Veiculo veiculo) {
        veiculo = veiculoRepository.save(veiculo);
        return new ResponseEntity<Veiculo>(veiculo, HttpStatus.CREATED);
    }

    @GetMapping(value = "atualizarVeiculo")
    public ResponseEntity<?> atualizarVeiculo(@RequestBody Veiculo veiculo) {
        if (veiculo.getId() == null) {
            return new ResponseEntity<String>("Id não informado", HttpStatus.OK);
        }
        veiculo = veiculoRepository.saveAndFlush(veiculo);
        return new ResponseEntity<Veiculo>(veiculo, HttpStatus.OK);
    }

    @GetMapping(value = "deleteVeiculo")
    public ResponseEntity<Veiculo> deleteVeiculo(@RequestParam Long idveiculo) {
        veiculoRepository.deleteById(idveiculo);
        return new ResponseEntity<Veiculo>(HttpStatus.OK);
    }
}