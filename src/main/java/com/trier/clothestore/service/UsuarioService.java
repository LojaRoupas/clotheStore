package com.trier.clothestore.service;

import com.trier.clothestore.dto.UsuarioDto;
import com.trier.clothestore.model.UsuarioModel;
import com.trier.clothestore.repository.UsuarioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // Salvar usuario com senha criptografada
    public UsuarioModel salvar(UsuarioDto usuarioDto) {
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);

        usuarioModel.setSenhaUsuario(passwordEncoder.encode(usuarioDto.senhaUsuario()));

        return usuarioRepository.save(usuarioModel);
    }


    public List<UsuarioModel> listar() {
        return usuarioRepository.findAll();
    }


    public Optional<UsuarioModel> getUsuario(Integer idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

}