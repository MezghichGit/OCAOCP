package day14022026;

import java.io.*;

public class CopyFileSample {

    public static void copy(File source, File destination) throws IOException {

        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {

            int b;

            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    public static void main(String[] args) throws IOException {
          //D:\OCP\OCA-OCP-2021\src\day14022026
        File source = new File("D:\\OCP\\OCA-OCP-2021\\src\\day14022026\\Zoo.java");
        File destination = new File("D:\\OCP\\OCA-OCP-2021\\src\\day14022026\\ZooCopy.java");

        copy(source, destination);
    }
}
