import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    public static int[] bubbleSort(int[] datos){
        int auxiliar;
        boolean intercambio;
        do {
            intercambio = false;
            for(int i = 0; i < datos.length - 1; i++){
                if(datos[i] > datos[i + 1]){
                    auxiliar = datos[i];
                    datos[i] = datos[i + 1];
                    datos[i + 1] = auxiliar;
                    intercambio = true;
                }
            }
            imprimirMatriz(datos);
        } while(intercambio);
        return datos;
    }

    public static void imprimirMatriz(int[] datos) {
        System.out.println("----------------------- \n Valores del arreglo");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("i:" + i + " datos[i]:" + datos[i]);
        }
        System.out.println("----------------------- \n");
    }

    public static int[] leerArreglo(int[] datos) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Lectura de datos del arreglo");
        for(int i = 0; i < datos.length; i++){
            System.out.println("Escribe el valor [" + i + "]: ");
            entrada = buffer.readLine();
            datos[i] = Integer.parseInt(entrada);
        }
        return datos;
    }

    public static void main(String[] args) throws IOException {
        int n;
        int[] datos;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Método Bubble Sort");
        System.out.println("Ingrese la cantidad de datos a ordenar: ");
        entrada = buffer.readLine();
        n = Integer.parseInt(entrada);

        datos = new int[n];
        datos = leerArreglo(datos);
        datos = bubbleSort(datos);
    }
}
