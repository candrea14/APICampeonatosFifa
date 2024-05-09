package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;
import java.util.Optional;

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
    ciudad.setId(0);
    return repositorio.save(ciudad);
  }

  @Override
  public Ciudad modificar(Ciudad ciudad) {
   Optional<Ciudad> ciudadEncontrada = repositorio.findById(ciudad.getId());
    if (!ciudadEncontrada.isEmpty()) {
      return repositorio.save(ciudad);
    } else {
      return null; 
    }
  }

  @Override
  public boolean eliminar(int id) {
    try {
      repositorio.deleteById(id);
      return true;
    } catch (Exception ex) {
      return false;
    }
  }

}
