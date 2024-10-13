import java.util.Arrays;

public class BurbujaAjuste {
    public int[] burbujaAjusteAsc(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            System.out.println("Pasada "+ i );
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println(" j "+j+" [j] "+arreglo[j]+" j+1 = "+j+1+" [j+1] "+arreglo[j+1]);
                if (arreglo[j] > arreglo[j + 1]) {
                    // INTERCAMBIO
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
            if(!intercambio){
                break;
            }
        }
        return arreglo;
    }
    public int[] burbujaAjusteDes(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            System.out.println("Pasada "+ i );
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println(" j "+j+" [j] "+arreglo[j]+" j+1 = "+j+1+" [j+1] "+arreglo[j+1]);
                if (arreglo[j] < arreglo[j + 1]) {
                    // INTERCAMBIO
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
            if(!intercambio){
                break;
            }
        }
        return arreglo;
    }
}
