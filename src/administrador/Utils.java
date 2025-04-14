package administrador;

import java.util.Random;

/**
 * This class contains utility methods for the application.
 * Currently, it is empty but can be expanded in the future.
 */
public class Utils {

  /**
   * Validates if a given value is a valid enum constant of the specified enum class.
   *
   * @param valor        The value to validate.
   * @param enumClass    The enum class to check against.
   * @param mensajeError The error message to display if validation fails.
   * @return true if the value is a valid enum constant, false otherwise.
   */
  public static boolean validarEnum(String valor, Class enumClass, String mensajeError) {
    try {
      Enum.valueOf(enumClass, valor.toUpperCase());
      return true;
    } catch (IllegalArgumentException e) {
      System.out.println(mensajeError);
      return false;
    }
  }

  /**
   * Returns a random enum constant from the specified enum class.
   *
   * @param enumClass The enum class to get a random constant from.
   * @param <T>       The type of the enum.
   * @return A random enum constant of the specified type.
   */
  public static <T extends Enum<?>> T getRandomEnum(Class<T> enumClass) {
    T[] valores = enumClass.getEnumConstants();
    return valores[new Random().nextInt(valores.length)];
  }


}
