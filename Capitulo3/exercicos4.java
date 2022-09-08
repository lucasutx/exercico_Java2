import java.util.Scanner;

public class exercicos4 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			
			double sal,salT;
			double perc = 0.25;
			
			System.out.println("Digite seu salário::");
			sal = teclado.nextDouble();
			
			salT=(sal*perc)+sal;
			
			
			
			
			
			 System.out.printf("Seu salário com o aumento é %.2f",salT);
			
			
			teclado.close();

	}

}