
package correcciondos;

import java.util.Scanner;


public class CorreccionDos {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        boolean seguirComprando = true;
        while(seguirComprando){
            System.out.println("Bienvenido al cine. Seleccione su combo:");
            
            System.out.println("1. Soltero");
            System.out.println("2. Pareja");
            System.out.println("3. Estudiante");
            System.out.println("4. Salir");
            
            int opcion = scanner.nextInt();
            
            if(opcion ==4){
                seguirComprando = false;
                
                System.out.println("Gracias por tu visita. Hata Pronto.");
            }else if (opcion >=1 && opcion <= 3){
                String[] combos = {"Solteros", "Pareja", "Estudiante"};
                double [][] precios = {{250.0, 266.5, 288.0}, {380.3, 390.5, 410.5}, {100.0, 115.3, 122.7}};
                
                System.out.println("Seleccione el tamaño (CH/M/G): ");
                String tamaño = scanner.next();
                
                System.out.println("¿Desea aumentar el tamaño de sus palomintas? (Si/No): ");  
                String aumentarPalomitas = scanner.next();
                
                int comboElegido = opcion - 1;
                double precioCombo = precios[comboElegido][tamaño.equals("CH") ? 0 : (tamaño.equals("M") ? 1 : 2)];
                
                if(aumentarPalomitas.equalsIgnoreCase("Si")){
                    precioCombo =+ 15.0; 
                }
                System.out.println("Combo comprado: " + combos[comboElegido]);
                System.out.println("¿Aumento el tamaño de las palomitas? " + 
                        (aumentarPalomitas.equalsIgnoreCase("Si") ? "Si" : "No"));
                
                System.out.println("El total de la cuenta es de: $" + precioCombo);
            }else{
                System.out.println("Opcion no valida. Seleccione otra opcion.");
            
            }
            
        }
        scanner.close();
    }
}

