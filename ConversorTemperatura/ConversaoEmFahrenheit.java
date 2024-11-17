import java.util.Scanner;

public class Retangulo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();

        double base = Math.abs(x2 - x1);
        double altura = Math.abs(y2 - y1);
        double area = base * altura;

        System.out.println("Base do retângulo: " + base);
        System.out.println("Altura do retângulo: " + altura);
        System.out.println("Área do retângulo: " + area);

        System.out.print("Pontos a serem verificados: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a coordenada x: ");
            double x = input.nextDouble();
            System.out.print("Digite a coordenada y: ");
            double y = input.nextDouble();

            if (x >= x1 && x <= x2 && y <= y1 && y >= y2) {
                System.out.println("O ponto (" + x + ", " + y + ") está dentro do retângulo.");
            } else {
                System.out.println("O ponto (" + x + ", " + y + ") está fora do retângulo.");
            }
        }
    }
}
