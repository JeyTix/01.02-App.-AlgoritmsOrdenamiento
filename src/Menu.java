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
            System.out.print("Ingrese para la posicion "+(i)+": ");
            arreglo[i]= xd.nextInt();
        }
        System.out.println("\nAreglo Principal: ");
        mostrarArreglo(arreglo);
    }
    
    private void ordenarA(Scanner xd){
        int opcionMetodos;
        int orden;
        int pasos;
        do {
            System.out.println("\n\t*** Escoja un metodo de ordenamiento ***");
            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Metodo Seleccion");
            System.out.println("3. Metodo Insercion");
            System.out.println("4. Metodo Burbuja Mejorado");
            System.out.println("0. Regresar al menu principal");
            System.out.print("Ingrese una opcion: ");
            opcionMetodos= xd.nextInt();
        
            switch(opcionMetodos){
                case 1:
                    System.out.println("\n\tMETODO BURBUJA");
                    Burbuja b= new Burbuja();
                    do {
                        System.out.println("\n\t*** Escoja Ascendente o Descendente ***");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("\n\t*** Burbuja Ascendete ***");
                                mostrarArreglo(b.burbujaAsc(arreglo));
                                do { 
                                    System.out.println("\n\t*** Quieres ver los pasos ? ***");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t*** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t*** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
                                break;

                            case 2:
                                System.out.println("\n\t*** Burbuja Descendente ***");
                                mostrarArreglo(b.burbujaDes(arreglo));
                                do { 
                                    System.out.println("\n\t*** Quieres ver los pasos ? ***");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t*** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t*** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
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
                    System.out.println("\n\tMETODO SELECCION");
                    Seleccion s= new Seleccion();
                    do {
                        System.out.println("\n\t*** Escoja Ascendente o Descendente ***");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("\n\t*** Seleccion Ascendete ***");
                                mostrarArreglo(s.seleccionAsc(arreglo));
                                do { 
                                    System.out.println("\n\t*** Quieres ver los pasos ? ***");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t*** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t*** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
                                break;

                            case 2:
                                System.out.println("\n\t*** tSeleccion Descendente ***");
                                mostrarArreglo(s.seleccionDes(arreglo));
                                do { 
                                    System.out.println("\n\t*** Quieres ver los pasos ? ***");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t*** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t*** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
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
                    System.out.println("\n\tMETODO INSERCION");
                    Insercion i= new Insercion();
                    do {
                        System.out.println("\n\t*** Escoja Ascendente o Descendente ***");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("\n\t*** Insercion Ascendete ***");
                                mostrarArreglo(i.insercionAsc(arreglo));
                                do { 
                                    System.out.println("\n\t*** Quieres ver los pasos ? ***");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t*** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t*** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
                                break;

                            case 2:
                                System.out.println("\n\t*** Insercion Descendente ***");
                                mostrarArreglo(i.insercionDes(arreglo));
                                do { 
                                    System.out.println("\n\t*** Quieres ver los pasos ? ***");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t*** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t*** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
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
                    System.out.println("\n\tMETODO BURBUJA AJUSTE");
                    BurbujaAjuste bm= new BurbujaAjuste();
                    do {
                        System.out.println("\n\t*** Escoja Ascendente o Descendente ***");
                        System.out.println("1. Ascendente");
                        System.out.println("2. Descendente");
                        System.out.println("3. Regresar al menu de metodos");
                        orden= xd.nextInt();
                        switch (orden) {
                            case 1:
                                System.out.println("\n\t*** Burbja Ajuste Ascendete ***");
                                mostrarArreglo(bm.burbujaAjusteAsc(arreglo));
                                do { 
                                    System.out.println("\n\t*** Quieres ver los pasos ? ***");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t*** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t*** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
                                break;

                            case 2:
                                System.out.println("\n\t*** Burbuja Ajuste Descendente ***");
                                mostrarArreglo(bm.burbujaAjusteDes(arreglo));
                                do { 
                                    System.out.println("\n\tQuieres ver los pasos");
                                    System.out.println("1. Si");
                                    System.out.println("2. No");
                                    System.out.println("3. Regresar al menu anterior");
                                    pasos= xd.nextInt();
                                    switch (pasos) {
                                    case 1:
                                        System.out.println("\n\t** Mostrando pasos del arreglo ***");
                                        break;

                                    case 2:
                                        System.out.println("\n\t** No se mostrara pasos del arreglo ***");
                                        break;

                                    case 3:
                                        System.out.println("Regresando al menu anterior...");

                                    default:
                                        System.out.println("Ingrese una opcion valida");
                                        break;
                                    }
                                    
                                } while (pasos!=3);
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
                    System.out.println("Regresando al menu principal");
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
        System.out.println(" ]\n");
    }
}