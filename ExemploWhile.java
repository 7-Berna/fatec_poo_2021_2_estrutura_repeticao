import java.util.Random;
public class ExemploWhile{

    public static void main(String[] args) {
        Random gerador = new Random();
        double nota1, nota2;
        int totalAlunos = 1;
        while (totalAlunos <= 5) {
            nota1 = gerador.nextDouble() * 10;
            nota2 = gerador.nextDouble() * 10;
            double resultado = (nota1 + nota2) / 2;
            System.out.printf("Media do aluno %d: %.2f\n", totalAlunos, resultado);
            totalAlunos = totalAlunos + 1;

        }
        System.out.println("Ate logo!");
    }
}