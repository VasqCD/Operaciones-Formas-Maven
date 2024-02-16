package hn.cvasquez.Operaciones_Formas_Maven;

import java.util.Scanner;

/**
 * OPERACIONES PARA CALCULAR EL AREA DE
 * TRIANGULO, CIRCULO, CUADRADO, RECTANGULO
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	Scanner leer = new Scanner(System.in);
    	
    	while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Calcular área de un triángulo");
            System.out.println("0. Salir");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                	/**
                	 * Radio de circulo valor predeterminado 0
                	 */
                    AreaCirculo(0);
                    break;
                case 2:
                    AreaCuadrado(0);
                    break;
                case 3:
                    AreaRectangulo(0,0);
                    break;
                case 4:
                    AreaTriangulo(0,0);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    public static double AreaCirculo(double radio) {
    	/**
    	 * Radio de circulo valor predeterminado 0
    	 */
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
        return area;
    }

    public static double AreaCuadrado(double lado) {
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es: " + area);
        return area;
    }

    public static double AreaRectangulo(double base, double altura) {
        
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
        return area;
    }

    public static double AreaTriangulo(double base, double altura) {
       
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
        return area;
    }
    
}
