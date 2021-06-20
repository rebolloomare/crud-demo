/**
 *
 */
package omare.com.mx.demo.repositories;

import java.util.List;
import java.util.Optional;

import omare.com.mx.demo.model.Usuario;

/**
 * @author rebol
 *
 */
public interface UsuarioRepository {

	int count();

	int save(Usuario usuario);

	int update(Usuario usuario);

	int deleteById(int id);

	Optional<Usuario> findById(int id);

	List<Usuario> findAll();

	List<Usuario> findByNombreUsuario(String nombreUsuario);

}
