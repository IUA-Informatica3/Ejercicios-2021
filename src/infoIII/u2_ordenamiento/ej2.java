package infoIII.u2_ordenamiento;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

public class ej2 {
    public static void main(String[] args) {
        String filename = "es.txt.gz";
        String line;
        try {
            InputStream gzStream = new GZIPInputStream(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(new InputStreamReader(gzStream, StandardCharsets.UTF_8));

            long start = System.currentTimeMillis(); // para medir el tiempo de ejecución
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("demora: " + (System.currentTimeMillis() - start) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
