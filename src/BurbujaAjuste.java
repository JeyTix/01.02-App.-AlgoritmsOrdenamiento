import java.util.Arrays;

public class BurbujaAjuste {
    public int[] burbujaAjusteAsc(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
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

    public int[] burbujaAjusteAscPa(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println(Arrays.toString(arreglo)+"  Valor a: "+arreglo[i]+"  Valor b: "+arreglo[j]);
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
            for (int j = 0; j < n - 1 - i; j++) {
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

    public int[] burbujaAjusteDesPa(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println(Arrays.toString(arreglo)+"  Valor a: "+arreglo[i]+"  Valor b: "+arreglo[j]);
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