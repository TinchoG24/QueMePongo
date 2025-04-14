package administrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import prenda.Prenda;
import prenda.Tipo;

/**
 * CLase generadora de prendas
 */
public class GeneradorDePrendas {

  /**
   * Metodo para generar una prenda aleatoria
   */
  public static Prenda generarPrenda() {
    Random rand = new Random();

    String nombre = String.valueOf(rand.nextInt(1000) + 1);

    // Seleccionar un tipo de prenda aleatorio del enum Tipo
    Tipo tipo = Tipo.values()[rand.nextInt(Tipo.values().length)];

    // Definir un color primario y secundario aleatorio
    String[] colores = {"Negro", "Blanco", "Gris", "Azul", "Rojo", "Verde", "Marrón", "Amarillo", "Naranja", "Violeta"};
    String colorPrimario = colores[rand.nextInt(colores.length)];
    String colorSecundario = rand.nextBoolean() ? colores[rand.nextInt(colores.length)] : null;

    // Asegurarse de que el color secundario no sea igual al color primario
    if (colorSecundario != null && colorSecundario.equals(colorPrimario)) {
      colorSecundario = null;
    }

    // Seleccionar un material aleatorio
    String[] materiales = {"Algodón", "Lana", "Jean", "Cuero", "Poliéster", "Nylon", "Lino", "Seda"};
    String material = materiales[rand.nextInt(materiales.length)];

    // Crear una nueva prenda con el tipo, colores y material generados aleatoriamente
    return new Prenda(nombre, tipo, colorPrimario, colorSecundario, material);
  }

  /**
   * Genera un lote de prendas aleatorias.
   */
  public static List<Prenda> generarLoteDePrendas(int cantidad) {
    List<Prenda> prendas = new ArrayList<>();
    for (int i = 0; i < cantidad; i++) {
      prendas.add(generarPrenda());
    }
    return prendas;
  }
}