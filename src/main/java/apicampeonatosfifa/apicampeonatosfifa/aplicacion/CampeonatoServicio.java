package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Seleccion;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.repositorios.ICampeonatoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.servicios.ICampeonatoServicio;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {

  private ICampeonatoRepositorio repositorio;

  private CampeonatoServicio(ICampeonatoRepositorio repositorio) {
    this.repositorio = repositorio;
  }

  @Override
  public List<Campeonato> listar() {
    return repositorio.findAll();
  }

  @Override
  public Campeonato obtener(int id) {
    Optional<Campeonato> campeonatoEncontrada = repositorio.findById(id);
    return campeonatoEncontrada.isEmpty()? null: campeonatoEncontrada.get();
  }

  @Override
  public Campeonato agregar(Campeonato campeonato) {
    campeonato.setId(0);
    return repositorio.save(campeonato);
  }

  @Override
  public Campeonato modificar(Campeonato campeonato) {
   Optional<Campeonato> campeonatoEncontrada = repositorio.findById(campeonato.getId());
    if (!campeonatoEncontrada.isEmpty()) {
      return repositorio.save(campeonato);
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

  @Override
  public List<Campeonato> buscar(String nombre) {
    return repositorio.buscar(nombre);
  }

}
