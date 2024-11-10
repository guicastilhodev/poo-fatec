class Retangulo
{
   private double base, altura;
      
   public Retangulo(double b, double a)
   {
      setBase(b);
      setAltura(a);
   }
   
   public Retangulo()
   {
      setBase(2);
      setAltura(1);
   } 
   
   
   public void setBase(double b)
   {
     if(b>0)
      base = b;
     else
      base = 0;  
   }
   
   public double getBase()
   {
      return base;
   }
   
   public void setAltura(double a)
   {
      if (a > 0)
         altura = a;
      else 
         altura = 0;
   }
   
   public double getAltura()
   {
      return altura;
   }
   
   public double getArea()
   {
      return base * altura;
   }
   
   public double getPerimetro()
   {
      return 2 * (base+altura);
   }
   
   public boolean isQuadrado()
   {
      return base == altura;
   }
   
   public void imprimirInformacoes()
   {
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("Quadrado? " + isQuadrado());
   }
      
}   
