package test;
 import java.util.*;
 
 class subtrairDoisNumeros {
	 public static Scanner sc =new Scanner(System.in);
	 
	 public static void main (String args[]){
			//Declaracao de variaveis
			int num1, num2, subtracao;
			//Leituras
			System.out.println("Digite um número");
			num1 = sc.nextInt();
			System.out.println("Digite outro número");
			num2 = sc.nextInt();
			//Subtrair
			subtracao = num1 - num2;
			//Mostrar na tela
			System.out.println("Subtracao:" + subtracao);
			}

 }
 