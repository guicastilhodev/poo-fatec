public class Veiculo 
{
   protected String modelo;
   protected String placa;
   protected int ano;
   protected double valor;
   
   public Veiculo (String modelo, String placa, int ano, double valor)
   {
      setModelo(modelo);
      setPlaca(placa);
      setAno(ano);
      setValor(valor);
   }
   
   public String getModelo()
   {
      return modelo;
   }
   
   public String getPlaca()
   {
      return placa;
   }
   
   public int getAno()
   {
      return ano;
   }
   
   public double getValor()
   {
      return valor;
   }
   
   public void setModelo(String modelo)
   {
      this.modelo = modelo;
   }
   
   public void setPlaca(String placa)
   {
      this.placa = placa;
   }
   
   public void setAno(int ano)
   {
      this.ano = ano;
   }
   
   public void setValor(double valor)
   {
      if (valor > 0)
      {
         this.valor = valor;
      }
      else 
      {
         this.valor = 0;
      }
      
   }
   
   public void deprecia(float taxa)
   {
      setValor(valor - valor * taxa / 100);
   }
   
   public void imprime() 
   {
      System.out.printf("\nVeiculo: %s\nPlaca: %s\nAno: %d\nValor: %.2f\n", modelo, placa, ano, valor);
   }
   
     
}