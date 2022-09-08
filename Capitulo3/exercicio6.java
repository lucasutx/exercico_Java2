import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double salario,salG,salI,salT;
		double percG=0.05,percI=0.07;
		
		System.out.println("Digite seu salário base:");
		salario=teclado.nextDouble();
		
		salG= (salario*percG);
		salI= (salario*percI);
		salT = salario+salG-salI;
		
		
		System.out.println("Seu salário total vai ser:"+salT);
		
		
		
		teclado.close();
		

	}

}
