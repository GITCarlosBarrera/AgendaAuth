package com.example.agenda.repositorios.impl;

import com.example.agenda.PasswordEncryptor;
import com.example.agenda.Rol;
import com.example.agenda.entidades.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public List<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("carlos",
                PasswordEncryptor.encrypt("1234"), Rol.ADMIN));
        usuarios.add(new Usuario("alicia",
                PasswordEncryptor.encrypt("1111"), Rol.USER));
        return usuarios;
    }
}
