// Theo Brum 315141 y Juan Pablo Patri 266824
package Dominio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ArchivoGrabacion {
    public void exportarResultados(String puesto, ArrayList<String[]> resultadosExportar) {
        try {
            FileWriter fileWriter = new FileWriter("Consulta.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(puesto);
            bufferedWriter.newLine();
            
            for (int i = resultadosExportar.size() - 1; i >= 0; i--) {
                String[] resultado = resultadosExportar.get(i);
                bufferedWriter.write(Arrays.toString(resultado));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}