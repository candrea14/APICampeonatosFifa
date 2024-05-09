package apicampeonatosfifa.apicampeonatosfifa.core.entidades.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import apicampeonatosfifa.apicampeonatosfifa.core.entidades.Ciudad;

@Repository
public interface ICiudadRepositorio extends JpaRepository<Ciudad, Integer>{

}
