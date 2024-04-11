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
@Table(name = "ciudad")
public class Ciudad {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_ciudad")
  @GenericGenerator(name = "secuencia_ciudad", strategy = "increment")
  @Column(name = "id")
  private int id;

  @Column(name = "ciudad", length = 100, unique = true)
  private String nombre;

  @ManyToOne
  @JoinColumn(name = "idpais", referencedColumnName = "id")
  private Seleccion seleccion;

  public Ciudad(int id, String nombre, Seleccion seleccion) {
    this.id = id;
    this.nombre = nombre;
    this.seleccion = seleccion;
  }

  public Ciudad() {
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

  public Seleccion getSeleccion() {
    return seleccion;
  }

  public void setSeleccion(Seleccion seleccion) {
    this.seleccion = seleccion;
  }

}
