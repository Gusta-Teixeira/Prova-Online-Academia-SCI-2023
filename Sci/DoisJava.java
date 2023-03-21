import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		
	    int comparacao[] = new int[5];
  
        int maior=0, menor= 0;
        
    Scanner ent = new Scanner(System.in);
    
    for(int i=0; i<comparacao.length; i++){
        System.out.println("Digite o " + (i+1) + "° número: ");
        comparacao[i] = ent.nextInt();
        
        maior = comparacao[i];
        menor = comparacao[i];
    } 
    
    for(int i=0; i<comparacao.length; i++){ 
        
        if(comparacao[i] > maior){
		        maior = comparacao[i];
		    }
		else if(comparacao[i] < menor){  
            menor = comparacao[i];
		 
		    }
    }
    
    System.out.println("Maior número: "+ maior + "\n");
    System.out.println("Menor número: "+ menor + "\n");
	}
}
