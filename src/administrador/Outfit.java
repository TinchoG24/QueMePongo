package administrador;

import prenda.Prenda;

/**
 * Clase que representa un conjunto de prendas de vestir.
 */
public class Outfit {
  private Prenda parteSuperior;
  private Prenda parteInferior;
  private Prenda calzado;
  private Prenda accesorio;

  /**
   * Constructor de la clase administrador.Outfit.
   *
   * @param parteSuperior Prenda de la parte superior.
   * @param parteInferior Prenda de la parte inferior.
   * @param calzado       Prenda de calzado.
   * @param accesorio     Prenda de accesorio.
   */
  public Outfit(Prenda parteSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorio) {
    this.parteSuperior = parteSuperior;
    this.parteInferior = parteInferior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }

  /**
   * Método para mostrar el outfit.
   */
  public void mostrarOutfit() {
    System.out.println("Parte Superior: ");
    parteSuperior.mostrarPrenda();
    System.out.println("Parte Inferior: ");
    parteInferior.mostrarPrenda();
    System.out.println("Calzado: ");
    calzado.mostrarPrenda();
    System.out.println("Accesorio: ");
    accesorio.mostrarPrenda();
  }


}