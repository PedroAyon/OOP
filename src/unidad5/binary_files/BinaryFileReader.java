package unidad5.binary_files;

import java.io.*;
import java.util.ArrayList;

public class BinaryFileReader {
    String path;

    public BinaryFileReader(String path) {
        this.path = path;
    }

    public ArrayList<Integer> readIntegers() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(path);
        DataInputStream dataInputStream =
                new DataInputStream(fileInputStream);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 9; i++)
            arrayList.add(dataInputStream.readInt());
        return arrayList;
    }
}
