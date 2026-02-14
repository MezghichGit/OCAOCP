package day14022026;

import java.io.*;

public class CopyBufferFileSample {

    public static void copy(File source, File destination) throws IOException {

        try (
            InputStream in = new BufferedInputStream(new FileInputStream(source));
            OutputStream out = new BufferedOutputStream(
                    new FileOutputStream(destination))
        ) {

            byte[] buffer = new byte[1024];
            int lengthRead;

            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
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
