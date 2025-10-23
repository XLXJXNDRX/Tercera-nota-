package unidad3;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class actividad2{

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

class DataLoader {
    /**
     * @param filename
     * @throws IOException
     * @throws EmptyFileException
     */
    public void loadFile(String filename) throws IOException, EmptyFileException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            if (line == null) {
                throw new EmptyFileException("El archivo está vacío.");
            }
            System.out.println("Archivo cargado con éxito.");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    
                }
            }
        }
    }
}}
