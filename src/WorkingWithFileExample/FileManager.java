package WorkingWithFileExample;

import java.io.*;
import java.util.Scanner;

// This is not a best practice class. It is just for understanding file handling.
public class FileManager {
    public void createFile(){
        File file = new File("src/WorkingWithFileExample/students.txt");
        //Create new file.
        try {
            if(file.createNewFile()){
                System.out.println("Document created.");
            }else {
                System.out.println("Document already exist.");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("src/WorkingWithFileExample/students.txt");
        if(file.exists()){
            System.out.println("File name: "+file.getName());
            System.out.println("File path: "+file.getAbsolutePath());
            System.out.println("File write permission: "+file.canWrite());
            System.out.println("File size (byte): "+file.length());


        }
    }
    public static void readFile(){
        File file = new File("src/WorkingWithFileExample/students.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    //In the below method function overrides the file. Everything inside the file cleaned and new information added.
    public static void writeFile(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/WorkingWithFileExample/students.txt"));
            bufferedWriter.write("Ahmet");
            System.out.println("Write to File");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Now with an additional parameter "append = true" we can add information end of the file. Not override.
    public static void writeFile2(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/WorkingWithFileExample/students.txt",true));
            // Below line creates new line then writes. Otherwise, below information written to last line side by side.
            bufferedWriter.newLine();
            bufferedWriter.write("Ahmet");
            System.out.println("Write to File");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
