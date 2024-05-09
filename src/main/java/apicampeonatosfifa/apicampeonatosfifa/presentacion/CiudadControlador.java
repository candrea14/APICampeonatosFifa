package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Ciudad;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.servicios.ICiudadServicio;

@RestController
@RequestMapping("/api/ciudades")
public class CiudadControlador {
  private ICiudadServicio servicio;

  private CiudadControlador(ICiudadServicio servicio) {
    this.servicio = servicio;
  }

  @RequestMapping(value = "/listar", method = RequestMethod.GET)
  public List<Ciudad> listar() {
    return servicio.listar();
  }
}
