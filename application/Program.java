/* Rio de Janeiro, Dia 12/01/2023
Terceira versão do programa.
Membros estáticos

Também chamados de membros de classe 
- Em oposição a membros e instância

São membros que fazem sentido independentemente de objetos.
Não precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe.

Aplicações comuns:
- Classes utilitárias - Exemplo: Math.sqrt(dobule)
- Declaração de constantes

Uma classe que possui somente membros estáticos, pode ser uma classe estática também.
Esta classe não poderá ser instanciada.

Problema exemplo:

Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor de uma circunferência e do volume de uma esfera para um raio daquele valor.
Informar também o valor de PI com duas casas decimais.

Exemplo:
Enter radius: 3.0
Circumference: 18.84
Volume: 113.04
PI value: 3.14

Checklist

- Versão 1: métodos na própria classe do programa
Nota: dentro de um método estático você não pode chamar mebros de instância da mesma classe.

- Versão 2: classe Calculator com membros de instância

- Versão 3: classe Calculator com método estático */


package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = teclado.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		teclado.close();

	}

}