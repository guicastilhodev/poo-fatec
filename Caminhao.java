public class Caminhao extends Veiculo 
{
   private int capacidade;
   private int numEixos;
   
   public Caminhao (String modelo, String placa, int anoFabr, int capacidade, int numEixos , double valor)
   {
      super(modelo,placa,anoFabr,valor);
      setCapacidade(capacidade);
      setEixos(numEixos);
   }
   
   public void setCapacidade(int capacidade)
   {
      this.capacidade = (capacidade > 0) ? capacidade : 1;
   }
   
   public int getCapacidade () 
   {
      return capacidade;
   }
   
   public void setEixos (int numEixos)
   {
      this.numEixos = numEixos;
   }
   
   public int getEixos ()
   {
      return numEixos;
   }
   
   public void imprime () 
   {
      super.imprime();
      System.out.printf("\nCapacidade: %d\n", capacidade);
      System.out.printf("Eixos: %d\n", numEixos);

   }
}