package apicampeonatosfifa.apicampeonatosfifa.core.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "grupo")
public class Grupo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_grupo")
  @GenericGenerator(name = "secuencia_grupo", strategy = "increment")
  @Column(name = "id")
  private int id;

  @Column(name = "grupo", length = 100, unique = true)
  private String nombre;

  @ManyToOne
  @JoinColumn(name = "idcampeonato", referencedColumnName = "id")
  private Campeonato campeonato;

  public Grupo() {
  }

  public Grupo(int id, String nombre, Campeonato campeonato) {
    this.id = id;
    this.nombre = nombre;
    this.campeonato = campeonato;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Campeonato getCampeonato() {
    return campeonato;
  }

  public void setCampeonato(Campeonato campeonato) {
    this.campeonato = campeonato;
  }
  
}
