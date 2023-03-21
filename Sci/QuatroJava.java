import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		
	    int nums[] = new int[5];
    
    Scanner ent = new Scanner(System.in);
    
    for(int i=0; i<nums.length; i++){
        System.out.println("Digite o " + (i+1) + "° número: ");
        nums[i] = ent.nextInt();
    } 
    
	System.out.println("\nnumero: " + nums[2]);
	}
}
