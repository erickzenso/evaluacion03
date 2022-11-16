package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.UsuarioCliente;
import com.idat.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService{

	
	
	@Autowired
	private UsuarioClienteRepository repositorio;
	
	@Override
	public void guardar(UsuarioCliente usuario) {
		repositorio.save(usuario);
	}

	@Override
	public void actualizar(UsuarioCliente usuario) {
		repositorio.saveAndFlush(usuario);
	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<UsuarioCliente> listar() {
		return repositorio.findAll();
	}

	@Override
	public UsuarioCliente obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}
}

