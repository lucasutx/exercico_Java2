import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double deposito,redimento;
		double taxa,total;
		
		
		System.out.println("Digite o valor do seu depósito:");
		deposito=teclado.nextDouble();
		
		System.out.println("Digite o valor da sua taxa:");
		taxa=teclado.nextDouble();
		
		
		redimento = deposito*taxa/100;
		total = redimento +deposito;
		System.out.println("O valor cm rendimento é:"+total);
		
		teclado.close();

	}

}
