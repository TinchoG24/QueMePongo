package prenda;

/**
 * Clase que representa una prenda de vestir.
 */
public class PrendaBuilder {
  private String nombre;
  private Tipo tipo;
  private String colorPrincipal;
  private String colorSecundario;
  private String material;
  private Trama trama = Trama.LISA;


  /**
   * Seteo nombre de la prenda.
   *
   * @param nombre nombre
   */
  public PrendaBuilder setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Seteo trama de la prenda.
   *
   * @param trama trama
   */
  public PrendaBuilder setTrama(Trama trama) {
    this.trama = trama;
    return this;
  }

  /**
   * Seteo tipo de la prenda.
   *
   * @param tipo tipo
   */
  public PrendaBuilder setTipo(Tipo tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Seteo color principal de la prenda.
   *
   * @param colorPrincipal color principal
   */
  public PrendaBuilder setColorPrincipal(String colorPrincipal) {
    this.colorPrincipal = colorPrincipal;
    return this;
  }

  /**
   * Seteo color secundario de la prenda.
   *
   * @param colorSecundario color secundario
   */
  public PrendaBuilder setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
    return this;
  }

  /**
   * Seteo material de la prenda.
   *
   * @param material material
   */
  public PrendaBuilder setMaterial(String material) {
    this.material = material;
    return this;
  }

  /**
   * Método para construir la prenda.
   *
   * @return La prenda construida.
   */
  public Prenda build() {
    if (tipo == null || colorPrincipal == null) {
      throw new IllegalStateException("Faltan datos obligatorios para construir la prenda.");
    }
    return new Prenda(nombre, tipo, colorPrincipal, colorSecundario, material, trama);
  }
}