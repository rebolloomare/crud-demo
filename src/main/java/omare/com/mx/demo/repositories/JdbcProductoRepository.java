/**
 *
 */
package omare.com.mx.demo.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import omare.com.mx.demo.model.Producto;

/**
 * @author rebol
 *
 */
@Repository
public class JdbcProductoRepository implements ProductoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Producto producto) {
		return jdbcTemplate.update("insert into producto (");
	}

	@Override
	public int update(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		return jdbcTemplate.update("delete producto where id = ?", id);
	}

	@Override
	public List<Producto> findAll() {
		return null;
	}

	@Override
	public List<Producto> findByNombreAndPrecio(String nombre,
			BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Producto> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return jdbcTemplate.queryForObject("select count(*) from producto",
				Integer.class);
	}

	@Override
	public String getNameById(Long id) {
		return jdbcTemplate.queryForObject(
				"select nombre from producto where id = ?", new Object[] { id },
				String.class);
	}

}
