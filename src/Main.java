import java.io.File;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    File file = new File("C:\\Users\\egefr\\IdeaProjects\\untitled2\\Что-то.txt");
    long timestamp = file.lastModified();
        System.out.println("Что-то.txt был в последний раз обновлен " + new Date(timestamp));
    }
}