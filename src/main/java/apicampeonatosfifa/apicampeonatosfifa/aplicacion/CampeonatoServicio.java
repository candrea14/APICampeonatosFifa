package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.repositorios.ICampeonatoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.servicios.ICampeonatoServicio;

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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'obtener'");
  }

  @Override
  public Campeonato agregar(Campeonato campeonato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'agregar'");
  }

  @Override
  public Campeonato modificar(Campeonato campeonato) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'modificar'");
  }

  @Override
  public boolean eliminar(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
  }

}
