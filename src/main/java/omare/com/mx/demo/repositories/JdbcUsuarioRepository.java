/**
 *
 */
package omare.com.mx.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import omare.com.mx.demo.model.Usuario;

/**
 * @author rebol
 *
 */
@Repository
public class JdbcUsuarioRepository implements UsuarioRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int count() {
		return jdbcTemplate.queryForObject("select count(*) from usuarios",
				Integer.class);
	}

	@Override
	public int save(Usuario usuario) {
		String sql = "insert into roles_usuarios()";

		int resultado = jdbcTemplate.update(
				"insert into usuarios (nombre_usuario, password, correo_electronico, estatus, imagen) values (?, ?, ?, ?, ?)",
				usuario.getNombreUsuario(), usuario.getPassword(),
				usuario.getCorreo(), usuario.getEstatus().getDescripcion(),
				usuario.getImagen());

		System.out.println(resultado);
		return resultado;
	}

	@Override
	public int update(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from usuarios where idUsuario = ?",
				id);
	}

	@Override
	public List<Usuario> findAll() {
		return null;
	}

	@Override
	public List<Usuario> findByNombreUsuario(String nombreUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> findById(int id) {
		return null;
	}

}
