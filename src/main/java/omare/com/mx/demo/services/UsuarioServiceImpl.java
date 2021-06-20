/**
 *
 */
package omare.com.mx.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import omare.com.mx.demo.model.Usuario;
import omare.com.mx.demo.repositories.UsuarioRepository;

/**
 * @author rebol
 *
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public int guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> obtieneTodosUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public int deleteById(int id) {
		return usuarioRepository.deleteById(id);
	}

	@Override
	public Optional<Usuario> findUsuario(int id) {
		return usuarioRepository.findById(id);
	}

}
