
/**
 * Main class to run the QueMePongo application.
 * This class creates an instance of the QueMePongo class and calls its method to get an outfit suggestion.
 */
public class Main {
  /**
   * Main method to run the application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {

    // Create a new instance of the QueMePongo class
    QueMePongo queMePongo = new QueMePongo();
    queMePongo.login();
    queMePongo.menu();

  }

}
