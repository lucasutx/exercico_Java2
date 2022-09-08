import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			
			double salp,sal,salT;
			double perc;
			
			System.out.println("Digite seu salário::");
			sal = teclado.nextDouble();
			
			System.out.println("Digite o percentual de aumento");
			perc = teclado.nextDouble();
			
			
			perc= perc/100;
			salp=sal*perc;
			salT=(sal*perc)+sal;
			
			System.out.printf("O aumento foi de: %.2f \n",salp);
			 System.out.printf("Seu salário com o aumento é %.2f",salT);
			
			
			teclado.close();

	}

}