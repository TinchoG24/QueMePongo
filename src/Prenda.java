/**
 * Clase que representa una prenda de vestir.
 */
public class Prenda {
  private String nombre;
  private Categoria categoria;
  private Tipo tipo;
  private String colorPrincipal;
  private String colorSecundario;
  private String material;

  /**
   * Constructor de la clase Prenda.
   *
   * @param nombre          Nombre de la prenda.
   * @param categoria       Categoría de la prenda.
   * @param tipo            Tipo de la prenda.
   * @param colorPrincipal  Color principal de la prenda.
   * @param colorSecundario Color secundario de la prenda.
   * @param material        Material de la prenda.
   */
  public Prenda(String nombre, Categoria categoria, Tipo tipo, String colorPrincipal,
                String colorSecundario, String material) {
    this.nombre = nombre;
    this.categoria = categoria;
    this.tipo = tipo;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.material = material;
  }


  public Tipo getTipo() {
    return tipo;
  }

  public String getNombre() {
    return nombre;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public String getColorPrincipal() {
    return colorPrincipal;
  }

  public String getColorSecundario() {
    return colorSecundario;
  }

  public String getMaterial() {
    return material;
  }

  /**
   * Método para mostrar la prenda.
   */
  public void mostrarPrenda() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Tipo: " + tipo);
    System.out.println("Color Principal: " + colorPrincipal);
    System.out.println("Color Secundario: " + colorSecundario);
    System.out.println("Material: " + material);
    System.out.println("Categoría: " + categoria);
    System.out.println("Factor Climático: " + tipo.getFactorClimatico());
    System.out.println("Factor Estético: " + tipo.getFactorEstetico());
    System.out.println("---------------------");
  }

}