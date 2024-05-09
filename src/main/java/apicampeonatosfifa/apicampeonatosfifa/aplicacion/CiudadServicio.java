package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Ciudad;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.repositorios.ICiudadRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.servicios.ICiudadServicio;

@Service
public class CiudadServicio implements ICiudadServicio {

  private ICiudadRepositorio repositorio;

  public CiudadServicio(ICiudadRepositorio repositorio) {
    this.repositorio = repositorio;
  }

  @Override
  public List<Ciudad> listar() {
    return repositorio.findAll();
  }

  @Override
  public Ciudad obtener(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'obtener'");
  }

  @Override
  public Ciudad agregar(Ciudad ciudad) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'agregar'");
  }

  @Override
  public Ciudad modificar(Ciudad ciudad) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'modificar'");
  }

  @Override
  public boolean eliminar(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
  }

}
