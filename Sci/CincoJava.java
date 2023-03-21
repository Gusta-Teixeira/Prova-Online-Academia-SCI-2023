import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[3];
        double[][] notas = new double[3][4];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do " + (i+1) + "° aluno: ");
            nomes[i] = input.nextLine();
            
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("\nInforme a " +(j + 1) + "° nota de " + nomes[i]);
                notas[i][j] = input.nextDouble();
            }
            
            input.nextLine(); 
        }
        
        System.out.println("\n===== Médias dos alunos =====");
        double mediaMaxima = 0;
        double mediaMinima = 10;
        String nomeMaximo = "";
        String nomeMinimo = "";
        
        for (int i = 0; i < nomes.length; i++) {
            double media = calcularMedia(notas[i]);
            System.out.println("\nNome: " + nomes[i] + " Media: " +  media);
            
            if (media > mediaMaxima) {
                mediaMaxima = media;
                nomeMaximo = nomes[i];
            }
            
            if (media < mediaMinima) {
                mediaMinima = media;
                nomeMinimo = nomes[i];
            }
        }
        
        System.out.println("\nAluno com a maior média: " + nomeMaximo + " = " + mediaMaxima);
        System.out.println("\nAluno com a menor média: " + nomeMinimo + " = " + mediaMinima);
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

