import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class IsoContest {

    static boolean isLocal = false;
    static String LOCAL_LOG_PREFIX = ":::::";
    static String[] lines;
    static ArrayList<String> listLine;

    static String line1;
    static String line2;
    static String line3;


    public static void main(String[] argv) throws Exception {
        readInput(argv);
        answer();
    }

    public static void answer() {
        localLog("Dummy local log");

        // Line 1
        // String line1 = lines[0];

        // Line 2
        // String line2 = lines[1];

        // Answer
        log("answer");
    }


    public static void readInput(String[] argv) throws FileNotFoundException {
        // Récupération du scanner
        Scanner scanner;
        if (argv.length > 0) {
            isLocal = true;
            String inputFile = argv[0];
            localLog("Input file: " + inputFile);
            scanner = new Scanner(new java.io.File(inputFile));
        } else {
            scanner = new Scanner(System.in);
        }

        // Récupération des lignes
        listLine = new ArrayList<>();
        while (scanner.hasNextLine()) {
            listLine.add(scanner.nextLine());
        }
        scanner.close();
        lines = listLine.toArray(new String[listLine.size()]);
    }

    public static void log(Object object) {
        System.out.println(object);
    }

    public static void log() {
        System.out.println();
    }

    public static void localLog(Object object) {
        if (isLocal) System.out.println(LOCAL_LOG_PREFIX + object);
    }

    public static void localLog() {
        if (isLocal) System.out.println(LOCAL_LOG_PREFIX);
    }
}
