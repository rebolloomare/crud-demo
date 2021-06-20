/**
 *
 */
package omare.com.mx.demo.model;

import lombok.Getter;

/**
 * @author rebol
 *
 */
@Getter
public enum Estatus {

	ACTIVO(1, "Activo"), INACTIVO(2, "Inactivo");

	private Estatus(final int id, final String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	private int id;

	private String descripcion;

}
