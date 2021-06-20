/**
 *
 */
package omare.com.mx.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import omare.com.mx.demo.exceptions.UsuarioNotFoundException;
import omare.com.mx.demo.model.Usuario;
import omare.com.mx.demo.services.UsuarioService;

/**
 * @author rebol
 *
 */
@RestController
public class UsuarioController {

	private final Logger logger = LoggerFactory
			.getLogger(ProductoController.class);

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/obtenerUsuario/{id}")
	public Optional<Usuario> obtenerUsuario(@PathVariable int id) {
		logger.info("Metodo obtener usuario");
		Optional<Usuario> usuario = usuarioService.findUsuario(id);
		if (usuario == null) {
			logger.info("No se encontró ningún usuario con el id: " + id);
			throw new UsuarioNotFoundException("id no encontrado: " + id);
		}
		logger.info("Usuario encontrado con exito");
		return usuario;
	}

	@GetMapping("/obtenerTodosUsuarios")
	public List<Usuario> obtenerTodosUsuarios() {
		logger.info("Metodo obtenerTodosUsuarios");
		List<Usuario> listaUsuarios = usuarioService.obtieneTodosUsuarios();
		logger.info("Lista de usuarios con: " + listaUsuarios.size());
		return listaUsuarios;
	}

	@PostMapping("/crearUsuario")
	public void crearUsuario(@RequestBody Usuario usuario) {
		logger.info("Metodo crearUsuario()");
		usuarioService.guardarUsuario(usuario);
		logger.info("Usuario guardado con exito");
	}

	/**
	 * @param id
	 */
	@DeleteMapping("/borrarUsuario/{id}")
	public void borrarUsuario(@PathVariable int id) {
		Optional<Usuario> usuario = usuarioService.findUsuario(id);
		if (usuario != null) {
			logger.info("Existe un usuario a eliminar con el id: " + id);
			usuarioService.deleteById(id);
			logger.info("Usuario eliminado correctamente");
		} else {
			logger.info("No se encontró ningún usuario con el id: " + id);
			throw new UsuarioNotFoundException("id no encontrado: " + id);
		}
	}
}
