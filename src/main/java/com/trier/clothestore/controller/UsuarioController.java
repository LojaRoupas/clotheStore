package com.trier.clothestore.controller;

import com.trier.clothestore.dto.UsuarioDto;
import com.trier.clothestore.model.UsuarioModel;
import com.trier.clothestore.security.JwtUtil;
import com.trier.clothestore.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping
    public ResponseEntity<UsuarioModel> salvar(@RequestBody @Valid UsuarioDto usuarioDto) {
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvar(usuarioDto));
    }

    @PostMapping("/login")
    public String login(@RequestBody @Valid UsuarioDto usuarioDto) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(usuarioDto.emailUsuario(), usuarioDto.senhaUsuario())
            );
            return "Bearer " + jwtUtil.generateToken(authentication.getName());
        } catch (Exception e) {
            return "Erro: Email ou senha estão incorretos";
        }
    }

    @GetMapping()
    public ResponseEntity<List<UsuarioModel>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listar());
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Object> getUsuario(@PathVariable("idUsuario") Integer idUsuario) {
        Optional<UsuarioModel> usuario0 = usuarioService.getUsuario(idUsuario);
        if (usuario0.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(usuario0.get());
    }
}