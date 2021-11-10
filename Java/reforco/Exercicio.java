package reforco;

import java.util.Random;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random sortearNumero = new Random();
		
		int n = sortearNumero.nextInt(11);
		int x=0, digitado;
		
		System.out.println("Digite o número entre 0 a 10");
		
		while(x<3) {
			digitado = leia.nextInt();
			x++;
			if(digitado == n) {
				
				System.out.println("\n\nEstá correto, o numero é "+n);
				break;
			}else if(x<3){
				System.out.println("Digite o número novamente");
			}
			if(x==3) {
				System.out.println("O número correto era "+n);
			}
			
		}
		
		
		
	}

}
