import java.util.Random;

public class Ordenamiento {


    int[] arreglo;
    int[] arregloBurbuja;
    int[] arregloInsercion;


    public void generarArreglos() {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 10000);
        }
    }

    public void QuemarDatosNumDatos(int numDatos) {
        arreglo = new int[numDatos];
        Random rand = new Random();
        for (int i = 0; i < numDatos; i++) {
            arreglo[i] = rand.nextInt(10000);
        }
    }

    public void Burbuja() {
        arregloBurbuja = arreglo.clone();
        int n = arregloBurbuja.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arregloBurbuja[j] > arregloBurbuja[j + 1]) {
                    int temp = arregloBurbuja[j];
                    arregloBurbuja[j] = arregloBurbuja[j + 1];
                    arregloBurbuja[j + 1] = temp;
                }
            }
        }
    }

    public void Insercion() {
        arregloInsercion = arreglo.clone();
        int n = arregloInsercion.length;
        for (int i = 1; i < n; ++i) {
            int key = arregloInsercion[i];
            int j = i - 1;

            while (j >= 0 && arregloInsercion[j] > key) {
                arregloInsercion[j + 1] = arregloInsercion[j];
                j = j - 1;
            }
            arregloInsercion[j + 1] = key;
        }
    }

    public int[] mostrarArrBurbuja() {
        return arregloBurbuja;
    }

    public int[] mostrarArrInsercion() {
        return arregloInsercion;
    }

    public int[] getArreglo() {
        return arreglo;
    }


    /*public String tiempoLinearVSBinary() {
        int[] tamanios = {100, 1000, 10000, 100000};
        long linearTiempoIncio, linearTiempoFin, linearTiempoResultado;
        long binaryTiempoInicio, binaryTiempoFin, binaryTiempoResultado;
        String tiempo = "";
        for (int tam : tamanios) {
            int[] data = generarArreglos(tam);

            linearTiempoIncio = System.nanoTime();
            linearSearch(data, -1);
            linearTiempoFin = System.nanoTime();
            linearTiempoResultado = linearTiempoFin - linearTiempoIncio;

            //Arrays.sort(data);

            binaryTiempoInicio = System.nanoTime();
            binarySearch(data, -1);
            binaryTiempoFin = System.nanoTime();
            binaryTiempoResultado = binaryTiempoFin - binaryTiempoInicio;

            tiempo += "\nAreglo de tamaño: " + tam +
                    "\nBúsqueda de objetivo por Linear Search completada en: " + linearTiempoResultado + " ns " +
                    "\nBúsqueda de objetivo por Binary Search completada en: " + binaryTiempoResultado + " ns\n";

        }
        return tiempo;
    }*/
}

