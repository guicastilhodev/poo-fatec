import java.util.Scanner;

public class NotasTurma
{
   public static void main(String args[])
   {
      final int ALUNOS = 5;
      final int PROVAS = 2;
      
      int lin, col;
      double media, mediaTurma = 0;
      
      double [][]notas = new double [ ALUNOS ] [ PROVAS + 1 ];
      Scanner entrada = new Scanner(System.in); 
      
      for (lin = 0 ; lin < ALUNOS; lin++)
      {
         System.out.printf("\nDigite as notas do %do aluno: ", lin+1);
         media = 0;
         for (col = 0; col < PROVAS; col++)
         {
            notas [ lin ] [ col ] = entrada.nextDouble();
            media += notas[ lin ] [ col ] ;
         }
         media /= PROVAS;
         notas [ lin ] [ PROVAS ] = media;
         mediaTurma += media;
            
      }
      
      mediaTurma/= ALUNOS;
      System.out.println();
      System.out.println("Notas e Média");
      
      for (lin = 0; lin < ALUNOS; lin++)
      {
         System.out.printf("\nAluno %d: ", lin+1);
         media = 0;
         for (col = 0; col < PROVAS; col++)
         {
            System.out.printf("%2.2f ", notas [ lin ] [ col ]);     
         }
         
         System.out.printf("- Média %2.2f ", notas [ lin ] [ PROVAS] );
         
         if ( notas [ lin ] [ PROVAS ] > mediaTurma )
         {
            System.out.print("Acima da média");
         }
         else if ( notas [ lin ] [ PROVAS ] < mediaTurma)
         {
            System.out.print("Abaixo da média");
         }
         else 
         {
            System.out.print("Na média");
         }              
      }
      System.out.println();
      System.out.println(mediaTurma);
      
   }
   
}        
