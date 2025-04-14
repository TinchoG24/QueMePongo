import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que representa un armario.
 */
public class Armario {
  List<Prenda> prendas = new ArrayList<>();

  /**
   * Constructor de la clase Armario.
   *
   * @param prendas Lista de prendas que contiene el armario.
   */
  public Armario(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  /**
   * Constructor sin parametros
   */
  public Armario() {

  }


  /**
   * Método para agregar una prenda al armario.
   *
   * @param prenda La prenda a agregar.
   */
  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  /**
   * Metodo para mostrar las prendas que hay en el armario.
   */
  public void mostrarPrendas() {
    for (Prenda prenda : prendas) {
      System.out.println("Nombre: " + prenda.getNombre());
      System.out.println("Tipo: " + prenda.getTipo());
      System.out.println("Color Principal: " + prenda.getColorPrincipal());
      System.out.println("Color Secundario: " + prenda.getColorSecundario());
      System.out.println("Material: " + prenda.getMaterial());
      System.out.println("Categoria: " + prenda.getTipo().getCategoria());
      System.out.println("Factor Climático: " + prenda.getTipo().getFactorClimatico());
      System.out.println("Factor Estético: " + prenda.getTipo().getFactorEstetico());
      System.out.println("---------------------");
    }
  }


  /**
   * Método para armar un outfit basado en el factor climático y estético.
   *
   * @param factorClimatico El factor climático a considerar.
   * @param factorEstetico  El factor estético a considerar.
   */
  public List<Outfit> armarOutfits(FactorClimatico factorClimatico, FactorEstetico factorEstetico, int cantidadOutfits) {
    List<Prenda> partesSuperiores = new ArrayList<>();
    List<Prenda> partesInferiores = new ArrayList<>();
    List<Prenda> calzados = new ArrayList<>();
    List<Prenda> accesorios = new ArrayList<>();

    // Clasificar las prendas por categoría
    for (Prenda prenda : prendas) {
      if (prenda.getTipo().getFactorClimatico() == factorClimatico
          && prenda.getTipo().getFactorEstetico() == factorEstetico) {
        switch (prenda.getTipo().getCategoria()) {
          case PARTE_SUPERIOR:
            partesSuperiores.add(prenda);
            break;
          case PARTE_INFERIOR:
            partesInferiores.add(prenda);
            break;
          case CALZADO:
            calzados.add(prenda);
            break;
          case ACCESORIO:
            accesorios.add(prenda);
            break;
          default:
            System.out.println("Categoría de prenda no reconocida: " + prenda.getTipo().getCategoria());
            break;
        }
      }
    }

    // Generar outfits aleatorios
    List<Outfit> outfits = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < cantidadOutfits; i++) {
      if (!partesSuperiores.isEmpty() && !partesInferiores.isEmpty() && !calzados.isEmpty() && !accesorios.isEmpty()) {
        Prenda parteSuperior = partesSuperiores.get(random.nextInt(partesSuperiores.size()));
        Prenda parteInferior = partesInferiores.get(random.nextInt(partesInferiores.size()));
        Prenda calzado = calzados.get(random.nextInt(calzados.size()));
        Prenda accesorio = accesorios.get(random.nextInt(accesorios.size()));

        outfits.add(new Outfit(parteSuperior, parteInferior, calzado, accesorio));
      } else {
        System.out.println("No hay suficientes prendas para generar un outfit completo.");
        break;
      }
    }

    return outfits;
  }
}
