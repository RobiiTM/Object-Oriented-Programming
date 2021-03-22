package evenimente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileEventWriter {
    public void write(List<Evenimente> evenimenteList) {
        File file = new File("C:/IT Schrool/GIT HUB & SOURCE TREE/event.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(evenimenteList);
        } catch (FileNotFoundException e) {
            System.out.println("Nu a gasit calea!");
        } catch (IOException e) {
            System.out.println("Nu a putut scrie in fisier!");
        }
    }

    public List<Evenimente> read() {
        File file = new File("C:/IT Schrool/GIT HUB & SOURCE TREE/event.txt");
        List<Evenimente> evenimenteList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            evenimenteList = (List<Evenimente>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu s-a gasit!");
        } catch (IOException e) {
            System.out.println("Nu se poate citi din fisier!");
        } catch (ClassNotFoundException e) {
            System.out.println("Clasa nu s-a gasit.");
        }
        return evenimenteList;
    }
}