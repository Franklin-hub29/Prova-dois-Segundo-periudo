package Questao1;
import java.util.Scanner;

import modelos.Modelos;
import motor.Motor;

public class Questao1 {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Modelos[] carros = new Modelos[50];
		
		int opcao =0;
		
		int possicao=0;
		
		do {
			menu();
			opcao = entrada(scanner);
			
			if(opcao == 1) {
				cadastrarVeiculo(scanner , carros ,possicao);
				possicao++;
				
			}else if(opcao == 2) {
				printCad(carros, possicao);
				
				
			} else if(opcao ==3) {
				exluiCad(scanner,carros,possicao);
				
			}
			
			
		}while(opcao !=4);
		
		
		scanner.close();
		
		
		
		
	}
	
	
	public static void menu() {
		
		System.out.println("(01) Cadastro de veículo ");
		System.out.println("(02) Lista todos veiculos");
		System.out.println("(03) REmover veículo cadastrado");
		System.out.println("04) Sair");
		
	}
	
	public static void cadastrarVeiculo(Scanner scanner , Modelos[] carrosA , int possicao) {
		
		System.out.println("Cadastro de Veículos");
		
		Modelos carros = new Modelos();
		
		Motor motores = new Motor();
		
		System.out.println("Informe a marca do Carro");
		carros.marca = scanner.nextLine();
		
		System.out.println("Imforme a cor do carro");
		carros.cor = scanner.nextLine();
		
		System.out.println("Informe o ano de fabricação");
		carros.ano = entrada(scanner);
		
		System.out.println("Infome ano modelo");
		carros.anoMod = entrada(scanner);
		
		System.out.println("Motor");
		System.out.println("Potência");
		motores.potencia = entrada(scanner);
		System.out.println("Quantidade de cilindros");
		motores.cilindros = entrada(scanner);
		
		carrosA [possicao] = carros;
		
		
		
		
		
		
		
		
	}
	
	
	public static int entrada(Scanner scanner) {
		
		int dadosInt = scanner.nextInt();
		scanner.nextLine();
		return dadosInt;
	}
	
	public static void exluiCad(Scanner scanner , Modelos[] carros,int indArr) {
		System.out.println("Informe o Medelo a ser removido");
		int mod = entrada(scanner);
		boolean carroExcluido = false;
		for(int i =0;i<indArr;i++) {
			Modelos modelos = carros[i];
			if(modelos.marca.equals(scanner){
				carros[i] = null;
				System.out.println("Modelo removido!!");
				break;
				
				
			}
			
		}
		
	}
	
	public static void printCad(Modelos[] carrosI,int possicao) {
		
		Modelos carros = new Modelos();
		Motor motores = new Motor();
		System.out.println("Carros cadastrados ");
		
		for(int i=0;i < possicao;i++) {
			System.out.println("Carros" + (i+1)+":");
			
			
			Modelos carro = carrosI[i];
			
			System.out.println("Marca"+carros.marca);
			System.out.println("Cor" +carros.cor);
			System.out.println("Ano de fabricação"+carros.ano);
			System.out.println("Modelos ano"+carros.anoMod);
			System.out.println("Motor, potência "+motores.potencia+"Cilindros"+motores.cilindros);
			
			
		}
	}
	
	

}





















