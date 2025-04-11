package application;
import java.util.Scanner;
import entities.triangle;
public class programa {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 triangle x, y;
    	 x = new triangle();
    	 y = new triangle();
    	 System.out.println("Insira o valor do lado A do triangulo X:");
    	 x.A = sc.nextDouble();
    	 System.out.println("Insira o valor do lado B do triangulo X:");
    	 x.B = sc.nextDouble();
    	 System.out.println("Insira o valor do lado C do triangulo X:");
    	 x.C = sc.nextDouble();
    	 
    	 System.out.println("Insira o valor do lado A do triangulo Y:");
    	 y.A = sc.nextDouble();
    	 System.out.println("Insira o valor do lado B do triangulo Y:");
    	 y.B = sc.nextDouble();
    	 System.out.println("Insira o valor do lado C do triangulo Y:");
    	 y.C = sc.nextDouble();
    	 
    	 double areaX = x.area();

    	 System.out.println("A área do triângulo X é: " + areaX);
    	 double areaY = y.area();
    	 System.out.println("A área do triangulo Y é: " + areaY);
    	 
    	 
    	 
    	 sc.close();
    			 
     }
} 
