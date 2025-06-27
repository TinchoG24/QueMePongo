package clima;

public class CondicionClimatica {
  private double temperatura;
  private double probabilidadLluvia;

  public CondicionClimatica(double temperatura, double probabilidadLluvia) {
    this.temperatura = temperatura;
    this.probabilidadLluvia = probabilidadLluvia;
  }

  public double getTemperatura() { return temperatura; }
  public double getProbabilidadLluvia() { return probabilidadLluvia; }
}
