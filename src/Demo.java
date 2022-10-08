import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        Journal j = new Journal();
        j.addEntry("first entry");
        j.addEntry("second entry");
        System.out.println(j);

        Persistence p = new Persistence();
        String fileName = "/Users/mcadek/Documents/test.txt";
        p.saveToFile(j, fileName, true);

        Runtime.getRuntime().exec("open /Users/mcadek/Documents/test.txt");
    }

}
