public class Carro extends Veiculo 
{
   private int numPortas;
   private int anoModelo;
   
   public Carro (String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor)
   {
      super(modelo,placa,anoFabr,valor);
      setPortas(numPortas);
      setAnoModelo(anoModelo);
   }
   
   public void setPortas(int numPortas)
   {
      this.numPortas = (numPortas > 2) ? numPortas : 2;
   }
   
   public int getPortas() 
   {
      return numPortas;
   }
   
   public void setAnoModelo (int anoModelo)
   {
      this.anoModelo = anoModelo;
   }
   
   public int getAnoModelo ()
   {
      return anoModelo;
   }
   
   public void imprime () 
   {
      super.imprime();
      System.out.printf("\n%02d Portas\n", numPortas);
      System.out.printf("\nAno Modelo: %4d", anoModelo);

   }
}