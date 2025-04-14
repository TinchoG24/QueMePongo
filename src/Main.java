import administrador.QueMePongo;

/**
 * Main class to run the administrador.QueMePongo application.
 * This class creates an instance of the administrador.QueMePongo class and calls its method to get an outfit suggestion.
 */
public class Main {
  /**
   * Main method to run the application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {

    // Create a new instance of the administrador.QueMePongo class
    QueMePongo queMePongo = new QueMePongo();
    queMePongo.login();
    queMePongo.menu();

  }

}
