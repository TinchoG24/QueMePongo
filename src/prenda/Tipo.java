package prenda;

import factores.FactorClimatico;
import factores.FactorEstetico;

/**
 * Tipos de prendas con su categoria asociada
 */
public enum Tipo {
  CAMISA(Categoria.PARTE_SUPERIOR, FactorClimatico.CALOR, FactorEstetico.CASUAL),
  REMERA(Categoria.PARTE_SUPERIOR, FactorClimatico.CALOR, FactorEstetico.CASUAL),
  CHAQUETA(Categoria.PARTE_SUPERIOR, FactorClimatico.FRIO, FactorEstetico.FORMAL),
  ABRIGO(Categoria.PARTE_SUPERIOR, FactorClimatico.FRIO, FactorEstetico.INFORMAL),
  SUETER(Categoria.PARTE_SUPERIOR, FactorClimatico.FRIO, FactorEstetico.CASUAL),

  PANTALON(Categoria.PARTE_INFERIOR, FactorClimatico.FRIO, FactorEstetico.CASUAL),
  JEANS(Categoria.PARTE_INFERIOR, FactorClimatico.FRIO, FactorEstetico.CASUAL),
  BERMUDA(Categoria.PARTE_INFERIOR, FactorClimatico.CALOR, FactorEstetico.CASUAL),
  SHORT(Categoria.PARTE_INFERIOR, FactorClimatico.CALOR, FactorEstetico.INFORMAL),
  FALDA(Categoria.PARTE_INFERIOR, FactorClimatico.CALOR, FactorEstetico.CASUAL),

  ZAPATOS(Categoria.CALZADO, FactorClimatico.FRIO, FactorEstetico.FORMAL),
  BOTAS(Categoria.CALZADO, FactorClimatico.FRIO, FactorEstetico.FORMAL),
  ZAPATILLAS(Categoria.CALZADO, FactorClimatico.FRIO, FactorEstetico.CASUAL),
  BOTINES(Categoria.CALZADO, FactorClimatico.TODOS, FactorEstetico.DEPORTIVO),
  ZAPATILLAS_DEPORTIVAS(Categoria.CALZADO, FactorClimatico.TODOS, FactorEstetico.DEPORTIVO),
  ZAPATILLAS_DE_CASUAL(Categoria.CALZADO, FactorClimatico.TODOS, FactorEstetico.CASUAL),
  ZAPATILLAS_DE_TREKKING(Categoria.CALZADO, FactorClimatico.TODOS, FactorEstetico.DEPORTIVO),

  PANUELO(Categoria.ACCESORIO, FactorClimatico.FRIO, FactorEstetico.CASUAL),
  BUFANDA(Categoria.ACCESORIO, FactorClimatico.FRIO, FactorEstetico.CASUAL),
  GORRA(Categoria.ACCESORIO, FactorClimatico.CALOR, FactorEstetico.CASUAL),
  GORRO(Categoria.ACCESORIO, FactorClimatico.FRIO, FactorEstetico.CASUAL),
  ANTEOJOS(Categoria.ACCESORIO, FactorClimatico.CALOR, FactorEstetico.CASUAL);

  private Categoria categoria;
  private FactorClimatico factorClimatico;
  private FactorEstetico factorEstetico;

  // Constructor del enum TipoPrenda
  Tipo(Categoria categoria, FactorClimatico factorClimatico, FactorEstetico factorEstetico) {
    this.categoria = categoria;
    this.factorClimatico = factorClimatico;
    this.factorEstetico = factorEstetico;
  }


  // Método para obtener la categoría asociada a cada tipo de prenda
  public Categoria getCategoria() {
    return categoria;
  }

  // Método para obtener el factor climático asociado a cada tipo de prenda
  public FactorClimatico getFactorClimatico() {
    return factorClimatico;
  }

  // Método para obtener el factor estético asociado a cada tipo de prenda
  public FactorEstetico getFactorEstetico() {
    return factorEstetico;
  }
}
