/**
 *
 */
package omare.com.mx.demo.model;

import java.util.Date;

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
public class Usuario {

	private int id;

	private String nombreUsuario;

	private String password;

	private String correo;

	private Estatus estatus;

	private String imagen;

	private Date miembroDesde;

	private Date ultimoLogin;

	private Rol rol;
}
