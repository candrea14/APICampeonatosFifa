package apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Campeonato;

public interface ICampeonatoServicio {

  public List<Campeonato> listar();

  public Campeonato obtener(int id);

  public List<Campeonato> buscar(String nombre);

  public Campeonato agregar(Campeonato campeonato);

  public Campeonato modificar(Campeonato campeonato);

  public boolean eliminar(int id);
}
