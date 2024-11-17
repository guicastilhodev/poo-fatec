public class ContaCorrente
{
   private int numeroConta;
   private String titular;
   private double saldo;
   private double limite;
   
   public ContaCorrente(int n, String t, double s, double l)
   {
      setTitular (t);
      if (n < 0)
         System.out.printf("\nNumero de conta invalido!");
      else 
         numeroConta = n;
         
      if (s < 0)
         System.out.printf("\nSaldo inicial invalido!");
      else 
         saldo = s;
      
      if (l < 0)
         System.out.printf("\nLimite inicial invalido!");
      else
         limite = l;
      
   }
   
   public void saque (double vlrSaque)
   {
      if (vlrSaque < 0)
         System.out.printf("\nValor de saque invalido!");
      else if (vlrSaque <= saldo) 
      {
         saldo -= vlrSaque;
      }
      else if (vlrSaque <= (saldo + limite)) 
      {
         double valorLimite = vlrSaque - saldo;
         saldo = 0;
         limite -= valorLimite;
      }
      else 
      {
         System.out.printf("\nRecurso insuficiente!");
      }
      
   }
   
   public void deposito (double vlrDeposito)
   {
      if (vlrDeposito < 0)
         System.out.printf("\nValor de deposito invalido!");
      else 
         saldo += vlrDeposito;     
   }
   
   public void verDados()
   {
      System.out.printf("\n=======================================");
      System.out.printf("\nConta  : %07d", getConta());
      System.out.printf("\nTitular: %s", getTitular());
      System.out.printf("\nSaldo  : R$ %.2f", getSaldo());
      System.out.printf("\nLimite : R$ %.2f", getLimite());
      System.out.printf("\n=======================================");
   }
   
   public void setTitular(String s)
   {
      titular = s;
   }
   
   public String getTitular ()
   {
      return titular;
   }
   
   public int getConta()
   {
      return numeroConta;
   }
   
   public double getSaldo ()
   {
      return saldo;
   }
   
   public double getLimite ()
   {
      return limite;
   }
   
}