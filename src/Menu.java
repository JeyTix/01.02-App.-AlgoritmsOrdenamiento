import java.util.Scanner;

public class Menu {
    public void menus()  {
        Scanner xd  = new Scanner(System.in);
        int opcion;
        int opcionMetodos;

        do {
            System.out.println("\n\t----- MENU -----");
            System.out.println("1. Ingresar arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion= xd.nextInt();

            switch(opcion){

                case 1:
                    System.out.println("\t\nIngresar Arreglo");
                    System.out.print("Ingrese el tamano: ");
                    int tamano= xd.nextInt();
                    arreglo= new int[tamano];
                    for(int  i= 0; i< tamano; i++){
                        System.out.print("Ingrese para la posicion "+(i+1)+": ");
                        arreglo[i]= xd.nextInt();
                    }
                    System.out.println("\nAreglo Principal: ");
                    for (int i= 0; i< tamano; i++){
                        System.out.print(arreglo[i]+" ,");
                    }
                    System.out.println();
                    break;

                case 2:
                    if (arreglo== null){
                        System.out.println("Primero debes de ingresar un arreglo");
                        break;
                    }
                    do {
                        System.out.println("\n\tEscoja un metodo de ordenamiento");
                        System.out.println("1. Metodo Burbuja");
                        System.out.println("2. Metodo Seleccion");
                        System.out.println("3. Metodo Insercion");
                        System.out.println("4. Metodo Burbuja Mejorado");
                        System.out.println("0. Regresar al menu principal");
                        System.out.print("Ingrese una opcion: ");
                        opcionMetodos= xd.nextInt();
                    
                        switch(opcionMetodos){
                            case 1:
                                System.out.println("\t\nMetodo Burbuja");
                                Burbuja b= new Burbuja();
                                int [] burbujaOrdenado= b.burbuja(arreglo);
                                mostrarArreglo(burbujaOrdenado);
                                break;
        
                            case 2:
                                System.out.println("\t\nMetodo Seleccion");
                                break;
                            case 3:
                                System.out.println("\t\nMetodo Insercion");
                                break;
                            case 4:
                                System.out.println("\t\nMetodo Burbuja Mejorado");
                        }
                    } while (opcionMetodos!=0);
                    
                case 0:
                    System.out.println("Opcion no valida. Ingrese nuevamente");
                    
            }
        } while (opcion!= 3);
        xd.close();
    }

    private void mostrarArreglo(int[] arreglo){
        for (int i= 0; i< arreglo.length; i++){
            System.out.println(arreglo[i]);
            if(i< arreglo.length-1){
                System.out.println(", ");
            }
        }
        System.out.println();
    }
}