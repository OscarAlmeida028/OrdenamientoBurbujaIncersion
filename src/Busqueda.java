public class Busqueda {

    /*public static int[] generarArreglos(int tam) {
        int[] arreglo = new int[tam];
        for (int i = 0; i < tam; i++) {
            arreglo[i] = i + 1;
        }
        return arreglo;
    }

    public String tiempoLinearVSBinary(){
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
                    "\nBúsqueda de objetivo por Linear Search completada en: "+linearTiempoResultado+" ns " +
                    "\nBúsqueda de objetivo por Binary Search completada en: "+binaryTiempoResultado+" ns\n";

        }
        return tiempo;
    }
}
