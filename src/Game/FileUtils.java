package Game;

import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class FileUtils {
    /**
     * This method has the ability to write to a file with a specific name
     *
     * @param name        file name
     * @param Information information of player
     * @throws FileNotFoundException
     */
    public void writeObject(String name, InformationPlayer Information) throws FileNotFoundException {
        try (FileOutputStream file = new FileOutputStream(name)) {
            ObjectOutputStream objectFile = new ObjectOutputStream(file);
//            objectFile.writeObject(Information);
            objectFile.writeObject(Information.getData());
            objectFile.writeObject(Information.getHandsOfCards());
            objectFile.writeObject(Information.isResultGame());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * This method has the ability to read from a file with a specific name
     *
     * @param name file name
     * @throws IOException
     */
    public void readObject(String name) throws IOException {
        try (FileInputStream file = new FileInputStream(name)) {
            ObjectInputStream objectFile = new ObjectInputStream(file);
            InformationPlayer note = (InformationPlayer) objectFile.readObject();
            System.out.println(note.getData());
            System.out.println(note.getHandsOfCards());
            System.out.println(note.isResultGame());
            System.out.println("\n");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method has the ability to create a directory
     *
     * @param name name file
     */
    public void creatDirectory(String name) {
        java.io.File file = new java.io.File(name);
        file.mkdirs();
    }


    /**
     * This method has the ability to return a list of directories in a specific address
     *
     * @param name name file
     * @return
     */
    public ArrayList<String> listDirectory(String name) {
        java.io.File file = null;
        String[] paths;
        ArrayList<String> ArrayPath = new ArrayList<>();
        try {
            file = new java.io.File(name);
            paths = file.list();
            for (String path : paths) {
                ArrayPath.add(path);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ArrayPath;
    }


    /**
     * This method has the ability to print a list of directories in a specific address
     *
     * @param name name file
     */
    public void printListDirectory(String name) {
        java.io.File file = null;
        String[] paths;
        try {
            file = new java.io.File(name);
            paths = file.list();
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method has the ability to delete a file at a specified address
     */
    public class DeleteFile {
        public void deleteFile(String name) {
            java.io.File file = new File(name);
            if (file.delete()) {
                System.out.println(("Deleted the file: " + file.getName()));
            } else
                System.out.println("Failed to delete the file.");
        }

    }
}
