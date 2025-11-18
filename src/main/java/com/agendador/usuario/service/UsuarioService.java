package com.agendador.usuario.service;

import com.agendador.usuario.converter.UsuarioConverter;
import com.agendador.usuario.dto.UsuarioDTO;
import com.agendador.usuario.entity.Usuario;
import com.agendador.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.converterParaUsuario(usuarioDTO);
        return usuarioConverter.converterParaUsuarioDTO(usuarioRepository.save(usuario));
    }
}
