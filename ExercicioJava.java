import java.util.Scanner;

public class ExerciciosJava {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o valor hora: ");
    double valorHora = scan.nextDouble();

    System.out.println("Entre com a quantidade de horas trabalhadas no mes: ");
    double horas = scan.nextDouble();

    double salarioBruto = valorHora * horas;
    double inss = (salarioBruto / 100) * 8;
    double sindicato = (salarioBruto / 100) * 5;
    double IR = (salarioBruto / 100) * 11;
    double totalDescontos = inss + sindicato + IR;
    double salarioLiquido = salarioBruto - totalDescontos;


    System.out.println("O valor do salario Bruto é: " + salarioBruto);
    System.out.println("O valor do inss é: " + inss);
    System.out.println("O valor do sidicato é: " + sindicato);
    System.out.println("O valor do IR é: " + IR);
    System.out.println("O valor do total de descontos é: " + totalDescontos);
    System.out.println("O valor do salario liquido é: " + salarioLiquido);

    }
}