package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Empresa;
import entities.Individual;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		
		System.out.print("Insira o número de contribuinte: ");
		int n = sc.nextInt();	
		
		for(int i=1; i<=n; i++) {
			System.out.print("Contribuinte #" + i + " data: ");
			System.out.print("Individual ou empresa (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("RendaAnual: ");
			double rendaAnual = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Despesas com Saúde: ");
		        double despesasSaude = sc.nextDouble();
		        list.add(new Individual(name, rendaAnual, despesasSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
		        int numeroDeFuncionarios= sc.nextInt();
		        list.add(new Empresa(name, rendaAnual, numeroDeFuncionarios));
			
			}			
			
			
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("Imposto pago: ");
		for(Contribuinte cont : list) {
			double tax = cont.tax();
			System.out.println(cont.getName() + ": $ " + String.format("%.2f", cont.tax()));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("Imposto total: $ " + String.format("%.2f",sum));
	
		sc.close();
	}
}
