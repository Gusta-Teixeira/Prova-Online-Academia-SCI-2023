import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeAluno;
        double[] notas = new double[4];
        char opcao;
        
        do {
            System.out.print("\nDigite o nome do aluno: ");
            nomeAluno = input.nextLine();
            
            for (int i = 0; i < notas.length; i++) {
                System.out.println("\nInforme a " +(i + 1) + "° nota");
                notas[i] = input.nextDouble();
            }
            
            double media = calcularMedia(notas);
            
            if (media < 6) {
                System.out.println("\nNome: " + nomeAluno + " Media: " + media + "  Situação: Reprovado");
            } else {
                System.out.println("\nNome: " + nomeAluno + " Media: " + media + "  Situação: Aprovado");
            }
            
            System.out.print("\nDeseja continuar? (S/N) ");
            opcao = input.next().charAt(0);
            input.nextLine(); 
            
        } while (opcao == 'S' || opcao == 's');
        
        input.close();
    }
    
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
