/**
 *
 */
package omare.com.mx.demo.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import omare.com.mx.demo.model.Producto;

/**
 * @author rebol
 *
 */
public interface ProductoRepository {

	int count();

	int save(Producto producto);

	int update(Producto producto);

	int deleteById(Long id);

	List<Producto> findAll();

	List<Producto> findByNombreAndPrecio(String nombre, BigDecimal precio);

	Optional<Producto> findById(Long id);

	String getNameById(Long id);
}
