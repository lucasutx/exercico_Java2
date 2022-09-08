import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			
			double not1,not2,not3,med;
			int peso1,peso2,peso3;
			
			System.out.println("Digite suas notas:");
			not1=teclado.nextDouble();
			not2=teclado.nextDouble();
			not3=teclado.nextDouble();
			
			System.out.println("Digite seus respectivos pesos:");
			peso1=teclado.nextInt();
			peso2=teclado.nextInt();
			peso3=teclado.nextInt();
			
			
			med= (not1*peso1+not2*peso2+not3*peso3)/(peso1+peso2+peso3);
			 System.out.printf("Sua media é: %.2f",med);
			
			
			teclado.close();

	}

}