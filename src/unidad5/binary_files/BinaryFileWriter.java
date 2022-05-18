package unidad5.binary_files;

import java.io.*;
import java.util.ArrayList;

public class BinaryFileWriter {
    String path;

    public BinaryFileWriter(String path) {
        this.path = path;
    }

    public void writeIntegers(ArrayList<Integer> arrayList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        for (int n : arrayList)
            dataOutputStream.writeInt(n);
        dataOutputStream.close();
        fileOutputStream.close();
    }
}
