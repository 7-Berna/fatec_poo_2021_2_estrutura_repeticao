import java.util.Random;
public class ExemploFor{

    public static void main(String[] args) {
        Random gerador = new Random();
        double nota1, nota2;
        int totalAlunos;
        for (totalAlunos = 1;totalAlunos <= 5; totalAlunos++){  
            nota1 = gerador.nextDouble() * 10;
            nota2 = gerador.nextDouble() * 10;
            System.out.println(
                String.format("Media do aluno %d: %.2f\n", totalAlunos, (nota1 + nota2) / 2)
                );
        }
    }
}
