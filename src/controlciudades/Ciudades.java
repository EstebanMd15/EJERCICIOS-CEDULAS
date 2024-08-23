package controlciudades;

import java.util.Scanner;

public class Ciudades {

    String ciudades[] = new String[3];
    Scanner in = new Scanner(System.in);

    //Metodo para guardar ciudades
    void guardarCiudades() {
        String city;
        //ciudades.length: obtiene el tamaño 
        //del arreglo. En este caso 5
        for (int i = 0; i < ciudades.length; i++) {
            System.out.print("Digite la ciudad: ");
            city = in.next();

            //la guardo en el arreglo
            ciudades[i] = city;
        }
        System.out.println("Datos Guardados!!!");
    }

    //Metodo para listar ciudades
    void listarCiudades() {
        System.out.println("---Listando las ciudades guardadas ---");
        for (String ciud : ciudades) {
            System.out.print(ciud + " - ");
        }
    }

    //metodo para buscar una ciudad
    void buscarCiudad() {
        System.out.println("---Buscar Ciudad---");
        System.out.print("Digite la ciudad a buscar: ");
        String city = in.next();

        boolean bandera = false;  //variable de control
        for (int i = 0; i < ciudades.length; i++) {
            //Comparamos la ciudad que digito el usuario
            //con cada ciudad guardada en el arreglo
            if (city.equalsIgnoreCase(ciudades[i])) {
                bandera = true;
            }
        }
        
        //mensaje
        if(bandera == true)
            System.out.println("La ciudad esta registrada!!!");
        else
            System.out.println("La ciudad NO esta registrada!!!");
    }

    //Menu
    void mostrarMenu() {
        int opcion;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Guardar Datos");
            System.out.println("2. Mostrar datos guardados");
            System.out.println("3. Buscar");
            System.out.println("4. Salir");

            System.out.print("\nDigite una opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1: //llamo al metodo para guardar
                    this.guardarCiudades();
                    break;
                case 2: //llamo al metodo para listar
                    this.listarCiudades();
                    break;
                case 3: //llamo al metodo 
                    this.buscarCiudad();
                    break;
            }
        } while (opcion > 0 && opcion < 4);

    }

}
