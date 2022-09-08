import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double num1,num2,elevado1,elevado2;
		
		System.out.println("Digite seus dois número respectivamento:");
		
		num1=teclado.nextDouble();
		num2=teclado.nextDouble();
		elevado1=Math.pow(num1, num2);
		elevado2=Math.pow(num2, num1);
		
		System.out.printf("Seus valores são:%.2f \n",elevado1);
		System.out.printf("Seus valores são:%.2f",elevado2);
		
		teclado.close();
		

	}

}
