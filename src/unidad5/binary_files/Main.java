package unidad5.binary_files;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static String filePath = System.getenv("HOME") + "/Documents/BinaryFile.dat";

    public static void main(String[] args) {
        // Crear archivo
        write(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        // Leer numeros desde el fichero y elevarlos al cuadrado
        ArrayList<Integer> numbers = readIntegers();
        for (int i = 0; i < numbers.size(); i++)
            numbers.set(i, (int) Math.pow(numbers.get(i), 2));

        // Sobreescribir los nuevos numeros
        write(numbers);

        // Comprobar que se guardaron los cambios
        numbers = readIntegers();
        for (Integer n : numbers)
            System.out.print(n + " ");
    }

    public static void write(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int n : array)
            arrayList.add(n);
        write(arrayList);
    }

    public static void write(ArrayList<Integer> arrayList) {
        BinaryFileWriter binaryFileWriter = new BinaryFileWriter(filePath);
        try {
            binaryFileWriter.writeIntegers(arrayList);
        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e);
        }
    }

    public static ArrayList<Integer> readIntegers() {
        BinaryFileReader binaryFileReader = new BinaryFileReader(filePath);
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            arrayList = binaryFileReader.readIntegers();
        } catch (IOException e) {
            System.out.println("Ocurrio un error: " + e);
        }
        return arrayList;
    }

}
