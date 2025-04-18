package administrador;

import factores.FactorClimatico;
import factores.FactorEstetico;
import java.util.List;
import java.util.Scanner;
import prenda.Prenda;
import prenda.PrendaBuilder;
import prenda.Tipo;
import prenda.Trama;

/**
 * administrador.QueMePongo class provides outfit suggestions based on the weather.
 * This is a simple implementation that returns a static outfit suggestion.
 */
public class QueMePongo {
  Armario armario = new Armario(100);

  String nombre = null;
  String tipo = null;
  String colorPrincipal = null;
  String colorSecundario = null;
  String material = null;

  /**
   * Funcion de Login simple user y pass ingreso con scanner.
   */
  public void login() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    scanner.nextLine();
    // For simplicity, we will assume the login is always successful
    System.out.println("Login successful for user: " + username);

  }

  /**
   * Menu (switch)
   * 1. Login
   * 2. Register
   * 3. Cargar prenda.Prenda
   * 4. Mostrar Prendas
   * 5. Generar Outfit
   * 6. Exit
   */
  public void menu() {
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("Menu:");
      System.out.println("1. Login");
      System.out.println("2. Register");
      System.out.println("3. Cargar Prenda Atomica");
      System.out.println("4. Cargar Prenda Builder");
      System.out.println("5. Mostrar Prendas");
      System.out.println("6. Generar Outfits");
      System.out.println("7. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          login();
          break;
        case 2:
          // Register logic here
          System.out.println("Proximamente...");
          break;
        case 3:
          // Cargar Prenda logic here
          cargarPrenda();
          break;
        case 4:
          // Cargar Prenda logic here
          cargarPrendaBuilder();
          break;
        case 5:
          armario.mostrarPrendas();
          break;
        case 6:
          // Generar Outfit basándose en factores climaticos y estetica
          generarOutfit();
          break;
        case 7:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice, please try again.");
      }
    } while (choice != 7);


  }

  /**
   * Cargar una nueva prenda usando el builder.
   */
  private void cargarPrendaBuilder() {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Cargar Prenda Builder:");
      System.out.println("1. Ingresar nombre (actual: "
          + (nombre != null ? nombre : "vacío") + ")");
      System.out.println("2. Ingresar tipo (actual: "
          + (tipo != null ? tipo : "vacío") + ")");
      System.out.println("3. Ingresar color principal (actual: "
          + (colorPrincipal != null ? colorPrincipal : "vacío") + ")");
      System.out.println("4. Ingresar color secundario (actual: "
          + (colorSecundario != null ? colorSecundario : "vacío") + ")");
      System.out.println("5. Ingresar material (actual: "
          + (material != null ? material : "vacío") + ")");
      System.out.println("6. Finalizar y guardar prenda");
      System.out.println("7. Volver al menú principal");
      System.out.print("Seleccione una opción: ");
      int opcion = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea

      switch (opcion) {
        case 1:
          System.out.print("Ingrese el nombre de la prenda: ");
          nombre = scanner.nextLine();
          break;
        case 2:
          System.out.print("Ingrese el tipo de la prenda: ");
          tipo = scanner.nextLine();
          break;
        case 3:
          System.out.print("Ingrese el color principal de la prenda: ");
          colorPrincipal = scanner.nextLine();
          break;
        case 4:
          System.out.print("Ingrese el color secundario de la prenda: ");
          colorSecundario = scanner.nextLine();
          break;
        case 5:
          System.out.print("Ingrese el material de la prenda: ");
          material = scanner.nextLine();
          break;
        case 6:
          try {
            Prenda prenda = new PrendaBuilder()
                .setNombre(nombre)
                .setTipo(tipo != null ? Tipo.valueOf(tipo.toUpperCase()) : null)
                .setMaterial(material)
                .setColorPrincipal(colorPrincipal)
                .setColorSecundario(colorSecundario)
                .build();
            System.out.println("Prenda creada exitosamente.");
            armario.agregarPrenda(prenda);
          } catch (Exception e) {
            System.out.println("Error al crear la prenda: " + e.getMessage());
          }
          return;
        case 7:
          System.out.println("Volviendo al menú principal...");
          return;
        default:
          System.out.println("Opción no válida, intente nuevamente.");
      }
    }

  }

  /**
   * Generar un outfit basado en factores climaticos y esteticos.
   */
  private void generarOutfit() {

    //Ingresar Factor climatico y esteticos
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el clima (frio, calido, templado): ");
    String clima = scanner.nextLine();
    System.out.print("Ingrese la estetica (casual, formal, deportivo): ");
    String estetica = scanner.nextLine();
    System.out.print("Ingrese la cantidad de outfits que quiere generar");
    int cantidadDeOutfits = scanner.nextInt();
    /*
        Proximamente....
        System.out.print("Ingrese la actividad (trabajo, fiesta, deporte): ");
        String actividad = scanner.nextLine();
        System.out.print("Ingrese la temporada (verano, invierno, primavera, otoño): ");
        String temporada = scanner.nextLine();
        System.out.print("Ingrese la hora (dia, noche):");
        String hora = scanner.nextLine();
        System.out.print("Ingrese el lugar (casa, oficina, parque): ");
        String lugar = scanner.nextLine();
        System.out.print("Ingrese el estado de la prenda (nuevo, usado): ");
        String estado = scanner.nextLine();
        System.out.print("Ingrese el color de la prenda (rojo, azul, verde): ");
        String color = scanner.nextLine();
    */

    // Validar los factores climaticos y esteticos
    if (!Utils.validarEnum(clima, FactorClimatico.class, "Factor climatico no valido")) {
      return;
    }
    if (!Utils.validarEnum(estetica, FactorEstetico.class, "Factor estético no valido")) {
      return;
    }

    List<Outfit> outfitGenerados = armario.armarOutfits(
        FactorClimatico.valueOf(clima.toUpperCase()),
        FactorEstetico.valueOf(estetica.toUpperCase()),
        cantidadDeOutfits);

    if (outfitGenerados != null) {
      for (Outfit outfit : outfitGenerados) {
        System.out.println("Outfit generado:");
        outfit.mostrarOutfit();
        System.out.println("-----------OUTFIT-------------");
      }
    } else {
      System.out.println("No se pudo generar un outfit completo con los criterios dados.");
    }

  }

  /**
   * Cargar una nueva prenda espeficando todos los campos.
   */
  public void cargarPrenda() {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre de la prenda: ");
    String nombre;
    nombre = scanner.nextLine();
    System.out.print("Ingrese el tipo de la prenda: ");
    String tipo;
    tipo = scanner.nextLine();
    System.out.print("Ingrese el color principal de la prenda: ");
    String colorPrincipal;
    colorPrincipal = scanner.nextLine();
    System.out.print("Ingrese el color secundario de la prenda: ");
    String colorSecundario;
    colorSecundario = scanner.nextLine();
    System.out.print("Ingrese el material de la prenda: ");
    String material;
    material = scanner.nextLine();
    System.out.print("Ingrese la trama de la prenda: ");
    String trama;
    trama = scanner.nextLine();

    //Validar Enums de prenda
    if (!Utils.validarEnum(tipo, Tipo.class, "Tipo de prenda no valido")) {
      return;
    }
    if (!Utils.validarEnum(trama, Trama.class, "Tipo de trama no valida")) {
      return;
    }

    Prenda prenda = new Prenda(nombre,
        Tipo.valueOf(tipo.toUpperCase()),
        colorPrincipal,
        colorSecundario,
        material,
        Trama.valueOf(trama));

    armario.agregarPrenda(prenda);

  }


}
