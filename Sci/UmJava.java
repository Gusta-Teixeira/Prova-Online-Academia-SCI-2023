import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		
	    int nums[] = new int[5];
  
        int par=0, impar=0, soma=0;
        
        float media = 0;
    
    Scanner ent = new Scanner(System.in);
    
    for(int i=0; i<nums.length; i++){
        System.out.println("Digite o " + (i+1) + "° número: ");
        nums[i] = ent.nextInt();
    } 
    
    for(int i=0; i<nums.length; i++){ 
        soma += nums[i];
        
        if(nums[i] % 2 == 0){
		        par++;
		    }
		    else{
		        impar++;
		    }
    }
    
    media = soma/nums.length;
    
    System.out.println("Média: "+ media + "\n");
    System.out.println("Quantidade de números pares: " + par + "\n");
	System.out.println("Quantidade de números ímpares: " + impar);
	}
}
