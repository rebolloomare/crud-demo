/**
 *
 */
package omare.com.mx.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author rebol
 *
 */
@Getter
@Setter
@AllArgsConstructor
public class Producto {

	private Integer sku;

	private String nombre;

	private String descripcion;

	private String unidad;

	private String precio;

	private Integer stock;

}
