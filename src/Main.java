import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double height, weight, imc;
		char gender;
		String name;
		int age;
		
		System.out.printf("IMC Calculator%n");
		System.out.printf("Developed by: Nader Fares%n%n");
		
		System.out.printf("Enter your name: ");
		name = sc.nextLine();
		
		System.out.printf("Enter your age: ");
		age = sc.nextInt();
		
		System.out.printf("Enter your gender: (M / F) ");
		gender = sc.next().charAt(0);
		
		if (gender == 'M' || gender == 'F') {
			System.out.printf("Enter your height: ");
			height = sc.nextDouble();
			
			System.out.printf("Enter your weight: ");
			weight = sc.nextDouble();
			
			// Verifica se a entrada fornecida pelo usuário é positiva
			if (weight > 0 && height > 0) {
				imc = weight / (height * height);
				
				System.out.printf("%n%n|--------------------------%n");
				System.out.printf("| Name: %s%n", name);
				System.out.printf("| Age: %d%n", age);
				System.out.printf("| Gender: %c%n", gender);
				System.out.printf("| Your IMC is: %.2f%n", imc);
				
				// Classificação do IMC fornecido pelo usuário
				if (imc <= 18.5) {
					System.out.printf("| (Lower Than Expected)%n");
				} else if (imc > 24.9) {
					System.out.printf("| (Overweight)%n");
				} else {
					System.out.printf("| (Normal)%n");
				}
				
				System.out.printf("|--------------------------%n");
			} else {
				System.out.printf("Invalid Values");
			}
		} else {
			System.out.printf("Invalid Option");
		}
		
		sc.close();

	}

}
