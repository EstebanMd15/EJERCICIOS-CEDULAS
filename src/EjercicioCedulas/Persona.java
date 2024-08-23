
package EjercicioCedulas;

import java.util.Scanner;

public class Persona {
    int cedulas[] = new int[5];
    Scanner in = new Scanner(System.in);
    
void guardarCedulas(){
    int ced;
    for (int i = 0; i < cedulas.length; i++) {
        System.out.println("Digite la cedula");
        ced = in.nextInt();
        cedulas[i] = ced;
    }
    System.out.println("Datos guardados!!");
}
void listarCedulas(){
    System.out.println("----Listando las cedulas guardadas----");
    for(int cc : cedulas){
        System.out.println(cc + " - ");
    }
}
void buscarCedula(){
    System.out.println("---Buscar Cedula---");
    System.out.println("Digite la cedula a buscar");
    int cedBuscar = in.nextInt();
    
    boolean bandera = false;
    for (int i = 0; i < cedulas.length; i++) {
        //comparo. Los numeros se compara con el == NO con equals
        if(cedBuscar == cedulas[i])
        //cambio el estado de la bandera
        bandera = true;
            
        }//cierra el for
        //verifico la bandera 
        if(bandera == true)
            System.out.println("La cedula esta registrada");
        else
            System.out.println("Cedula NO REGISTRADA");
        
    }
//MENU
void mostrarMenu(){
    int opcion;
    do {
    System.out.println("---MENU DE OPCIONES---");
    System.out.println("1. Guardar cedulas");
    System.out.println("2. Mostrar cedulas");
    System.out.println("3. Buscar cedulas");
    System.out.println("4. Salir");
    
    System.out.println("\nDigite una opcion: ");
    opcion = in.nextInt();
    
    switch (opcion){
        case 1:
            this.guardarCedulas();
            break;
        case 2:
            this.listarCedulas();
            break;
        case 3:
            this.buscarCedula();
            break;
           
    }
} while(opcion > 0 && opcion < 4);
    

}
}

