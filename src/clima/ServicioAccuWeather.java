package clima;

import java.util.List;
import java.util.Map;

public class ServicioAccuWeather implements ServicioMeteorologico {

  private AccuWeatherAPI api = new AccuWeatherAPI();

  @Override
  public CondicionClimatica obtenerCondicion(String ciudad) {
    List<Map<String, Object>> condiciones = api.getWeather(ciudad);
    Map<String, Object> condicionActual = condiciones.get(0);
    //Imprimime las condiciones que llegan de la api
    System.out.println("Condiciones recibidas de la API: " + condicionActual);
    Map<String, Object> tempMap = (Map<String, Object>) condicionActual.get("Temperature");
    double temperaturaFahrenheit = (int) tempMap.get("Value");
    double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5.0 / 9.0;

    double probabilidadLluvia = ((Number) condicionActual.get("PrecipitationProbability")).doubleValue();

    return new CondicionClimatica(temperaturaCelsius, probabilidadLluvia);
  }
}
