package infoIII.u2_ordenamiento;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

public class ej2 {
    public static void main(String[] args) {
        String filename = "eso.txt.gz";
        String line;
        ArrayList<String> palabras = new ArrayList<>();
        String[] arr;

        try {
            InputStream gzStream = new GZIPInputStream(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(new InputStreamReader(gzStream, StandardCharsets.UTF_8));

            while ((line = br.readLine()) != null) {
                palabras.add(line);
            }
            arr = palabras.toArray(new String[0]);
            long start = System.currentTimeMillis(); // para medir el tiempo de ejecución
            Sort.quicksort2(arr);
            System.out.println("demora: " + (System.currentTimeMillis() - start) + "ms");
            printArray(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <AnyType>
    void printArray(AnyType[] a) {
        for (AnyType n : a) {
            System.out.println(n);
        }
        System.out.print("\n");
    }
}
