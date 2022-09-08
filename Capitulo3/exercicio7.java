
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario,salT;
		double percI=0.10;
		double bonus = 50;
		
		System.out.println("Digite seu salário base:");
		salario=teclado.nextDouble();
		
		
		salT=salario-(salario*percI)+bonus;
		
		System.out.println("Seu salário total vai ser:"+salT);
		
		
		
		teclado.close();
		

	}
}