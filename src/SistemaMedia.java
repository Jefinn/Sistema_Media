import java.util.Scanner;

public class SistemaMedia {

    public static void main(String[] args) {
        // Variáveis Global
        int i = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("""

                ██████╗░███████╗███╗░░░███╗  ██╗░░░██╗██╗███╗░░██╗██████╗░░█████╗░  ░█████╗░░█████╗░
                ██╔══██╗██╔════╝████╗░████║  ██║░░░██║██║████╗░██║██╔══██╗██╔══██╗  ██╔══██╗██╔══██╗
                ██████╦╝█████╗░░██╔████╔██║  ╚██╗░██╔╝██║██╔██╗██║██║░░██║██║░░██║  ███████║██║░░██║
                ██╔══██╗██╔══╝░░██║╚██╔╝██║  ░╚████╔╝░██║██║╚████║██║░░██║██║░░██║  ██╔══██║██║░░██║
                ██████╦╝███████╗██║░╚═╝░██║  ░░╚██╔╝░░██║██║░╚███║██████╔╝╚█████╔╝  ██║░░██║╚█████╔╝
                ╚═════╝░╚══════╝╚═╝░░░░░╚═╝  ░░░╚═╝░░░╚═╝╚═╝░░╚══╝╚═════╝░░╚════╝░  ╚═╝░░╚═╝░╚════╝░

                ░██████╗██╗░██████╗████████╗███████╗███╗░░░███╗░█████╗░  ██████╗░███████╗
                ██╔════╝██║██╔════╝╚══██╔══╝██╔════╝████╗░████║██╔══██╗  ██╔══██╗██╔════╝
                ╚█████╗░██║╚█████╗░░░░██║░░░█████╗░░██╔████╔██║███████║  ██║░░██║█████╗░░
                ░╚═══██╗██║░╚═══██╗░░░██║░░░██╔══╝░░██║╚██╔╝██║██╔══██║  ██║░░██║██╔══╝░░
                ██████╔╝██║██████╔╝░░░██║░░░███████╗██║░╚═╝░██║██║░░██║  ██████╔╝███████╗
                ╚═════╝░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝╚═╝░░╚═╝  ╚═════╝░╚══════╝

                ███╗░░██╗░█████╗░████████╗░█████╗░░██████╗
                ████╗░██║██╔══██╗╚══██╔══╝██╔══██╗██╔════╝
                ██╔██╗██║██║░░██║░░░██║░░░███████║╚█████╗░
                ██║╚████║██║░░██║░░░██║░░░██╔══██║░╚═══██╗
                ██║░╚███║╚█████╔╝░░░██║░░░██║░░██║██████╔╝
                ╚═╝░░╚══╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═════╝░
                    """);

        // Solicitando para user quantidade de alunos que ele deseja inserir no sistema
        System.out.println("\nInforme o numero de alunos que deseja inserir no sistema: ");
        int quantAlunos = inputScanner.nextInt();
        inputScanner.nextLine();

        String[] arrayAlunos = new String[quantAlunos];
        double[] mediasAlunos = new double[quantAlunos];  // Array para armazenar as médias

        for (i = 0; i < quantAlunos; i++) {
            System.out.println("\nInforme o nome do aluno(a): ");
            arrayAlunos[i] = inputScanner.nextLine();

            System.out.println("\nQuantas notas deseja inserir do aluno(a): ");
            int quantNotas = inputScanner.nextInt();
            inputScanner.nextLine();

            int[] arrayAlunosNotas = new int[quantNotas];

            int soma = 0;

            for (int j = 0; j < quantNotas; j++) {
                System.out.println("\nInforme a nota do aluno(a):  ");
                arrayAlunosNotas[j] = inputScanner.nextInt();
                inputScanner.nextLine();

                // Somando os valores do arrayAlunosNotas
                soma += arrayAlunosNotas[j];
            }

            // Calculando a media
            double media = (double) soma / quantNotas;
            mediasAlunos[i] = media;  // Armazenando a média no array

            System.out.println("\nVocê inseriu o(a): " + arrayAlunos[i]);
            System.out.println("Sua média é: " + media);
        }

        // Apresentando as pessoas que estão dentro do arrayAlunos
        System.out.println("\nEsses são os alunos(a) registrados em nosso sistema: ");
        for (i = 0; i < arrayAlunos.length; i++) {
            System.out.println("\nAluno " + i + ": " + arrayAlunos[i]);
            System.out.println("Média: " + mediasAlunos[i]);

            if (mediasAlunos[i] >= 7) {
                System.out.println("Aprovado ".toUpperCase());
            } else {
                System.out.println("Reprovado ".toUpperCase());
            }
        }

        // Encerrando inputScanner
        inputScanner.close();
    }
}
