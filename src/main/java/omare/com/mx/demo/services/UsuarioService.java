/**
 *
 */
package omare.com.mx.demo.services;

import java.util.List;
import java.util.Optional;

import omare.com.mx.demo.model.Usuario;

/**
 * @author rebol
 *
 */
public interface UsuarioService {

	/**
	 * @param usuario
	 * @return
	 */
	int guardarUsuario(Usuario usuario);

	/**
	 * @return
	 */
	List<Usuario> obtieneTodosUsuarios();

	/**
	 * @param id
	 * @return
	 */
	int deleteById(int id);

	/**
	 * @param id
	 * @return
	 */
	Optional<Usuario> findUsuario(int id);

}
