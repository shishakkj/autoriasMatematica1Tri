import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sla = new Scanner(System.in);
	    System.out.println("Escolha uma forma de conversão: \n[1] - Radianos para graus\n[2] - Graus para radianos");
	    int escolha = sla.nextInt();
	    if(escolha == 1){
	        radGrau();
	    }
	    else if(escolha == 2){
	        grauRad();
	    }
	    else{
	        System.out.println("Por favor insira um valor válido");
	    }
	}
	public static void radGrau(){
	    Scanner sla = new Scanner(System.in);
	    System.out.println("\nQual o valor do radiano?: ");
	    double rad = sla.nextInt();
	    double resultado = rad * (180/3.14);
	    System.out.println("\n"+rad+" convertido em graus fica "+resultado);
	}
	public static void grauRad(){
	    Scanner sla = new Scanner(System.in);
	    System.out.println("\nQual o valor do ângulo?: ");
	    double ang = sla.nextDouble();
	    double resultado = Math.toRadians(ang);
	    System.out.println("\n"+ang+" convertido em radianos fica "+resultado);
	}
}