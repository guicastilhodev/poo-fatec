import java.util.Scanner;

public class EleicaoPrefeitura
{

   public static void main (String args[])
   {
      Scanner input = new Scanner(System.in);
      int monica = 0, cebolinha = 0, cascao = 0, magali = 0, branco = 0, nulo = 0;
      int voto;
       
      while (true) {
         System.out.print ("Digite seu voto: (10)Monica, (20)Cebolinha, (30)Cascao, (40)Magali, (0)Branco, (1)Nulo, (-1)Encerrar eleicao ");
         voto = input.nextInt();
         
         if (voto == -1) {
         System.out.println("Eleicao encerrada");
         break;
         }
         
         switch (voto) {
            case 10: 
               monica++;
               break;
            case 20:
               cebolinha++;
               break;
            case 30:
               cascao++;
               break;
            case 40:
               magali++;
               break;
            case 0:
               branco++;
               break;
            case 1:
               nulo++;
               break;
           default:
               System.out.println("Digite um valor valido!");
          }
       
      }
        
      String resultado = "Monica";
      int maisVotos = monica;
      
      
      if (cebolinha > maisVotos) {
      maisVotos = cebolinha;
      resultado = "Cebolinha";
      } else if (cascao > maisVotos) {
      maisVotos = cascao;
      resultado = "Cascao";
      } else if (magali > maisVotos) {
      maisVotos = magali;
      resultado = "Magali";
      } else if (maisVotos == 0) {
      resultado = "Nenhum voto foi computado";
      } else if (monica == maisVotos && cebolinha == maisVotos || cascao == maisVotos || magali == maisVotos) {
         resultado = "Empate";
      }
     
      
      
      System.out.println("Resultado: " + resultado);
      
      }
      
}