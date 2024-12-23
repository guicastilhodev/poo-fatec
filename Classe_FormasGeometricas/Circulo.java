import java.lang.Math;
public class Circulo extends FormaGeometrica
{
   private double raio;
   
   public void setRaio(double raio)
   {
      if (raio<0) this.raio = 0;
      else this.raio = raio;
   }
   
   public Circulo (double raio)
   {
      setRaio(raio);
   }
   
   public double area()
   {
      return (Math.PI * Math.pow(raio, 2));
   }
   
   public void exibeInfo()
   {
      System.out.println("Dados do circulo");
      super.exibeInfo();
      System.out.println("Raio: "+ raio);
   }
   
}
      
   