/**
 *
 */
package omare.com.mx.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import omare.com.mx.demo.model.Producto;

/**
 * @author rebol
 *
 */
@Controller
public class ProductoController {

	private final Logger logger = LoggerFactory
			.getLogger(ProductoController.class);

	@PostMapping("/crearProducto")
	public String crearproducto(@RequestBody Producto producto) {
		logger.info("Metodo crearproducto()");
		return "ok";
	}

}
