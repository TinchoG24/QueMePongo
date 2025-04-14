import java.util.List;
import java.util.Scanner;

/**
 * QueMePongo class provides outfit suggestions based on the weather.
 * This is a simple implementation that returns a static outfit suggestion.
 */
public class QueMePongo {
  Armario armario = new Armario();

  /**
   * funcion de Login simple user y pass ingreso con scanner
   */
  public void login() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    // For simplicity, we will assume the login is always successful
    System.out.println("Login successful for user: " + username);

  }

  /**
   * Menu (switch)
   * 1. Login
   * 2. Register
   * 3. Cargar Prenda
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
      System.out.println("3. Cargar Prenda");
      System.out.println("4. Mostrar Prendas");
      System.out.println("5. Generar Outfit");
      System.out.println("6. Exit");
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
          armario.mostrarPrendas();
          break;
        case 5:
          // Generar Outfit basándose en factores climaticos y estetica
          generarOutfit();
          break;
        case 6:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice, please try again.");
      }
    } while (choice != 6);


  }

  private void generarOutfit() {

    /**
     * Ingresar Factor climatico y esteticos
     */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el clima (frio, calido, templado): ");
    String clima = scanner.nextLine();
    System.out.print("Ingrese la estetica (casual, formal, deportivo): ");
    String estetica = scanner.nextLine();
    System.out.print("Ingrese la cantidad de outfits que quiere generar");
    int cantidadDeOutfits = scanner.nextInt();

    /*
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

    List<Outfit> outfitGenerados = armario.armarOutfits(FactorClimatico.valueOf(clima.toUpperCase()),
        FactorEstetico.valueOf(estetica.toUpperCase()),
        cantidadDeOutfits);

    if (outfitGenerados != null) {
      for (Outfit outfit : outfitGenerados) {
        System.out.println("Outfit generado:");
        outfit.mostrarOutfit();
        System.out.println("---------------------");
      }
    } else {
      System.out.println("No se pudo generar un outfit completo con los criterios dados.");
    }

  }

  /**
   * Cargar una nueva prenda espeficando todos los campos
   */
  public void cargarPrenda() {

    Prenda prenda;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre de la prenda: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el tipo de la prenda: ");
    String tipo = scanner.nextLine();
    System.out.print("Ingrese el color principal de la prenda: ");
    String colorPrincipal = scanner.nextLine();
    System.out.print("Ingrese el color secundario de la prenda: ");
    String colorSecundario = scanner.nextLine();
    System.out.print("Ingrese el material de la prenda: ");
    String material = scanner.nextLine();

    /**
     * Metodo para validar que el tipo de prenda es correcto parametro que paso a
     * Tipo.valueOf(tipo.toUpperCase()) Try
     * Proximamente se extiende a que el color y material sean correctos (Enum)
     */
    try {
      Tipo.valueOf(tipo.toUpperCase());
    } catch (IllegalArgumentException e) {
      System.out.println("Tipo de prenda no valido");
      return;
    }

    prenda = new Prenda(nombre,
        Tipo.valueOf(tipo.toUpperCase()).getCategoria(),
        Tipo.valueOf(tipo.toUpperCase()),
        colorPrincipal,
        colorSecundario,
        material);

    armario.agregarPrenda(prenda);

  }


}
