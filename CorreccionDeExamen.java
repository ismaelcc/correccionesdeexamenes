
package correcciondeexamen;

import java.util.Scanner;


public class CorreccionDeExamen {

   
    public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
         boolean seguirComprando = true;
        while(seguirComprando){
            System.out.println("Bienvenido a la Cafeteria. Seleccione tu Cafe:");
            
            System.out.println("1. Cappuccino");
            System.out.println("2. Latte");
            System.out.println("3. Matcha");
            System.out.println("4. Salir");
            
            int opcion = scanner.nextInt();
            
            if(opcion ==4){
                seguirComprando = false;
                
                System.out.println("Gracias por su compra. Hata Pronto.");
            }else if (opcion >=1 && opcion <= 3){
                String[] sabores = {"Cappuccino", "Latte", "Matcha"};
                double [][] precios = {{23.30, 30.0, 37.5}, {32.5, 38.4, 42.5}, {41.5, 48.9, 52.5}};
                
                System.out.println("Seleccione el tamaño (CH/M/G): ");
                String tamaño = scanner.next();
                
                System.out.println("¿Desea leche deslactosada? (Si/No): ");  
                String leche = scanner.next();
                
                int saborElegido = opcion - 1;
                double precioCafe = precios[saborElegido][tamaño.equals("CH") ? 0 : (tamaño.equals("M") ? 1 : 2)];
                
                if(leche.equalsIgnoreCase("Si")){
                    precioCafe =+ 12.0; 
                }
                System.out.println("Cafe comprado: " + sabores[saborElegido]);
                System.out.println("Tipo de leche: " + 
                        (leche.equalsIgnoreCase("Si") ? "Deslactosada" : "Normal"));
                
                System.out.println("El total de la cuenta es de: $" + precioCafe);
            }else{
                System.out.println("Opcion no valida. Seleccione otra opcion.");
            
            }
            
        }
        scanner.close();
        
        
    }
}
