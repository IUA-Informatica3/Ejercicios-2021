package infoIII.u3_ordenamiento;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
/**
 * 2. Utilice los métodos de ordenación creados para ordenar los siguientes 3 archivos y evaluae el tiempo
 * que demora cada algoritmo en cada caso.
 *
 *         | Archivo    | Descrpición | Inserción | Shellsort | Quicksort |
 *         |------------|-------------|-----------|-----------|-----------|
 *         | es.txt.gz  | desordenado |           |           |           |
 *         | eso.txt.gz | ordenado    |           |           |           |
 *         | esi.txt.gz |orden inverso|           |           |           |
 */

public class ej2 {
    public static void main(String[] args) {
        String[] filenames = new String[]{"es100k.txt.gz", "eso100k.txt.gz", "esi100k.txt.gz",};
        String line;
        ArrayList<String> palabras = new ArrayList<>();
        String[] arr;
        long start, end;

        for (String filename : filenames) {
            System.out.println("\uD83E\uDDEA Testing: " + filename);
            try {
                InputStream gzStream = new GZIPInputStream(new FileInputStream(filename));
                BufferedReader br = new BufferedReader(new InputStreamReader(gzStream, StandardCharsets.UTF_8));

                while ((line = br.readLine()) != null) {
                    palabras.add(line);
                }
                arr = palabras.toArray(new String[0]);

                // Insertion Sort
                System.out.print("\uD83D\uDE14 Insertion: ");
                start = System.currentTimeMillis();
                Sort.insertionSort(arr);
                end = System.currentTimeMillis();
                System.out.println((end - start) + "ms");

                // Shell Sort
                System.out.print("\uD83E\uDD28 Shell: ");
                start = System.currentTimeMillis();
                Sort.shell(arr);
                end = System.currentTimeMillis();
                System.out.println((end - start) + "ms");

                // Quick Sort
                System.out.print("\uD83D\uDE0A QuickSort: ");
                start = System.currentTimeMillis();
                Sort.quicksort2(arr);
                end = System.currentTimeMillis();
                System.out.println((end - start) + "ms");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
