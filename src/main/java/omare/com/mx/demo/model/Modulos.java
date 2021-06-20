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
public enum Modulos {

	ADMINISTRACION(1, "Administracion",
			"Modulo de administracion de todo el sistema", Estatus.ACTIVO),
	VENTAS(2, "Ventas", "Modulo de Ventas", Estatus.ACTIVO),
	COMPRAS(3, "Compras", "Modulo de compras", Estatus.ACTIVO),
	RECURSOS_HUMANOS(4, "Recursos Humanos", "Modulo de Recursos Humanos",
			Estatus.ACTIVO),
	INVENTARIOS(5, "Inventarios", "Modulo de Inventarios", Estatus.ACTIVO),
	CONTABILIDAD(6, "Contabilidad", "Modulo de Contabilidad", Estatus.ACTIVO),
	FINANZAS(7, "Finanzas", "Modulo de Finanzas", Estatus.ACTIVO),
	FACTURAS(8, "Facturas", "Modulo de Facturas", Estatus.ACTIVO),
	PAGOS(9, "Pagos", "Modulo de Pagos", Estatus.ACTIVO),
	CLIENTES(10, "Clientes", "Modulo de Clientes", Estatus.ACTIVO),
	PROVEEDORES(11, "Proveedores", "Modulo de Proveedores", Estatus.ACTIVO),
	REPORTES(12, "Reportes", "Modulo de Reportes", Estatus.ACTIVO);

	private Modulos(final int id, final String modulo, final String descripcion,
			final Estatus estatus) {
		this.id = id;
		this.modulo = modulo;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	private int id;

	private String modulo;

	private String descripcion;

	private Estatus estatus;

}
