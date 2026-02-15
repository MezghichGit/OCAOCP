package day15022026;

import java.io.*;
import java.nio.charset.Charset;

public class Utf8ReaderWriterExample {

    public static void main(String[] args) {

        Charset utf8 = Charset.forName("UTF-8");
        String fileName = "utf8.txt";

        // --- Écriture ---
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fileName), utf8))) {

            writer.write("Bonjour");
            writer.newLine();
            writer.write("Café");
            writer.newLine();
            writer.write("こんにちは");

            System.out.println("Écriture terminée.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Lecture ---
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), utf8))) {

            String line;
            System.out.println("\nLecture du fichier :");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
