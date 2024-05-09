package apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Ciudad;

public interface ICiudadServicio {
  
  public List<Ciudad> listar();

  public Ciudad obtener(int id);

  public Ciudad agregar(Ciudad ciudad);

  public Ciudad modificar(Ciudad ciudad);

  public boolean eliminar(int id);

}
