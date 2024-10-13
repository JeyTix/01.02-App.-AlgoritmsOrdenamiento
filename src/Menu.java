import java.util.Scanner;

public class Menu {
    private int[] arreglo= null;
    public void menus()  {
        Scanner xd  = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n\t----- MENU -----");
            System.out.println("1. Ingresar arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion= xd.nextInt();

            switch(opcion){

                case 1:
                    ingrearA(xd);
                    break;

                case 2:
                    if (arreglo== null){
                        System.out.println("Primero debes de ingresar un arreglo");
                        break;
                    }else {
                        ordenarA(xd);
                    }
                    break;
                    
                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion!= 3);
        xd.close();
    }

    private void ingrearA(Scanner xd){
        System.out.println("\n\tIngresar Arreglo");
        System.out.print("Ingrese el tamano: ");
        int tamano= xd.nextInt();
        arreglo= new int[tamano];
        for(int  i= 0; i< tamano; i++){
            System.out.print("Ingrese para la posicion "+(i+1)+": ");
            arreglo[i]= xd.nextInt();
        }
        System.out.println("\nAreglo Principal: ");
        mostrarArreglo(arreglo);
    }
    
    private void ordenarA(Scanner xd){
        int opcionMetodos;
        int orden;
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
                    System.out.println("\n\tMetodo Burbuja");
                    Burbuja b= new Burbuja();
                    do {
                        System.out.println("/t/nEscoja Ascendente o Descendente");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("Burbuja Ascendete");
                                mostrarArreglo(b.burbujaAsc(arreglo));
                                break;

                            case 2:
                                System.out.println("Burbuja Descendente");
                                mostrarArreglo(b.burbujaDes(arreglo));
                                break;

                            case 3:
                                System.out.println("Regresando al menu de metodos...");
                                break;

                            default:
                                System.out.println("Opcion no valida. Escoja un orden");
                                break;
                        }
                    } while (orden!=3);
                    break;

                case 2:
                    System.out.println("\n\tMetodo Seleccion");
                    Seleccion s= new Seleccion();
                    do {
                        System.out.println("\n\tEscoja Ascendente o Descendente");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("\n\tSeleccion Ascendete");
                                mostrarArreglo(s.seleccionAsc(arreglo));
                                break;

                            case 2:
                                System.out.println("\n\tSeleccion Descendente");
                                mostrarArreglo(s.seleccionDes(arreglo));
                                break;

                            case 3:
                                System.out.println("Regresando al menu de metodos...");
                                break;

                            default:
                                System.out.println("Opcion no valida. Escoja un orden");
                                break;
                        }
                    } while (orden!=3);
                    break;

                case 3:
                    System.out.println("\n\tMetodo Insercion");
                    Insercion i= new Insercion();
                    do {
                        System.out.println("\n\tEscoja Ascendente o Descendente");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("\n\tInsercion Ascendete");
                                mostrarArreglo(i.insercionAsc(arreglo));
                                break;

                            case 2:
                                System.out.println("\n\tInsercion Descendente");
                                mostrarArreglo(i.insercionDes(arreglo));
                                break;

                            case 3:
                                System.out.println("Regresando al menu de metodos...");
                                break;

                            default:
                                System.out.println("Opcion no valida. Escoja un orden");
                                break;
                        }
                    } while (orden!=3);
                    break;

                case 4:
                    System.out.println("\n\tMetodo Burbuja Ajuste");
                    BurbujaAjuste bm= new BurbujaAjuste();
                    do {
                        System.out.println("\n\tEscoja Ascendente o Descendente");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("\n\tBurbja Ajuste Ascendete");
                                mostrarArreglo(bm.burbujaAjusteAsc(arreglo));
                                break;

                            case 2:
                                System.out.println("\n\tBurbja Ajuste Descendente");
                                mostrarArreglo(bm.burbujaAjusteDes(arreglo));
                                break;

                            case 3:
                                System.out.println("Regresando al menu de metodos...");
                                break;

                            default:
                                System.out.println("Opcion no valida. Escoja un orden");
                                break;
                        }
                    } while (orden!=3);
                    break;

                case 0:
                    System.out.println("Regresando al meni principal");
                    break;

                default:
                    System.out.println("Opcion Incorrecta");

            }
        } while (opcionMetodos!=0);
    }

    

    private void mostrarArreglo(int[] arreglo){
        System.out.print("[ ");
        for (int i= 0; i< arreglo.length; i++){
            System.out.print(arreglo[i]);
            if(i< arreglo.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}