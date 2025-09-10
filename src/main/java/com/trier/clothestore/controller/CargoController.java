package com.farmacia.elessandro.controller;

import com.farmacia.elessandro.dto.CargoDto;
import com.farmacia.elessandro.model.CargoModel;
import com.farmacia.elessandro.repository.CargoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/cargo")

public class CargoController {
    @Autowired
    private CargoRepository cargoRepository;

    @PostMapping
    public ResponseEntity<CargoModel> salvar(@RequestBody @Valid CargoDto cargoDto) {
        var cargoModel = new CargoModel();
        BeanUtils.copyProperties(cargoDto, cargoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoRepository.save(cargoModel));
    }

    @GetMapping()
    public ResponseEntity<List<CargoModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(cargoRepository.findAll());
    }

    @GetMapping("/{cdCargo}")
    public ResponseEntity<Object> getCargo(@PathVariable("cdCargo") Integer cdCargo) {
        Optional<CargoModel> cargo0 = cargoRepository.findById(cdCargo);
        if (cargo0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cargo nao encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cargo0.get());
    }
}
