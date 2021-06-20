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
public enum Rol {

	ADMINISTRADOR(1, "Administrador", "Administrador del Sistema",
			Estatus.ACTIVO),
	GERENTE_RH(2, "Gerente RH", "Gerente de Recursos Humanos", Estatus.ACTIVO);

	private Rol(final int id, final String rol, final String descripcion,
			final Estatus estatus) {
		this.id = id;
		this.rol = rol;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	private int id;

	private String rol;

	private String descripcion;

	private Estatus estatus;

}
